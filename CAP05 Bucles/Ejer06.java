/**
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for .
 * 
 *@author Margarita B. V
 */

public class Ejer06 {
  public static void main(String[] args) {
    
    System.out.println(" \nMUESTRA LOS NÚMEROS DEL 320 al 160, contando de 20 en 20 hacia atrás\n "  );
    System.out.println("");
    
    // DO - WHILE
     
    int numero = 320;
    
    do {
      System.out.println(numero);
      numero -= 20;
    } while (numero >= 160); 
    
    /*
     * WHILE
    int numero = 320; 
       
    while (numero >= 160) { // mientras número mayor o igual que 160
      System.out.println(numero); //sentencia
      numero -= 20; // Realiza el bucle negativo hasta 160 de 20 en 20
    }
           
    CON FOR
     
     for (int numero = 320; numero >= 160; numero -= 20) { // (numero = numero - 20)  es igual que escribir (numero -= 20)  
      System.out.println(numero);
    }   
    */
  }
}


