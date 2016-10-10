/**
 *Ejercicio 4: Vamos a ampliar uno de los ejercicios de la relación anterior
 *para considerar las horas extras. Escribe un programa que calcule el salario
 *semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 
 *primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora
 *41, se pagan a 16 euros la hora.
 *
 *@author Margarita B. V
 */
 
public class Ejercicio04 {
  public static void main (String[] args){
    System.out.print("Introduzca el número de horas trabajadas: ");
    double horasTotal = Double.parseDouble(System.console().readLine());
    double horasExtra = 0.0;
    
    if (horasTotal > 40){
      horasExtra = horasTotal - 40;
      horasTotal = 40;
    }
    
    System.out.println("Nº horas: " + horasTotal + " horas.");
    System.out.println("Nº horas extra: " + horasExtra + " horas.");
    System.out.println("Precio por hora: 12€/hora - 16€/hora extra.");
    System.out.print("Salario semanal: ");
    System.out.printf("%.2f€", ((horasTotal * 12) + (horasExtra * 16)));
  }
}
