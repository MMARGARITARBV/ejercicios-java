/**
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 * @author Margarita B.V
 */
public class Ejer32 {
  public static void main(String[] args) {
    System.out.println("Este programa nos dirá cuáles son y cuaánto suman los dígitos pares.");
    System.out.println("Los dígitos se mostrarán de izquierda a derecha.");
    
    System.out.print("Por favor, introducir un número: ");
    long num = Long.parseLong(System.console().readLine());
    
    
    
    /*int x = 1;
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
      System.out.println("El número " + num + " no es un número primo.");*/
    }
  }
}
