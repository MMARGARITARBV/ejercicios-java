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
    
    System.out.println(" \n CALCULA TU SALARIO SEMANAL \n "  );
    
    System.out.print("Introduce las horas trabajadas:  ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());// entrada de datos (decimales por las medias y cuartos de hora)
    
    double totalSalario  = horasTrabajadas * 12;
        
    System.out.println("--------------------------- "  );
    System.out.println("       DETALLE SALARIO     \n"  );
    
    System.out.println("HORAS TRABAJADAS: " + horasTrabajadas );
    System.out.println("PRECIO HORA:      12€" );
    System.out.println("---------------------------\n"  );
    System.out.printf("TOTAL SALARIO:      %.1f€\n" , totalSalario);
    
    
  }
}


