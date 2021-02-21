package classes;

import java.util.Scanner;

public class LeerDatos {

    public void leerDatos() {
        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Sexo: ");
        String sex = sc.next();
        sexo = sex.charAt(0);
        System.out.print("Peso: ");
        peso = sc.nextFloat();
        System.out.print("Altura: ");
        altura = sc.nextFloat();

        Persona objPersona1 = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println("Persona 1");
        objPersona1.calcularIMC();
        objPersona1.esMayorDeEdad();
        objPersona1.imprimirDatos();

        Persona persona2 = new Persona(nombre,edad,sexo);
        System.out.println("Persona 2");
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        persona2.imprimirDatos();

        Persona persona3 = new Persona();
        System.out.println("Persona 3");
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(73);
        persona3.setAltura(1.85F);
        objPersona1.calcularIMC();
        objPersona1.esMayorDeEdad();
        objPersona1.imprimirDatos();
    }

}
