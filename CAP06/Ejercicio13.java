/**
Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
valor.
 *
 * @author Margarita B.V
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa simula la tirada de dos dados.");
    int dadouno = 0;
    int dadodos = 0;
    
    int x = 1;
    
    // Generamos la tirada de dos dados hasta que ambos tengan el mismo valor
    do {
      dadouno = (int)(Math.random() * 6 ) + 1;
      dadodos = (int)(Math.random() * 6 ) + 1;
      System.out.println("La tirada nº" + x + " del primer dado es: " + dadouno + " y el segundo es: " + dadodos);
      x++; // vuelve a hacer el bucle hasta que cumpla con la condición de que los dos dados tengan el mismo valor
    } while (dadouno != dadodos); // mietras que dado 1 y dado dos tengan el mismo valor
  }
}
