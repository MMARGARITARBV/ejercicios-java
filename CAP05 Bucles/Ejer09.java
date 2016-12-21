/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número
 * introducido por teclado.
 *
 *@author Margarita Benitez. V
 */
 
public class Ejer09 {
  public static void main (String[] args){
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int contador = 0;
    
    System.out.print("El número " + numero);
    
    do{
      numero /= 10; // es igual que numero = numero / 10)
      //numero = numero / 10;
      contador++;
    }while(Math.abs(numero) > 0); // funcion VALOR ABSOLUTO, cambia los negativos a positivos. 
    
    System.out.print(" tiene " + contador + " digitos.");
  }
}
