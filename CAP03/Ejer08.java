/**
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Margarita Benitez
 */

public class Ejer08 {
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


