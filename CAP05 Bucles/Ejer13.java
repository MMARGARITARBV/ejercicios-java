/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos. 
 *
 * @author Margarita B. V
 */
 
public class Ejer13 {
  public static void main (String[] args){
    System.out.println("Nuestro programa te pedirá por teclado 10 números diferentes y:");
    System.out.println("1. Nos dirá cuantos son positivos y cuantos negativos");
    System.out.println("2. Nos dirá cual es el valor máximo y cual el mínimo");
    System.out.println("-------------------------------------------");
    
    int contadorPositivos = 0;
    int contadorNegativos = 0;
    int numero = 0;
    int numeros = 0;
    
    do{
      System.out.print("\nINTRODUCE EL NÚMERO: ");
      numero = Integer.parseInt(System.console().readLine());
           
      if (numero > 0){
        contadorPositivos++;
      }else if (numero < 0){
        contadorNegativos++;
      }       
      numeros++;
    } while (numeros < 10);
    
    System.out.println("\nLa cantidad de numeros introducidos positivos es: " + contadorPositivos);
    System.out.println("\nLa cantidad de numeros introducidos negativos es: " + contadorNegativos);
  }
}
