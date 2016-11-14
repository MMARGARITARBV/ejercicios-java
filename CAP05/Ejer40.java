/**
 *
 *
 * @author Margarita Benitez
 */
public class Ejer40 {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un rombo.");
    System.out.print("Por favor, introduzca la altura del rombo: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturafinal / 2;
    int i = 0;
    int j = 0;
    int relleno = 0;
      
      
      if ((alturafinal < 3) ||  ((alturafinal % 2) == 0)) {
        System.out.println("La altura debe ser impar y mayor o igual a 3."); // muestra número introducido erroneo
      } else {
            while (altura <= (alturafinal / 2)) {
      
            for (i = 1; i <= espacios; i++) { 
              System.out.print(" "); // introduce los espacios de la izquierda
            }
            System.out.print("*"); // pinta el lado izquierdo de arriba y el asterisco de arriba
            for (i = 1; i < relleno; i++) {
              System.out.print(" "); // espacio en blanco de la parte de arriba
            }
            if (altura > 1) {
              System.out.print("*");// pinta asterisco de la derecha despues del espacio
            }
              
            System.out.println();
            espacios--; // espacios --
            altura++;
            relleno = relleno + 2;; // relleno más dos
          }
          
          System.out.print("*"); //pinta el asterisco del medio de la izquierda
          for (int x = 1; x <= (alturafinal - 2); x++) {
            System.out.print(" "); // pinta los espacios teniendo en cuenta que son altura final - 2
          }
          System.out.print("*"); // pinta el asterisco del medio de la derecha
          System.out.println();
           
           altura = 1;
           espacios = 1;
           relleno = alturafinal - 4; 
          
          while (altura <= (alturafinal / 2)) {
            for (i = 0; i < espacios; i++) {
              System.out.print(" "); // introduce los espacios a la izquierda
            }
            System.out.print("*"); // pinta los asteriscos de la izquierda de la parte de abajo
            for (i = 1; i <= relleno; i++) {
              System.out.print(" "); // pinta los espacios de relleno de la parte de abajo
            }
            if (altura < (alturafinal / 2)) {
              System.out.print("*"); // pinta los caracteres de la derecha, solo uno - a la izquierda son dos
            }

            System.out.println();
            espacios++; // espacios ++ 
            altura++;
            relleno = relleno - 2;; // relleno - dos
          }
      }
  }
}
