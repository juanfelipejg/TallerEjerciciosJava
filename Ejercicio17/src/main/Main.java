package main;

import classes.Electrodomestico;
import classes.Lavadora;
import classes.Television;

public class Main {

    public static void main(String[] args) {

        float totalGananciasElectrodomesticos = 0;
        float totalGananciasTelevisores = 0;
        float totalGananciasLavadoras = 0;


        Object [] electrodomesticos = new Object[10];

        electrodomesticos[0] = new Television();;
        electrodomesticos[1] = new Television();
        electrodomesticos[2] = new Television();
        electrodomesticos[3] = new Television();
        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Lavadora();
        electrodomesticos[6] = new Lavadora();
        electrodomesticos[7] = new Lavadora();
        electrodomesticos[8] = new Electrodomestico();
        electrodomesticos[9] = new Electrodomestico();

        for (int i = 0; i < electrodomesticos.length; i++) {
            if(electrodomesticos[i] instanceof Lavadora){
                totalGananciasLavadoras += ((Lavadora)electrodomesticos[i]).precioFinal();
            }else if(electrodomesticos[i] instanceof Television){
                totalGananciasTelevisores += ((Television)electrodomesticos[i]).precioFinal();
            }else{
                totalGananciasElectrodomesticos += ((Electrodomestico)electrodomesticos[i]).precioFinal();
            }
        }

        System.out.println("Las ganancias en lavadoras es: " + totalGananciasLavadoras);
        System.out.println("Las ganancias en televisiones es: " + totalGananciasTelevisores);
        System.out.println("El total de ganancias en otros electrodomesticos es: " + totalGananciasElectrodomesticos);

        System.out.println("El total de ganancias es: " + (totalGananciasLavadoras + totalGananciasTelevisores
                + totalGananciasElectrodomesticos));
    }
}
