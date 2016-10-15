/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 * 
 *@author Margarita B. V
 */
 
public class Ejer02vSw {
  public static void main (String[] args){
    while(true){ // Creamos un bucle para que nos pida cuantas veces queramos la hora, el requisito es que sea la hora correcta,  hasta que escribamos "salir"
    System.out.print("Introduzca la hora, tenga en cuenta que es en formato 24h.: ");
    String line = System.console().readLine();
    int hora;// = Integer.parseInt(System.console().readLine());
    //String hora = System.console().readLine();
    
    try{ // convierte todos los caracteres a números
      hora = Integer.parseInt(line);
    }
    catch(NumberFormatException e){ // crea una excepción 
      if(line.equals("salir")){ // en este caso el programa seguirá pidiendo datos hasta que le digamos la palabra "salir"
        System.out.print("Adios ..."); // y al salir nos dirá "adiós..."
        break;
      }
      hora = 25;
    }
    
    String saludo;
    Boolean fecha_valida = true; // Boleanos
        
    switch (hora) {
      
        case 6: // al utilizar case no puedo incluir las operaciones. Es un valor donde no se pueden incluir operaciones
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
          saludo = "¡buenos días!";
          break;
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
          saludo = "¡buenas tardes!";
          break;          
        case 21:
        case 22:
        case 23:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          saludo = "¡buenas noches!";
          break;          
      
      default: // se utiliza en el caso de que no cumpla ninguno de los casos
        saludo = "Hora no válida.";
        fecha_valida = false;
      }  
       
      if(fecha_valida){
        System.out.println( "Hola, muy " + saludo ); // mostramos el resultado. 
      }
      else{
        System.out.println ("Muy mal: " + saludo);
      }
    
  }
}
}
