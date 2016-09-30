/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 *  Ejemplo 1:
 * 
 * Introduce la nota del primer examen: 7
 * ¿Qué nota quieres sacar en el trimestre? 8.5
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 * 
 * Ejemplo 2:
 * Introduce la nota del primer examen: 8
 * ¿Qué nota quieres sacar en el trimestre? 7
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 * 
 * @author Margarita Benitez
 */

public class Ejer12 {
  public static void main(String[] args) {
    
    System.out.println(" \nCALCULA LA NOTA MEDIA DESEADA DEL TRIMESTRE\n "  );
    
    System.out.print("Introduce la nota del primer examen:  ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
    
    System.out.print("Introduce la nota que quieres sacar en el segundo examen:  ");
    double segundoExamen = Integer.parseInt(System.console().readLine());
    
    double media  = ((primerExamen * 0.40) + (segundoExamen *0.60));
        
    System.out.println("--------------------------- "  );
    System.out.println("       DETALLE SALARIO     \n"  );
    
    System.out.printf("NOTA PRIMER EXAMEN: %.2f \n" , primerExamen );
    System.out.printf("NOTA SEGUNDO EXAMEN: %.2f \n", segundoExamen );
    System.out.println("---------------------------"  );
    System.out.printf("TU MEDIA SERIA DE:   %.2f\n" , media);
    
  
    
    
  }
}


