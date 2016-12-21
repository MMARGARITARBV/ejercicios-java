/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 *
 * @author Margarita Benitez V
 */

public class Ejer33 {
  public static void main(String[] args) {

  System.out.println("\nESTE PROGRAMA PINTA UNA 'U' CON ASTERISCOS\n");
  System.out.print("Introduce la altura de la 'U':");
  int alturaFinal = Integer.parseInt(System.console().readLine());
  int altura = 1;
  int ancho = (alturaFinal / 2 + 1);
  
   while (altura <= alturaFinal) {
      if (altura != alturaFinal) {
        System.out.println("*"); // PINTA LA LINEA HORIZONTAL 
      } else {
        System.out.print("L"); // PINTA LA ESQUINA DE LA IZQUIERDA
        for (int x = 1; x <= ancho; x++) {
          System.out.print("*"); // PINTA LA LINEA VERTICAL 
        }
        System.out.print("J"); // PINTA LA ESQUINA DE LA DERECHA       
      }
      altura++;
    }
  
   
  }
}
