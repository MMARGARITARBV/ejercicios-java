/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 *
 * @author Margarita B.V
 */
public class Ejer26V2 {
  public static void main(String[] args) {
    System.out.println("EL programa mostrará la posición que ocupa un dígito en un número introducido.\n");
    System.out.print("Por favor introduzca un número: ");    
    int num = Math.abs(Integer.parseInt(System.console().readLine()));
    
    System.out.print("Por favor, introduzca un dígito de ese número: ");
    
    int dig = Math.abs(Integer.parseInt(System.console().readLine()));
    
    int nuevo = 0;
    int posicion = 1;
    int reves = 1;

    
    while (num > 0) {
      nuevo = (nuevo * 10) + (num % 10);
      num = num / 10;
      }
    
    do {
      reves = nuevo;
      reves = reves % 10;
      if (reves == dig) {
        System.out.println("El dígito introducido está en la posición: " + posicion);
      }
      posicion++;
      nuevo = nuevo / 10;
    } while (reves > 0);
    
  }
}
