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
    int numero = Integer.parseInt(System.console().readLine());
    
    int numeroReves = 0;

    while (numero > 0) {
        numeroReves = (numeroReves * 10) + (numero % 10);
        numero = numero / 10;
        }
        System.out.print(numeroReves + " \n");
  }
}


