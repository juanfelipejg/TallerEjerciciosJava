package interfaces;

public interface Entregable {

    final int MAYOR = 1;
    final int MENOR = -1;
    final int IGUAL = 0;

    boolean entregar();

    boolean devolver();

    boolean isEntregado();

    int compareTo(Object a);
}
