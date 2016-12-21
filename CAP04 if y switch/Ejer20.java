/**
 *Ejercicio 20: Realiza un programa que diga si un número entero positivo
 *introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer20 {
  public static void main (String[] args){
    System.out.print("Introduzca un número entero positivo de 5 cifras o");
    System.out.print(" menos: ");
    String num = System.console().readLine();
    
    int flag = 0;
    
    if ((Integer.parseInt(num) >= 0) && (num.length() <= 5)){
      if (num.length() == 1){
        flag = 1;
      }else if (num.length() == 2){
        if (num.charAt(0) == num.charAt(1)){
          flag = 1;
        }
      }else if (num.length() == 3){
        if (num.charAt(0) == num.charAt(2)){
          flag = 1;
        }
      }else if (num.length() == 4){
        if (num.charAt(0) == num.charAt(3) &&
            num.charAt(1) == num.charAt(2)){
          flag = 1;
        }
      }else{
        if (num.charAt(0) == num.charAt(4) &&
            num.charAt(1) == num.charAt(3)){
          flag = 1;
        }
      }
    }else{
      System.out.print("Número introducido incorrecto.");
      flag = -1;
    }
    
    if (flag == 1){
      System.out.print("El número " + num + " es capicúa.");
    }else if (flag == 0){
      System.out.print("El número " + num + " no es capicúa.");
    }
  }
}
