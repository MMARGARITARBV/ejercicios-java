/**
 *
 * @author Margarita B.V
 */
public class Ejer19vpiramidealrevez {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una piramide apuntando hacia abajo.");
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    int altura = 1;
    int espacios = 1;
    int i = 1;
    int j = 0;
    int relleno = alturafinal + (alturafinal -1);
            
          while (altura <= (alturafinal)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print("-");
            }
            for (i = 1; i <= relleno; i++) { //pinta los espacios 
              System.out.print("*");
            }
            System.out.println();
            espacios++; 
            altura++;
            relleno = relleno - 2;;
          }
  }
}
