/*
 * Ejemplo04.java
 * 
 * Copyright 2016 FPMARGA <fpmarga@fpmarga>
 * 
 * Escribe un programa que pida un número entero y un dígito 
 * y que diga a continuación cuántas veces aparece el dígito dentro del número.
 * 
 * Ejemplo 1:
 * Por favor, introduzca un número entero con 5 dígitos como máximo: 3667
 * Introduzca un dígito: 6
 * El 6 aparece 2 veces dentro de 3667.
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero con 5 dígitos como máximo: 85
 * Introduzca un dígito: 4
 * El 4 aparece 0 veces dentro de 85.
 * 
 * 
 */


public class Ejemplo0104 {
 
 public static void main (String args[]) {
  
  System.out.println("Este programa nos dice cuantas veces aparece un digito dentro de un numero");
  System.out.println("--------------------------------------------------------------------------\n");
  
  System.out.print("Por favor, introduzca un número entero con 5 dígitos como máximo: ");
  int numero = Integer.parseInt(System.console().readLine());
  int numeroAMostrar;
  
  numeroAMostrar = numero;
  
  
  System.out.print("Introduzca un dígito: ");
  int digito = Integer.parseInt(System.console().readLine());
  int auxiliar = 0;  
  
  while (numero > 0) {     
      if ((numero % 10) == digito){
       auxiliar++;
      }   
    numero = numero / 10; // lo hace hasta que pueda dividir el numero en 10
  } 
  
  System.out.printf("El %d aparece %d veces dentro de %d", digito, auxiliar, numeroAMostrar);// lo que tenemos que mostrar

 }
}

