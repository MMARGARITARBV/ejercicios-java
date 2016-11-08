/**
 *Ejercicio 17: Realiza un programa que sume los 100 números siguientes a un 
 *número entero y positivo introducido por teclado. Se debe comprobar que el 
 *dato introducido es correcto (que es un número positivo).
 *
 *@author Margarita B.V
 */
 
public class Ejer17 {
  public static void main (String[] args){
    int numero = 0;
    int total = 0;
    
    do{
      if (numero < 0){
        System.out.println("Error! Número incorrecto."); // primero descartamos que sea un número negativo hasta que introduzcamos uno positivo.
      }
      System.out.print("Introduzca un número entero positivo: "); // mostramos mensaje de que debe introducir un número positivo
      numero = Integer.parseInt(System.console().readLine()); // introducimos número
    }while (numero < 0); // hasta que número sea mayor que 0
    
    for (int i = 0; i < 100; i++){ // Una vez ya cumple las condiciones hacemos que sume los 100 números siguientes. 
      total += numero;  // = a op1 a opn = op1 + op2 + op3 hasta opN 
      numero++;
    }
    
    System.out.print(total);
  }
}
