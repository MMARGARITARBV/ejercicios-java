/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Margarita Benitez
 */

public class Ejer07 {
  public static void main(String[] args) {
    
    System.out.println(" \nCALCULA LA NOTA MEDIA DE TRES ASIGNATURAS\n "  );
    
    System.out.print("Introduce la nota del primer examen de FOL:  ");
    double primerExamenFol = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen de FOL:  ");
    double segundoExamenFol = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del tercer examen de FOL:  ");
    double tercerExamenFol = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
    
    System.out.print("Introduce la nota del primer examen de PROGRAMACIÓN:  ");
    double primerExamenProgra = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen de PROGRAMACIÓN:  ");
    double segundoExamenProgra = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del tercer examen de PROGRAMACIÓN:  ");
    double tercerExamenProgra = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
      
    System.out.print("Introduce la nota del primer examen de BBDD:  ");
    double primerExamenBbdd = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen de BBDD:  ");
    double segundoExamenBbdd = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del tercer examen de BBDD:  ");
    double tercerExamenBbdd = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
    
    double notaMediaFol  = (primerExamenFol + segundoExamenFol + tercerExamenFol) / 3;
    double notaMediaProgra  = (primerExamenProgra + segundoExamenProgra + tercerExamenFol) / 3;
    double notaMediaBbdd  = (primerExamenBbdd + segundoExamenBbdd + tercerExamenFol) / 3;
        
    System.out.println("--------------------------- "  );
    System.out.println("       RESUMEN NOTAS     \n"  );
    System.out.println("---------------------------"  );
    
    System.out.printf("Nota media FOL: %.2f \n" , notaMediaFol );
    System.out.printf("Nota media PROGRAMACIÓN: %.2f \n", notaMediaProgra );
    System.out.printf("Nota media BASES DE DATOS: %.2f\n" , notaMediaBbdd);
    
  
    
    
  }
}


