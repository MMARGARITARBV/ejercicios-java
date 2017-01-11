/**
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
carácter.
 *
 * @author Margarita B.V
 */
public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException { // Throws nos permite utilizar el thread.sleep(1)
    System.out.println("Este programa llena la pantalla de caracteres.");
    int x = 1;
    String celeste = "\033[36m"; // pintamos los caracteres de color celeste
    
    while (x > 0) {
      char caracter = (char)((Math.random() * 95) + 32); // char entre 32 y 126
      Thread.sleep(1);//interrupcion de 1 milisegundo para darle similitud con Matrix
      System.out.print(celeste + caracter);
      }
  }
}
