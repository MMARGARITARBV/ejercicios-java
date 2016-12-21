/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Margarita Benitez V
 */
public class Ejer8{
  public static void main(String[] args) {
    
    System.out.println("Vamos a multiplicar.");    
    System.out.println("introduzca el numero que desea multiplicar.");
    int multiplicando = Integer.parseInt(System.console().readLine());
    System.out.println("introduzca el número de veces que desea multiplicarlo.");
    int multiplicador = Integer.parseInt(System.console().readLine());
    
    for (int producto = 0; producto <= multiplicador; producto++) {
      System.out.println(multiplicando + " x " + producto + " = " + multiplicando * producto);
      
  }
 }
}
