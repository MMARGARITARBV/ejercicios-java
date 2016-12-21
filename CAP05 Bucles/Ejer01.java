/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 * 
 *@author Margarita B. V
 */

public class Ejer01 {
  public static void main(String[] args) {
    
    System.out.println(" \nMUESTRE LOS NÚMEROS MÚLTIPLOS DE 5 DEL 0 A 100\n "  );
    System.out.println("");
    
        
    for (int numero = 0; numero <= 100; numero = (numero + 5)) {
      System.out.println(numero);
    }
  }
}


