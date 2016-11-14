/**
 *
 * @author Margarita B.V
 */
public class Ejer33VPIRAMIDE {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pirámide.");
    System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    char caracter = (System.console().readLine()).charAt(0);
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int alturainicial = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;

    while (altura <= alturainicial) {
      
      for (i = 1; i <= espacios; i++) { // inserta los espacios
        System.out.print("_");
      }
      System.out.println("*");
      altura++; // aumenta la altura hasta que altura sea <= que la altura introducida por teclado.
    }
  }
}
