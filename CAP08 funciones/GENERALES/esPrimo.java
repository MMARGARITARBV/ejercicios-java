/**
 *Este programa comprueba si el número introducido por teleclado es primo o no. 
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class esPrimo {
  public static void main(String[] args) {
    
    System.out.println("\nCOMPRUEBA SI EL NUMERO ES PRIMO\n"  );
    
    System.out.print("Introduce el número a comprobar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    //Un número primo es un número mayor que 1 que tiene únicamente dos divisores distintos: él mismo y el 1.

    boolean esPrimo = true;
    for (int i = 2; i < numeroIntroducido; i++) { // i tengo que inicializarla en 2 obligatoriamente, ya que por 1 siempre dará 0.
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
      
    if (esPrimo) {
      System.out.println("El " + numeroIntroducido + " es primo.");
    } else {
      System.out.println("El " + numeroIntroducido + " no es primo.");
    }
  }
}


