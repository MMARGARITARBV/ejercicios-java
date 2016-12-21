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
    System.out.println("Este programa nos dirá cuáles son y cuánto suman los dígitos pares.");
    System.out.println("Los dígitos se mostrarán de izquierda a derecha.");
    
    System.out.print("Por favor, introducir un número: ");
    long num = Long.parseLong(System.console().readLine());
    
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    int contador = 0;
    long numero = numeroIntroducido;
    long dividendo = 1;
    long suma = 0;

    while (numero > 0) {
      numero = numero /10;
      contador++;
    }

    for (int x = 1; x < contador; x++) {
      dividendo = dividendo * 10;
    }

    numero = 0;
    System.out.print("Los dígitos pares son:");
    
    while (contador > 0) {
      numero = numeroIntroducido / dividendo;
      if ((numero % 2) == 0) {
        System.out.print(" " + numero);
        suma = suma + numero;
      }
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;
      contador--;
    }
    
    System.out.println();
    System.out.print("La suma de los dígitos pares es: " + suma);
  }
}
