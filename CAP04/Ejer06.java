/**
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 *@author Margarita B. V
 */
 
public class Ejer04 {
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
