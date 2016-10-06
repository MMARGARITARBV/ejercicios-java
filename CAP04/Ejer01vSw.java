/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */

public class Ejer01vSw {
  public static void main(String[] args) {
    
    System.out.println(" \n PRIMERA ASIGNATURA DEL DÍA EN DAW 1\n "  );
    
    System.out.print("Por favor, introduce el día de la semana de lunes a viernes:  ");
    String dia = System.console().readLine().toLowerCase();// ojo con toLower... el texto que compara tiene que ir en minúscula
    // .toUpperCase() tiene que ir el texto que compara con MAYUSCULAS, sino no lo lee y sale.
    System.out.println("");
    
    String asignatura;
    
    switch (dia) {
      case "lunes": // ojo con los dos puntos
        asignatura = " SISTEMAS INFORMATICOS";
        break; // se utiliza para que no siga realizando el proceso infinitamente
      case "martes":
        asignatura = " PROGRAMACIÓN";
        break;
      case "miercoles":
        asignatura = " PROGRAMACIÓN";
        break;
      case "jueves":
        asignatura = " BASES DE DATOS";
        break;
      case "viernes":
        asignatura = " LENGUAJE DE MARCA";
        break;
        
      default: // se utiliza en el caso de que no cumpla ninguno de los casos
        asignatura = "disculpa pero ese día no existe o no esta bien escrito";
      }  
       
      System.out.println("El " + dia + " la primera asignatura del día es" + asignatura); // mostramos el resultado. 
  }
}


