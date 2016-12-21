/**
 *Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y
 *el cubo de los 5 primeros números enteros a partir de uno que se introduce por
 *teclado.
 *
 *@author Margarita B. V
 */
 
public class Ejer11 {
  public static void main (String[] args){
    System.out.print("Introduzca un número: ");
    long numero = Long.parseLong(System.console().readLine());
    
    for (int i = 0; i < 5; i++){
      System.out.print( numero + "\t" + (numero * numero) + "\t");
      System.out.println(numero * numero *numero);
      numero++;
    }
  }
}
