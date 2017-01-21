/**
 * Este programa muestra el número primo siguiente al número introducido. 
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class siguientePrimo {
  public static void main(String[] args) {
    
    System.out.println("\nMUESTRA EL PRIMO SIGUIENTE AL NÚMERO INTRODUCIDO\n");
    System.out.print("Introduce el número, puede ser primo o no: ");
    int numeroPrimo = Integer.parseInt(System.console().readLine());
    int primoSiguiente = numeroPrimo+1;

    for (int n = 2; n < primoSiguiente; n++) {
      if (primoSiguiente % n == 0) {
        primoSiguiente++;
      }
    }
    System.out.print(primoSiguiente);
  }
}


