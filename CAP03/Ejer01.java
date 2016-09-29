/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Margarita Benitez
 */

public class Ejer01 {
  public static void main(String[] args) {
    
    System.out.println ("\n ¡Vamos a Multiplicar!\n");
    System.out.print("introduce un número entero:");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.print("introduce el segundo número entero:");
    int segundoNumero = Integer.parseInt (System.console().readLine());
    
    int totalMultiplicacion  = primerNumero * segundoNumero;
    
    System.out.println("Primer Número  : " + primerNumero );
    System.out.println("Segundo Número : " + segundoNumero );
    System.out.println("-----------------------------------");
    
    System.out.println("TOTAL MULTIPLICACION =" + totalMultiplicacion);
    
  }
}


