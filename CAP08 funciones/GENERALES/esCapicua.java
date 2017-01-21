/**
 * Programa que cumprueba si un número es o no Capicua
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class esCapicua {
  public static void main(String[] args) {
    
    System.out.println("\nCOMPRUEBA SI EL NÚMERO ES CAPICUA\n"  );
    
    System.out.print("Introduce el número a comprobar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int posibleNumeroCapicua = 0;
    posibleNumeroCapicua = numeroIntroducido;
    int numeroReves = 0;

    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
        numeroIntroducido /= 10;
        }
        //System.out.print(numeroReves);

        if (posibleNumeroCapicua != numeroReves) { // COMPRUEBA SI ES CAPICUA
           System.out.print("El número no es Capicua");
         } else {
           System.out.print("El número es Capicua");
         }
       System.out.println(" ");
    }
}


