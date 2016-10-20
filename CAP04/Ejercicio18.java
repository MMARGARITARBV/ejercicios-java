/**
 *Ejercicio 18: Escribe un programa que diga cuál es la primera cifra de un
 *número entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 *@author Margarita B. V
 */
 
public class Ejercicio18 {
  public static void main (String[] args){
    System.out.print("Introduzca un número entero de 5 o menos cifras: ");
    String num = System.console().readLine();
    if (num.length() <= 5){ // mira la longitud, al ser 5 números nos muestra el primero. 
      System.out.print("La primera cifra del número introducido es: ");
      System.out.print(num.charAt(0));
    }else{
      System.out.print("Número introducido incorrecto, más de 5 cifras.");
       
    }
  }
}
