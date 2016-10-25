/**
 *Ejercicio 12: Escribe un programa que muestre los n primeros términos de la 
 *serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el 
 *segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que 
 *tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
 *144... El número n se debe introducir por teclado.
 *
 *@author Margarita B. V
 */
 
public class Ejercicio12 {
  public static void main (String[] args){
    System.out.println("Serie de Fibonacci");
    System.out.println("------------------");
    System.out.print("Introduzca cuantos veces quiere que se repita la serie: ");
    int veces = Integer.parseInt(System.console().readLine());
    int num1 = 0;
    int num2 = 1;
    int aux;
    
    for (int i = 0; i < veces; i++){
      System.out.print(num1);
      if (i < (veces-1)){
        System.out.print(", ");
      }
      aux = num1;
      num1 = num2;
      num2 += aux;
    }
  }
}
