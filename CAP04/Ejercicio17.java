/**
 *Ejercicio 17: Escribe un programa que diga cuál es la última cifra de un
 *número entero introducido por teclado.
 *
 *@author Margarita B. V
 */
 
public class Ejercicio17 {
  public static void main (String[] args){
    
    System.out.println("\n VAMOS A ADIVINAR CUAL ES LA ÚLTIMA CIFRA DE UN NÚMERO ENTERO: \n");
    System.out.print("Introduzca el número : ");
      int numero = Integer.parseInt(System.console().readLine());
 
      int resultado = (numero % 10); // cuando le haces el modulo 10 te saca la última cifra, si es la antepenúltima es 100 y así....
      System.out.println("\nLa última cifra del numero introducido es: " + resultado);
    
    System.out.println("\n PROBEMOS LA SEGUNDA OPCION \n"); 
    System.out.print("Introduzca un número entero: ");
    String num = System.console().readLine();
    System.out.print("\nLa última cifra del número introducido es: ");
    System.out.print(num.charAt(num.length()-1)); // utilizamos una char y length(longitud), especificando la posición
  }
}
