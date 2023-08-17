/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

 */
package Entidades;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, Double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

   
    @Override
    public String toString() {
        return "Televisor " + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT +"precio "+precio+" color "+ color;
    }

    

}
