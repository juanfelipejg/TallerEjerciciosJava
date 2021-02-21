package classes;

import java.util.Random;

public class Persona {

    final char SEX = 'H';

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo = SEX;
    private float peso;
    private float altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = SEX;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularIMC() {
        double imc;
        final int PESOIDEAL = -1;
        final int DESNUTRIDO = 0;
        final int SOBREPESO = 1;

        imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) {
            System.out.println("Tienes desnutrición");
        }
        if (imc <= 25) {
            System.out.println("Estas en el peso ideal");
        }
        if (imc > 25) {
            System.out.println("Tienes sobrepeso");
        }
    }

    public boolean esMayorDeEdad() {

        final int MAYOREDAD = 18;

        if (edad >= MAYOREDAD) {
            System.out.println("Es mayor de edad");
            return true;
        }
        if (edad < MAYOREDAD){
            System.out.println("Es menor de edad");
            return false;
        }
        return false;
    }

    public void comprobarSexo(char sexo) {
        if (!((sexo == 'H') || (sexo == 'F'))) {
            sexo = this.sexo;
        }
    }

    @Override
    public String toString() {
        return "Persona " +
                "nombre='" + this.nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura ;
    }

    String generaDNI() {
        return generarNumero();
    }

    String generarNumero() {
        final int MAX = 90000000;
        final int MIN = 9999999;
        int numeroRandom;
        Random objRandom = new Random();
        numeroRandom = objRandom.nextInt(MAX) + MIN;
        return convertirLetra(numeroRandom).concat(convertirNumero(numeroRandom));
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }

    public char generarLetra(int random) {
        char [] letraDNI = {'T', 'R', 'W', 'A',	'G', 'M', 'Y', 'F',	'P', 'D', 'X', 'B',	'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E'};
        random = random % 23;

        return letraDNI[random];
    }

    private String convertirLetra(int random) {
        return Character.toString(generarLetra(random));
    }

    private String convertirNumero(int random) {
        return String.valueOf(random);
    }

}
