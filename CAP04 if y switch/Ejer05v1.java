/**
 *Ejercicio 5: Realiza un programa que resuelva una ecuación de primer grado
 *(del tipo ax + b = 0).
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer05v1 {
  public static void main (String[] args){
    System.out.println("Vamos a resolver una ecuación de primer grado. (ax + b = 0). ");
    System.out.println("");
    
    System.out.print("Introduce el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    if (a == 0){
      System.out.print("La ecuación no tiene solución (división entre 0).");
    } else {
      System.out.println("");
      System.out.print("Introduce el valor de 'b': ");
      double b = Double.parseDouble(System.console().readLine());
    
      System.out.print("El resultado de la ecuación " + a + "x + " + b + " = 0");
      System.out.printf(" es: %.2f", (-b)/a);
    }
  }
}
