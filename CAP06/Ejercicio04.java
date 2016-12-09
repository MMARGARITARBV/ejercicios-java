/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.
 *
 * @author Margarita B.V
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra, al azar, 20 números entre 0 y 10.\n");
    
    // Generamos los 20 números aleatorios
    for(int x = 1; x <= 20; x++) {
      System.out.print((int)(Math.random() * 11) + " "); // hasta 11 porque genera números entre 0 y 10
    }
  }
}
