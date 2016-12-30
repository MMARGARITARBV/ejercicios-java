/*
 * escalera.java
 * 
 * Copyright 2016 FPMARGA <fpmarga@fpmarga>
 * 
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha.
 * 
 * El programa pedirá el número de escalones y la altura de cada escalón. 
 * 
 * La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 * 
 */


public class escalera {
	
	public static void main (String args[]) {
		
    System.out.println("ESTE PROGRAMA PINTA UNA ESCALERA");
    System.out.println("---------------------------------\n");
    
    System.out.print("Introduce el número de escalones: ");
    int numEscalones = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la anchura de cada escalón: ");
    int anchuraEscalon = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nIntroduciendo altura y numero de escalones: \n");
      
      for(int z = 0; z < numEscalones; z++){ //  sin tener en cuenta la altura del escalón
        for (int y = 0 ; y < alturaEscalon ; y++){
          for (int x = 0; x < 4 + 4 * z ; x++) {
            System.out.print("*");
          }
        System.out.println();
        }
      }
      
      System.out.println("\nIntroduciendo altura y numero de escalones: \n");
      
      for(int z = 0; z < numEscalones; z++){ // teniendo en cuenta la altura y  el numero de escalones
        for (int y = 0 ; y < alturaEscalon ; y++){
          for (int x = 0; x < 4 + numEscalones * z ; x++) {
            System.out.print("*");
          }
        System.out.println();
        }
      }
      
      System.out.println("\nIntroduciendo todos los datos: \n");
      
      for(int z=0; z < numEscalones; z ++){  // introduciendo todos los datos  
      for(int y = 0 ; y < alturaEscalon; y++){
        for (int x = 0 ; x < anchuraEscalon + anchuraEscalon * z; x++) {//ancho de los escalones
          System.out.print("*");
        }
        System.out.print("\n");
      }
    }
    
	}
}

