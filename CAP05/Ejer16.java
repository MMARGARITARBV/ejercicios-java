/**
 *  Escribe un programa que diga si un número introducido por 
 *  teclado es o no primo. Un número primo es aquel que sólo es divisible entre él
 *  mismo y la unidad.
 *
 *  @author Margarita B.V
 */
 
public class Ejer16 {
  public static void main (String[] args){
    boolean esPrimo = true;
    
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int cont = 2;
    
    while ((esPrimo) && (cont <= (Math.abs(numero)/2) && 
          (Math.abs(numero) > 2))){
      if ((Math.abs(numero)%cont) == 0){
        esPrimo = false;
      }
      cont++;
    }
    
    if (esPrimo){
      System.out.print("El número " + numero + " es primo.");
    }else{
      System.out.print("El número " + numero + " no es primo.");
    }
  }
}
