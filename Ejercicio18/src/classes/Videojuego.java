package classes;

import interfaces.Entregable;

public class Videojuego implements Entregable {

    final int HORAS_ESTIMADAS = 10;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia ;
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

    public int compareTo(Object videoJuegoB) {
        Videojuego videoJuegoA = (Videojuego) videoJuegoB;
        if (getHorasEstimadas() == videoJuegoA.getHorasEstimadas()) {
            return 0;
        } else if (getHorasEstimadas() > videoJuegoA.getHorasEstimadas()) {
            return 1;
        } else if (getHorasEstimadas() < videoJuegoA.getHorasEstimadas()) {
            return -1;
        }
        return 0;
    }
}
