package classes;

public class Electrodomestico {

    final double PRECIOBASE = 100;
    final String COLOR = "blanco";
    final char CONSUMOENERGETICO = 'F';
    final float PESO = 5;

    double precioBase;
    String color;
    char consumoEnergetico;
    float peso;

    public Electrodomestico() {
        this.precioBase = PRECIOBASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = PESO;
    }

    public Electrodomestico(double precioBase, float peso) {
        this.precioBase = precioBase;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char[] letrasConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letrasConsumo.length; i++) {
            if (letrasConsumo[i] == letra) {
                return letra;
            }
        }
        return consumoEnergetico;
    }

    public String comprobarColor(String color) {
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                return color;
            }
        }
        return color;
    }

    public double precioFinal() {
        double precioFinal;
        precioFinal = (calcularPrecioConsumo(this.consumoEnergetico) +  calcularPrecioTamaño(this.peso));
        return precioFinal;
    }

    private double calcularPrecioConsumo(char letra) {
        double valorConsumo;
        switch (letra) {
            case 'A':
                valorConsumo = 100;
                break;
            case 'B':
                valorConsumo = 80;
                break;
            case 'C':
                valorConsumo = 60;
                break;
            case 'D':
                valorConsumo = 50;
                break;
            case 'E':
                valorConsumo = 30;
                break;
            default:
                valorConsumo = 10;
        }
        return valorConsumo;
    }

    public double calcularPrecioTamaño(float peso) {
        double valorTamaño = 0;
        if(peso <= 19){
            valorTamaño = 10;
        }else if(peso <= 49){
            valorTamaño = 50;
        }else if(peso <= 79){
            valorTamaño = 80;
        }else if(peso >=80){
            valorTamaño = 100;
        }
        return valorTamaño;
    }
}
