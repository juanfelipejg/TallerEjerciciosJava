package classes;

import java.util.Scanner;

public class MenuCine {

    public void mostrarMenu() {

        int opcion;

        do {
            System.out.println("*****GESTIÓN CINEMATOGRÁFICA*****" +
                    "\n1. NUEVO ACTOR" +
                    "\n2. BUSCAR ACTOR" +
                    "\n3. ELIMINAR ACTOR" +
                    "\n4. MODIFICAR ACTOR" +
                    "\n5. VER TODOS LOS ACTORES" +
                    "\n6. VER PELICULAS DE LOS ACTORES" +
                    "\n7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                    "\n8. SALIR");
            System.out.print("Elige una opción: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            mostrarOpciones(opcion);
        } while (opcion != 8);
    }

    public void mostrarOpciones(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("NUEVO ACTOR");
                break;
            case 2:
                System.out.println("BUSCAR ACTOR");
                break;
            case 3:
                System.out.println("ELIMINAR ACTOR");
                break;
            case 4:
                System.out.println("MODIFICAR ACTOR");
                break;
            case 5:
                System.out.println("VER TODOS LOS ACTORES");
                break;
            case 6:
                System.out.println("VER PELICULAS DE LOS ACTORES");
                break;
            case 7:
                System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                break;
            case 8:
                System.out.println("MENU FINALIZADO");
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA, DIGITE UNA OPCIÓN VÁLIDA");
                break;
        }
    }
}
