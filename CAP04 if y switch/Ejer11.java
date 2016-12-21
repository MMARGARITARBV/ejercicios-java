/**
 *Ejercicio 11: Escribe un programa que dada una hora determinada
 *(horas y minutos), calcule los segundos que faltan para llegar a la
 *medianoche.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer11 {
  public static void main (String[] args){
    
    System.out.print("\nCALCULA CUANTO FALTA PARA LLEGAR A MEDIANOCHE.\n");
    
    System.out.print("Introduzca la hora (sin minutos): ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos;
    int horasDiferencia;
    int minutosDiferencia;
    
    if ((horas < 0) || (horas >= 24)) {
      System.out.print("\n Intervalo de hora no válido.");
    } else if ((minutos < 0) || (minutos >= 60)) {
      System.out.print("\nIntervalo de minuto no válido.");
    } else {
      // Al cumplir las condiciones realizamos las operaciones 
      horasDiferencia = 24 - horas - 1 ; 
      minutosDiferencia = 60 - minutos ;
      segundos = (horasDiferencia * 3600) + (minutosDiferencia * 60) ;
      
      System.out.println("\nSon las " + horas + ":" + minutos );
      System.out.print("Faltan " + segundos + " segundos para media noche.");
    }
  }
}
