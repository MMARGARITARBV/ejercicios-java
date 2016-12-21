/**
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer05 {
  public static void main (String[] args){
    System.out.println("Vamos a resolver la ecuación  de primer grado: ax + * b = 0");
    System.out.println("");
    System.out.print("Introduzca el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de 'b': ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("");
     
    //int x = 5/0; Esto genera una excepcion que debe ser controlada
    
    if (a != 0){ // != diferente, tambien se puede escribir (!(a == 0) 
      System.out.print("El resultado de la ecuación " + a + " x + " + b + " = 0"); // mostramos como quedarían los valores en la ecuación
      System.out.printf(" es: %.2f\n", (-b)/a); // resolvemos la ecuación 
    }else{
      System.out.println("La ecuación no tiene solución (división entre 0).");
    }
    
    if (a == 0){ // preguntar por qué no a == 0 , nos da -INFINITY en caso de plantearlo mal...
      System.out.print("La ecuación no tiene solución (división entre 0).");
    }else{
      System.out.print("El resultado de la ecuación " + a + " x + " + b + " = 0");
      System.out.printf(" es: %.2f", (-b)/a);
    }
  }
}
