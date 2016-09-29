/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Margarita Benitez
 */

public class Ejer02 {
  public static void main(String[] args) {
    
    System.out.println ("\n   ¡Conversor de EUROS a PESETAS \n");
    System.out.print("Cantidad de Euros:");
    double euro = Double.parseDouble(System.console().readLine());
    
    //System.out.print("introduce las Pesetas:");
    //double pesetas = Integer.parseInt (System.console().readLine());
    
    double totalMultiplicacion  = euro * 166.38;
    
    System.out.println("Euros introducidos: " + euro + "\n");
       
    System.out.println( "EL TOTAL DE PESETAS ES = "+ totalMultiplicacion + "\n");
        
  }
}


