/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra 'par'' o 'impar' según proceda.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra si un numero es par o impar.");
    
    //pide 8 números enteros
    int num[] = new int [8];
    for (int x = 0; x < 8; x++) {
      System.out.print("Por favor, introduzca un numero: ");
      num[x] = Integer.parseInt(System.console().readLine());
    } 
    
    
    for (int x = 0; x < 8; x++) {
      System.out.print("El numero " + num[x] + " es: ");
      //verifica si es par y imprime ( par o impar)
      if ((num[x] % 2) == 0) {
        System.out.print("Par");
      } else {
        System.out.print("Impar");
      }
      System.out.println();
    } 
  }
}
