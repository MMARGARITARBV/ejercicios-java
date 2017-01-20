/*
 * Ex05mmbv1.java
 * 
 * Copyright 2016 FPMARGA <fpmarga@fpmarga>
 * 
 * Realiza un programa que pida 10 números enteros por teclado. 
 * 
 * El programa tiene que decir cuál es el número que más se repite y cuántas veces se repite.
 * 
 * Si hay varios números repetidos las mismas veces, se da por bueno cualquiera de ellos.
 * 
 * 
 * Ejemplo:
 * Introduzca diez números enteros:
 * 23
 * 6789
 * -345
 * 8
 * 8
 * 6789
 * 9387
 * 2344
 * -1024
 * 8
 * 
 * El número que más aparece es el 8. Se repite 3 veces.
 * 
 * 
 */

//import java.util.*;

public class Ex05mmbv1 {
 
  public static void main (String args[]) {
    
    
    //int []numeroIntroducido = new int [10];
    
    System.out.println("Introduce 10 números diferentes y te diré cual se repite más y cuantas veces");
    System.out.println("-----------------------------------------------------------------------------\n");
    
       
    //int x; 
    int num[] = new int [10];
    
    int nuevo[] = new int [10];
    int contador = 0;
    int j = 0;
    
    
      for (int x = 0; x < 10; x++) { //pide los números y los guarda en num[x]
        System.out.print("Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
      }   
      
      
      // PINTA EL INDICE
      
      System.out.println("");
      System.out.println("índice\t\tNúmero");
      
      
      
      for (int x = 0; x < 10; x++) {
        System.out.print("  " + x + " \t\t" + "  " + num[x]); //x pinta el número que corresponde al indice y num[x] pinta el dato guardado
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador == 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
        System.out.println();
      } //Los muestra y pasa los primos a las primeras posiciones
      
      for (int x = 0; x < 10; x++) {
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador != 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
      } //pasa el resto de los números al resto de las posiciones
      
      System.out.println("\nASI QUEDA EL NUEVO ARRAY:");
      
      // PINTA EL NUEVO INDICE
      
      System.out.println("\níndice\t\tNúmero");
      
      
      for (int x = 0; x < 10; x++) {
        System.out.println( "  " + x + "\t\t" + "  " + nuevo[x]);
      } //Muestra el nuevo array
      
      /*
        
      for (x = 0 ; x < 10; x++ ){
        
        System.out.print("Introduce un número: " + (x + 1) + ":  ");
        numeroIntroducido[x] = Integer.parseInt(System.console().readLine());
        
      }
    
    //System.out.println(x +" ");
    System.out.println(Arrays.toString(numeroIntroducido));*/ //Muestra el array completo 
  }
}

