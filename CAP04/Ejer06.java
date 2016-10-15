/**
 *Ejercicio 6: Realiza un programa que calcule el tiempo que tardará en caer un
 *objeto desde una altura h.
 *
 *@author Margarita B. V
 */
 
public class Ejer06 {
  public static void main (String[] args){
    System.out.println("Vamos a calcular el tiempo que tardará en caer un objeto \n");
       
    System.out.print("Introduzca la altura (h) desde donde va a caer, en metros: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double t = Math.sqrt((2 * h) / 9.81); // tengo en cuenta los m/s2??
    
    if (h <= 0) {
      System.out.println("La altura no puede ser un número negativo ni 0"); //no existe solución real de la raíz cuadrada de un número negativo)
    } else {
      System.out.println("El objeto tardará en caer " + (int)t + " segundos. \n" ); // puedo hacer un casting
    }
    
    System.out.println("Segunda forma de escribir el ejercicio mostrando el tiempo con decimales \n");
    
    if (h <= 0){
      System.out.println("La altura no puede ser un número negativo ni 0 \n");
    }else{
      System.out.printf("El tiempo que tarda en caer es de: %.5f segundos ", t);
    }
  }
}
