package h.alberto.svalero.com.plantillamvpretrofitcines.beans;

import java.io.Serializable;

public class Film implements Serializable {


    private String titulo;
    private String trailer;
    private String sinopsis;
    private String fechaEstreno;
    private String url;
    private int duracion;
    private int nVotos;
    private int sPuntuacion;
    private int id_genero;
    private int id_publico;
    private int id;
    private double precio;


    public Film(String url, String titulo, int sPuntuacion) {
        this.url = url;
        this.titulo = titulo;
        this.sPuntuacion = sPuntuacion;
    }


    public Film(String url, String titulo, int visitas, String trailer, int duracion,
                double precio, int sPuntuacion, String sinopsis,String fechaEstreno) {
        this.url = url;
        this.titulo = titulo;

        this.trailer = trailer;
        this.duracion = duracion;
        this.precio = precio;
        this.sPuntuacion = sPuntuacion;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
    }

    public Film(String titulo,String trailer,String sinopsis,String fechaEstreno,String url,int duracion,
                int nVotos,int sPuntuacion,int id_genero,int id_publico,double precio )
    {

        this.titulo = titulo;
        this.trailer = trailer;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.url = url;
        this.duracion = duracion;
        this.nVotos=nVotos;
        this.sPuntuacion = sPuntuacion;
        this.id_genero=id_genero;
        this.id_publico=id_publico;
        this.precio = precio;



    }




    public Film() {
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getsPuntuacion() {
        return sPuntuacion;
    }

    public void setsPuntuacion(int sPuntuacion) {
        this.sPuntuacion = sPuntuacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getnVotos() {
        return nVotos;
    }

    public void setnVotos(int nVotos) {
        this.nVotos = nVotos;
    }

    public int getId_genero() {
        return id_genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId_publico() {
        return id_publico;
    }

    public void setId_publico(int id_publico) {
        this.id_publico = id_publico;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
