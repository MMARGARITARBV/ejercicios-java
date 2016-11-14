/**
 *Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 *
 * @author Margarita Benitez V
 */
public class Ejer31 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una L.");
    System.out.print("Por favor, introduzca la altura de la L: ");
    int alturaFinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int ancho = (alturaFinal / 2) + 1;
    
    while (altura <= alturaFinal) {
      if (altura != alturaFinal) {
        System.out.println("*"); // PINTA LA LINEA HORIZONTAL 
        
      } else {
        for (int x = 1; x <= ancho; x++) {
          System.out.print("*");  // PINTA LA LINEA VERTICAL 
        }
      }
      altura++;
    }
  }
}
