package h.alberto.svalero.com.plantillamvpretrofitcines.login_user;

import com.yolandasoberon.feedbackcinesaragon.beans.Usuario;
import com.yolandasoberon.feedbackcinesaragon.network.ApiClient;
import com.yolandasoberon.feedbackcinesaragon.network.ApiInterfaceUser;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginModel implements LoginContract.Model {

    private  OnLoginUserListener onLoginUserListener;

    Usuario usuario;

    @Override
    public void getUsuarioService(final OnLoginUserListener onLoginUserListener,Usuario usuario) {
        /*Ejecuto Webservice con retrofit*/
        ApiInterfaceUser apiService = ApiClient.getClient().
                create(ApiInterfaceUser.class);
        //petición asíncrona.
        Call<ArrayList<Usuario>> call = apiService.login(usuario);
        call.enqueue(new Callback<ArrayList<Usuario>>() {
            public void onResponse(Call<ArrayList<Usuario>> call,
                                   Response<ArrayList<Usuario>> response) {

                ArrayList<Usuario> usuarios = response.body();// Aquí tengo el JSON
                if(usuarios!=null){

                    onLoginUserListener.onFinished(usuarios);

                }else{
                    //OnLoginListener.onFinished(null);
                    onLoginUserListener.onFailure("Fallo: Login");
                }
            }




            @Override
            public void onFailure(Call<ArrayList<Usuario>> call, Throwable t) {

            }


        });

    }






}
