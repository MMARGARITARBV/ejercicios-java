/**
 *Ejercicio 4: Vamos a ampliar uno de los ejercicios de la relación anterior
 *para considerar las horas extras. Escribe un programa que calcule el salario
 *semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 
 *primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora
 *41, se pagan a 16 euros la hora.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer04 {
  public static void main (String[] args){
    System.out.print("Introduzca el número de horas trabajadas:  ");
    String line = System.console().readLine();
    System.out.println("");
    
    double horas = 0.0 ; 
    
    try{ // convierte todos los caracteres a números y crea la exception para que no de error cuando introducimos caracteres especiales.
      horas = Double.parseDouble(line);
    }
    catch(NumberFormatException e){
    }
    
    double salario;
    
    if ((horas > 0) && (horas <= 40)) {
      salario = horas * 12;
      System.out.println("Nº horas: " + horas + " horas.");
      System.out.printf("El salario semanal es igual a: %.2f€ ", salario);
    } else if (horas > 40){
      salario = 480 + ((horas - 40) * 16);
      System.out.println("Nº horas: " + horas + " horas.");
      System.out.printf("El salario semanal es igual a: %.2f€ ", salario);
    } else {
      System.out.println("Disculpa pero el número de horas es erróneo ");  
    }    
  }
}
