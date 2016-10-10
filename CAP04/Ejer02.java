/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 * 
 *@author Margarita B. V
 */
 
public class Ejer02 {
  public static void main (String[] args){
    System.out.print("Introduzca la hora, tenga en cuenta que es en formato 24h.: ");
    String line = System.console().readLine();
    
    int hora ;
    
    try{ // convierte todos los caracteres a números
      hora = Integer.parseInt(line);
    }
    catch(NumberFormatException e){ // crea una excepción 
      hora = 69;
    }
    
    if (hora >= 6 && hora <=12){
      System.out.print("¡Buenos días!");
    }else if (hora > 12 && hora <= 20){
      System.out.print("¡Buenas tardes!");
    }else if ((hora > 20 && hora < 24) || (hora >= 0 && hora < 6)){
      System.out.print("¡Buenas noches!");
    }else{
      System.out.print("Hora no válida.");
    }
  }
}
