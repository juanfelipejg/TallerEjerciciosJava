package main;

import classes.Serie;
import classes.Videojuego;

public class Main {
    public static void main(String[] args) {

        int contadorSeries = 0;
        int contadorVideoJuegos = 0;
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Vikings", 7, "Ficción", "Michael Hirst");
        series[2] = new Serie("Juego de tronos", "George R. Martin");
        series[3] = new Serie("Breaking Bad", 4, "Drama", "Vince Gilligan");
        series[4] = new Serie("Peaky Blinders", 3, "Drama", "Steven Knight");

        videojuegos[0] = new Videojuego("Resident Evil", 30, "Supervivencia", "Capcom");
        videojuegos[1] = new Videojuego("PUBG", 2);
        videojuegos[2] = new Videojuego("FIFA 21", 30);
        videojuegos[3] = new Videojuego("God of war", 35, "Acción", "SIE Santa Monica Studio");
        videojuegos[4] = new Videojuego("The last of us", 40, "Aventura", " Naughty Dog");

        series[0].entregar();
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();
        series[4].entregar();

        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                contadorSeries++;
                series[i].devolver();
            }
            if (videojuegos[i].isEntregado()) {
                contadorVideoJuegos++;
                videojuegos[i].devolver();
            }
        }

        Serie serieLarga = series[0];
        Videojuego videojuegoLargo = videojuegos[0];

        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieLarga) == Serie.MAYOR) {
                serieLarga = series[i];
            }
            if (videojuegos[i].compareTo(videojuegoLargo) == Videojuego.MAYOR) {
                videojuegoLargo = videojuegos[i];
            }
        }

        System.out.println("Articulos entregados: " + (contadorSeries + contadorVideoJuegos));
        System.out.println("La serie mas larga es: "+ serieLarga);
        System.out.println("El videojuego mas largo es: " + videojuegoLargo);


    }
}
