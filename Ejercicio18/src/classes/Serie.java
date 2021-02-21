package classes;

import interfaces.Entregable;

public class Serie implements Entregable {

    final int NUMERO_TEMPORADAS = 3;

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = NUMERO_TEMPORADAS;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = NUMERO_TEMPORADAS;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador ;
    }

    public boolean entregar() {
        return this.entregado = true;
    }

    public boolean devolver() {
        return this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object serie) {
        Serie serieA = (Serie) serie;
        if (getNumeroTemporadas() == serieA.getNumeroTemporadas()) {
            return 0;
        } else if (getNumeroTemporadas() > serieA.getNumeroTemporadas()) {
            return 1;
        } else if (getNumeroTemporadas() < serieA.getNumeroTemporadas()) {
            return -1;
        }
        return 0;
    }

}
