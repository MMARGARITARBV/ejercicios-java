/**
 *Ejercicio 13: Escribe un programa que ordene tres números enteros introducidos
 *por teclado.
 *
 *@author Margarita B. V
 */
 
public class Ejer13 {
  public static void main (String[] args){
    System.out.println("Vámos a ordenar 3 números");
    System.out.println("--------------------------------------");
    
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int aux = 0;
    
    if (num2 < num1){
      aux = num1;
      num1 = num2;
      num2 = aux;
    }
    
    System.out.print("Introduce el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if ((num3) < (num1)){
      aux = num1;
      num1 = num3;
      num3 = num2;
      num2 = aux;
    }else if ((num3) < (num2)){
      aux = num2;
      num2 = num3;
      num3 = aux;
    }
    
    System.out.print("Los números ordenados se quedan de la siguiente manera: ");
    System.out.print(num1 + ", " + num2 + ", " + num3);
  }
}
