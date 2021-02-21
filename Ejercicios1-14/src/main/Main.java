package main;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione un ejercicio");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1: {
                System.out.println("Ingrese un numero");
                int a = sc.nextInt();
                System.out.println("Ingrese otro numero");
                int b = sc.nextInt();

                if(a > b)
                    System.out.println("El numero:"  + a + " es mayor que: " + b);
                else if (b > a)
                    System.out.println("El numero:"  + b + " es mayor que: " + a);
                else
                    System.out.println("Los numeros son iguales");
            }
            break;

            case 3: {
                System.out.println("Ingrese el radio del circulo");
                String radio = sc.next();
                double pi = 3.1416;
                double area = pi*(Math.pow(Double.parseDouble(radio),2));
                System.out.println("El area es: " + area);
                break;
            }

            case 4: {
                System.out.println("Ingrese el precio del producto");
                final double IVA = 0.21;
                double precio = sc.nextDouble();
                System.out.println("El precio final es: " + ((IVA * precio) + precio));
                break;
            }

            case 5:{
                boolean condicion = true;
                int i = 1;
                String numeroPar = "Numeros pares: ";
                String numeroImpar = "Numeros impares: ";
                while(condicion){
                    if(i%2 == 0){
                        numeroPar +=  "," + i;
                    }
                    else{
                        numeroImpar +=  "," + i;
                    }
                    i++;
                    if(i > 100)
                        condicion = false;
                }
                System.out.println(numeroPar);
                System.out.println(numeroImpar);
                break;
            }

            case 6: {
                String numeroPar = "Numeros pares: ";
                String numeroImpar = "Numeros impares: ";
                for(int i = 1; i <= 100; i++){
                    if(i%2 == 0)
                        numeroPar = numeroPar + "," + i;
                    else
                        numeroImpar = numeroImpar + "," + i;
                }
                System.out.println(numeroPar);
                System.out.println( numeroImpar);
                break;
            }

            case 7: {
                boolean validacion = false;
                do{
                    System.out.println("Ingrese un numero mayor o igual a 0");
                    int num = sc.nextInt();
                    if(num<0){
                        System.out.println("Ingrese un numero mayor o igual a 0");
                        num = sc.nextInt();
                        validacion = false;
                    }
                    else{
                        System.out.println("El numero ingresado fue: " + num);
                        validacion = true;
                    }

                }while(!validacion);
            }
            break;

            case 8: {
                System.out.println("Ingresa un dia de la semana");
                String dia = sc.next();
                dia.toLowerCase();
                if(dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
                        dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
                        || dia.equalsIgnoreCase("viernes")){
                    System.out.println("Es un dia laboral");
                }
                else
                    System.out.println("Es un dia de descanso");
                }
                break;
            case 9: {
                final String frase = "La sonrisa sera la mejor arma contra la tristeza";
                String newFrase = frase.replace('a', 'e');
                System.out.println("Ingresa una frase");
                sc.nextLine();
                String miFrase = sc.nextLine();
                System.out.println(newFrase + " " + miFrase);
                break;
            }
            case 10: {
                System.out.println("Ingresa una frase");
                sc.nextLine();
                String frase = sc.nextLine();
                System.out.println(frase);
                String newFrase = frase.replaceAll(" ","");
                System.out.println(newFrase);
            }
            break;
            case 11: {
                System.out.println("Ingresa una frase");
                sc.nextLine();
                String frase = sc.nextLine();
                System.out.println("La longitud de la frase es: " + frase.length());
                int contador = 0;
                for(int i=0; i<frase.length(); i++) {
                    if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                        contador++;
                    }
                }
                System.out.println("La frase tiene :" + contador + " vocales") ;
            }
            break;
            case 12: {
                System.out.println("Ingrese una palabra");
                sc.nextLine();
                String palabra1 = sc.nextLine();
                System.out.println("Ingrese otra palabra");
                sc.nextLine();
                String palabra2 = sc.nextLine();
                if(palabra1.equals(palabra2)){
                    System.out.println("Las palabras son iguales");
                    break;
                }
                System.out.println("Las frases no son iguales");
            }
            break;
            case 13:{
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                System.out.println("Hora actual: " + dateFormat.format(date));
                break;
            }
            case 14:{
                boolean validacion = false;
                do{
                    System.out.println("Ingrese un numero:");
                    int num = sc.nextInt();
                    if(num>=1000){
                        System.out.println("Ingrese un numero menor que 1000");
                        validacion = false;
                    } else {
                        for (int i = num; i <= 1000; i = i +2){
                            System.out.println(i);
                        }
                    }
                }while(!validacion);
                break;
            }
            default:
                System.out.println("Opcion no valida");

        }
    }
}






