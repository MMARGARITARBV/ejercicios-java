/**
 *Este programa da la vuela al número.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class volteaNumero {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA DA LA VUELTA A UN NÚMERO\n"  );
    
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numeroReves = 0;

    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
        numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print(numeroReves + " \n");
  }
}


