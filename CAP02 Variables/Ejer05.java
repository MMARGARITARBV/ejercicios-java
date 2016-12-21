/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Margarita Benitez
 * 
 * Variables
 */

public class Ejer05 {
  public static void main(String[] args) {
    
    double pesetas = 1000;
    double euros = pesetas / 166.38;
    
    System.out.println("CONVERSOR DE PESETAS A EUROS \n "  );
    System.out.printf("%.2f pesetas es = %.2f Euros", pesetas , euros);// de esta forma se pueden mostrar varios 
                                                                      //datos por pantalla en una misma línea.     
    }
}


