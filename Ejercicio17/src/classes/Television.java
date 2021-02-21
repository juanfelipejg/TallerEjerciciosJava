package classes;

public class Television extends Electrodomestico{

    final float RESOLUCION = 20;
    final boolean SINTONIZADOR_TDT = false;

    float resolucion;

    boolean sintonizadorTDT;

    public Television() {
        super();
        resolucion = RESOLUCION;
        sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(double precioBase, float peso) {
        super(precioBase, peso);
        resolucion = RESOLUCION;
        sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(double precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(getResolucion() > 40){
            precioFinal += precioFinal*0.3;
        }

        if(isSintonizadorTDT()){
            precioFinal += 50;
        }
        return precioFinal;
    }





}
