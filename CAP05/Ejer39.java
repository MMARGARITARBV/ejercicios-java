/**
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los
números desde el 1 al número introducido junto con su factorial.
 *
 * @author Margarita Benitez
 */
public class Ejer39 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el factorial del número introducido.");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int aux = 1;
    int factorial = 1;
    
    /*El factorial de un entero positivo n, el factorial de n o n factorial se 
     * define en principio como el producto de todos los números enteros 
     * positivos desde 1 (es decir, los números naturales) hasta n. 
     * Por ejemplo, 5 ! = 1 × 2 × 3 × 4 × 5 = 120.*/
     
    while (aux <= num) {
      for (int x = aux; x > 0; x--) {
        factorial = factorial * x;
        }
        System.out.println("!" + aux + "=" + " " + (factorial));
        aux++;
        factorial = 1;
    }
  }
}
