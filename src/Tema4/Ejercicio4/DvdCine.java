package Tema4.Ejercicio4;


import java.util.Arrays;

public class DvdCine {
    private String titulo;
    private String director;
    private String productora;
    private String actoresPrincipales;
    private String genero;
    private String resumen;
    private int [] duracion;


    public DvdCine(String titulo, String director, String productora, String actoresPrincipales, String genero,
                   String resumen, int [] duracion) {

        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.actoresPrincipales = actoresPrincipales;
        this.genero = genero;
        this.titulo = resumen;
        this.duracion=duracion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int[] getDuracion() {
        return duracion;
    }

    public void setDuracion(int[] duracion) {
        this.duracion = duracion;
    }

    public boolean esThriller(){
        return this.genero.equalsIgnoreCase("Thriller");
    }

    public boolean mimsaProductora(DvdCine AnaTomate){
        return this.productora.equals(AnaTomate.getProductora());
    }

    @Override
    public String toString() {
        return "DvdCine{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", productora='" + productora + '\'' +
                ", actoresPrincipales='" + actoresPrincipales + '\'' +
                ", genero='" + genero + '\'' +
                ", resumen='" + resumen + '\'' +
                ", duracion=" + Arrays.toString(duracion) +
                '}';
    }
}
