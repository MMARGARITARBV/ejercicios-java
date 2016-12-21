/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer22vSw {
  public static void main (String[] args){
    
    System.out.print("\n¿CUANTOS MINUTOS FALTAN PARA EL FIN DE SEMANA?:\n");
        
    System.out.print("\nIntroduzca el día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine().toLowerCase();
    
    // verificamos si es correcto el día introducido y le asignamos una variable con un valor a cada día de la semana.
    
    int diaDeLaSemana = 0;
      
      switch(dia) {
        case "lunes":
          diaDeLaSemana = 0;
          break;
        case "martes":
          diaDeLaSemana = 1;
          break;
        case "miércoles":
        case "miercoles":
          diaDeLaSemana = 2;
          break;
        case "jueves":
          diaDeLaSemana = 3;
          break;
        case "viernes":
          diaDeLaSemana = 4;
          break;
          
        default:
          System.out.print("El día introducido no es correcto.");
      }
    
    
    System.out.print("\nIntroduzca la hora (sin minutos): ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("\nIntroduzca los minutos: \n ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    // verificamos si la hora introducida se encuentra en los intervalos correctos. 
    
        
    if ((horas < 0) || (horas >= 24)) {
      System.out.print("\n Intervalo de hora no válido.");
    } else if ((minutos < 0) || (minutos >= 60)) {
      System.out.print("\nIntervalo de minuto no válido.");
    } else {
      
    // Al cumplir las condiciones realizamos las operaciones 
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaDeLaSemana * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana."); 
    
    }
  }
}
