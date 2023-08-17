
package Service;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService {
    
    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    
    public Televisor crearTelevisor(Scanner sc) {
        Electrodomestico electro = crearElectrodomestico(sc);
        System.out.println("Ingrese la resolucion del televisor en pulgadas");
        double resoluc = sc.nextDouble();
        System.out.println("Tiene sintonizador TDT?(S/N)");
        boolean sintonizador = false;
        if (sc.next().equalsIgnoreCase("S")) {
            sintonizador = true;
        }
        return new Televisor(resoluc, sintonizador, electro.getPrecio(), electro.getColor(), electro.getConsumo(), electro.getPeso());
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
    */
    
     public double precioFinal(Televisor tele) {
        super.precioFinal(tele);
        if (tele.getResolucion() >= 40) {
            tele.setPrecio(tele.getPrecio()*1.3);
        }
        if(tele.isSintonizadorTDT()){
            tele.setPrecio(tele.getPrecio()+500);
        }
        return tele.getPrecio();
    }

    
}
