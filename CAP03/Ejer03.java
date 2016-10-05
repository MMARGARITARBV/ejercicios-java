/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Margarita Benitez
 */

public class Ejer03 {
  public static void main(String[] args) {
    
    
    System.out.println ("¡CONVERSOR DE PESETAS A EUROS \n ");
    
    System.out.print("Cantidad de Pesetas a convertir:  ");
    int pesetas = Integer.parseInt(System.console().readLine());// entrada de datos (decimales)
    
    System.out.println ("\n");
    
    double totalEuros  = pesetas / 166.38; //operación HE REALIZADO UN CASTIG en la operación. Las pesetas no tiene enteros
    
    System.out.printf("RESULTADO = %.1f PESETAS es igual a %.2f EUROS", pesetas, totalEuros);
  }
}


