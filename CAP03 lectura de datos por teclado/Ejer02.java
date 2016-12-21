/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Margarita Benitez
 * 
 * Lectura de datos desde teclado
 * 
 */

public class Ejer02 {
  public static void main(String[] args) {
    
    
    System.out.println (" ¡CONVERSOR DE EUROS A PESETAS! \n");
    
    System.out.print("Cantidad de Euros a convertir:  ");
    double euro = Double.parseDouble(System.console().readLine());// entrada de datos (decimales)
    
    System.out.println ("\n");
    
      //System.out.print("introduce las Pesetas:");
    //double pesetas = Integer.parseInt (System.console().readLine());
    
    int totalPesetas  = (int) (euro * 166.38); //operación y realizo el casting porque PESETAS no tiene decimales y la operación es con decimales.
    
    //System.out.println("Euros introducidos:  " + euro + " \n ");
       
    System.out.println("RESULTADO : " + euro + "€  es igual a " + totalPesetas + "pesetas");
        
  }
}


