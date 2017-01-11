/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número
 *entero que puede ser positivo o negativo. Se permiten números de hasta 5
 *dígitos.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer19 {
  public static void main (String[] args){
    System.out.print("Introduzca un número entero, positivo o negativo ");
    System.out.print("(máximo 5 cifras): ");
    String num = System.console().readLine();
    
    if (Integer.parseInt(num) >= 0){
      if (num.length() <= 5){
        System.out.print("El número " + num + " tiene " + num.length());
        System.out.print(" cifras.");
      }else{
        System.out.print("Número introducido incorrecto, más de 5 cifras.");
      }
    }else{
      if ((num.length()-1) <= 5){
        System.out.print("El número " + num + " tiene " + (num.length()-1));
        System.out.print(" cifras.");
      }else{
        System.out.print("Número introducido incorrecto, más de 5 cifras.");
      }
    }
  }
}
