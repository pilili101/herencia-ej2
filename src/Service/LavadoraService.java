/*
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
*/
package Service;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService{
    
    public Lavadora crearLavadora(Scanner sc){
        Electrodomestico electro = crearElectrodomestico(sc);
        System.out.println("Indique la carga de la lavadora");
        int carga=sc.nextInt();
        return new Lavadora(carga,electro.getPrecio(),electro.getColor(),electro.getConsumo(),electro.getPeso());
    }
    
      public Double precioFinal(Lavadora lavadora){
        super.precioFinal(lavadora);
          System.out.println("carga "+lavadora.getCarga());
        if(lavadora.getCarga()>30){
            lavadora.setPrecio(lavadora.getPrecio()+500);
        }
        return lavadora.getPrecio();
    }
      
 
}
