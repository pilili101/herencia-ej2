/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {

    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    private char comprobarConsumo(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    private String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("negro") || color.equals("azul") || color.equals("rojo") || color.equals("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico(Scanner sc) {
        Double precio = 1000d;
        System.out.println("Ingrese el color de electrodomestico(negro, blanco, azul, rojo, gris)");
        String color = comprobarColor(sc.next());
        System.out.println("Ingrese el consumo del electrodomestico(A,B,C,D,E,F)");
        char consumo = comprobarConsumo(sc.next().charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        int peso = sc.nextInt();
        return new Electrodomestico(precio, color, consumo, peso);
    }

    /*
     • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    public Double precioFinal(Electrodomestico e) {

        if (e.getConsumo() == 'A') {
            e.setPrecio(e.getPrecio() + 1000);
        } else if (e.getConsumo() == 'B') {
            e.setPrecio(e.getPrecio() + 800);
        } else if (e.getConsumo() == 'C') {
            e.setPrecio(e.getPrecio() + 600);
        } else if (e.getConsumo() == 'D') {
            e.setPrecio(e.getPrecio() + 500);
        } else if (e.getConsumo() == 'E') {
            e.setPrecio(e.getPrecio() + 300);
        } else if (e.getConsumo() == 'F') {
            e.setPrecio(e.getPrecio() + 100);
        }

        if (e.getPeso() < 20) {
            e.setPrecio(e.getPrecio() + 100);
        } else if (e.getPeso() >= 20 && e.getPeso() < 50) {
            e.setPrecio(e.getPrecio() + 500);
        } else if (e.getPeso() >= 50 && e.getPeso() < 80) {
            e.setPrecio(e.getPrecio() + 800);
        } else {
            e.setPrecio(e.getPrecio() + 1000);
        }
        return e.getPrecio();
    }

}
