/**
 *Ejercicio 14: Realiza un programa que diga si un número introducido por
 *teclado es par y/o divisible entre 5.
 *
 *@author Margarita B. V
 */
 
public class Ejer14 {
  public static void main (String[] args){
    System.out.print("\n Vamos a calcular si un número es par y/o divisible entre 5:\n ");
    System.out.print("Introduce un número: ");
    double num = Double.parseDouble(System.console().readLine());
    boolean par = false; // Utilizamos el bolean para preguntar
    boolean NumeroDivEntreCinco = false; // falso
    
    
    // primero realizamos las operaciones para saber si es par o divisible entre 5
    if ((num % 2) == 0){
      par = true; // verdadero
    }
    if ((num % 5) == 0){
      NumeroDivEntreCinco = true;
    }
    
    // A continuación especificamos el resultado tal y como nos lo piden
    
    if ((par == true) && (NumeroDivEntreCinco == true)){
      System.out.print("El número introducido (" + num + ") es par y ");
      System.out.print("divisible entre 5.");
    }else if (par == true){
      System.out.print("El número introducido (" + num + ") es par pero ");
      System.out.print("no es divisible entre 5.");
    }else if (NumeroDivEntreCinco == true){
      System.out.print("El número introducido (" + num + ") no es par pero ");
      System.out.print("es divisible entre 5.");
    }else{
      System.out.print("El número introducido (" + num + ") no es par y ");
      System.out.print("no es divisible entre 5.");
    }
  }
}
