/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Margarita B.V
 */
public class Ejer16V2 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará si el número introducido es o no primo.");
    System.out.print("Por favor, introducir un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int x = 1;
    int resto = 0;
    int suma = 0;
    
    do {
      resto = num % x;
      if (resto == 0) {
        suma++;
      }
      x++;
    } while (x <= num);
    
    if ((suma == 2)||(num == 1)) {
      System.out.println("El número " + num + " es un número primo.");
    } else {
      System.out.println("El número " + num + " no es un número primo.");
    }
  }
}
