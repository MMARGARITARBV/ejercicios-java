/**
 *Ejercicio 3: Escribe un programa en que dado un número del 1 a 7 escriba el
 *correspondiente nombre del día de la semana.
 *
 *@author Margarita B. V
 */
 
public class Ejer03 {
  public static void main (String[] args){
    System.out.print("Introduzca el día de la semana en números (1-7): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaSem = "";
    
    switch (dia){
      case 1:
        diaSem = "Lunes";
        break;
      case 2:
        diaSem = "Martes";
        break;
      case 3:
        diaSem = "Miércoles";
        break;
      case 4:
        diaSem = "Jueves";
        break;
      case 5:
        diaSem = "Viernes";
        break;
      case 6:
        diaSem = "Sábado";
        break;
      case 7:
        diaSem = "Domingo";
        break;
      default: // default son todos los valores que no estan dentro de los case. 
        dia = 0; 
    }
    
    if (dia != 0){ 
      System.out.println("El día número " + dia + " de la semana es el " + diaSem);
    }else{
      System.out.println("Error: Día de la semana incorrecto.");
    }
  }
}
