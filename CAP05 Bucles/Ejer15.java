/**
 *Ejercicio 15: Escribe un programa que dados dos números, uno real (base) y un
 *entero positivo (exponente), saque por pantalla todas las potencias con base
 *el numero dado y exponentes entre uno y el exponente introducido. No se deben
 *utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 *5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 *
 *@author Margarita B.V
 */
 
public class Ejer15 {
  public static void main (String[] args){
    System.out.print("Introduzca un número para la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    int exponente;
    do{
      System.out.print("Intoduzca un número para el exponente: ");
      exponente = Integer.parseInt(System.console().readLine());
    }while (exponente <= 0);
    
    int resultado;
    
    for (int i = 1; i <= exponente; i++){
      System.out.print(base + "^" + i + " = ");
      resultado = 1;
      
      for (int j = 0; j < i; j++){
        resultado *= base;
      }
      
      System.out.print(resultado);
      
      if (i < exponente){
        System.out.print(", ");
      }
    }
  }
}
