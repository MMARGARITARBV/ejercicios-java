/**
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for .
 * 
 *@author Margarita B. V
 */

public class Ejer04 {
  public static void main(String[] args) {
    
    System.out.println(" \nMUESTRA LOS NÚMEROS DEL 320 al 160, contando de 20 en 20 hacia atrás\n "  );
    System.out.println("");
    
    for (int numero = 320; numero >= 160; numero -= 20) { // (numero = numero - 20)  es igual que escribir (numero -= 20)  
      System.out.println(numero);
    }
  }
}


