/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Margarita Benitez
 */

public class Ejer02 {
  public static void main(String[] args) {
    
    
    System.out.println (" ¡CONVERSOR DE EUROS A PESETAS! \n");
    
    System.out.print("Cantidad de Euros a convertir:  ");
    double euro = Double.parseDouble(System.console().readLine());// entrada de datos (decimales)
    
    System.out.println ("\n");
    
      //System.out.print("introduce las Pesetas:");
    //double pesetas = Integer.parseInt (System.console().readLine());
    
    double totalPesetas  = euro * 166.38; //operación
    
    //System.out.println("Euros introducidos:  " + euro + " \n ");
       
    System.out.printf("RESULTADO = %.1f € es igual a %.2f Pesetas", euro, totalPesetas);
        
  }
}


