package classes;

public class Lavadora extends Electrodomestico {

    final float CARGA = 5;

    float carga;

    public Lavadora() {
        super();
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, float peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(getCarga() > 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
