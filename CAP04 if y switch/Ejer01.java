/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @ Margarita Benitez V
 * 
 * Sentencia Condicional (if y switch)
 */

public class Ejer01 {
  public static void main(String[] args) {
    
    System.out.println(" \n PRIMERA ASIGNATURA DEL DÍA EN DAW 1\n "  );
    
    System.out.print("Por favor, introduce el día de la semana de lunes a viernes:  ");
    String diaDeLaSemana = System.console().readLine().toLowerCase();// ojo con toLower... el texto que compara tiene que ir en minúscula
    // .toUpperCase() tiene que ir el texto que compara con MAYUSCULAS, sino no lo lee y sale.
    System.out.println("");
    
    if (diaDeLaSemana.equals("lunes")){
      System.out.println(" El día lunes tienes SISTEMAS INFORMATICOS");
    } else if (diaDeLaSemana.equals ("martes")) {
      System.out.println(" El día martes tienes PROGRAMACIÓN");
    } else if (diaDeLaSemana.equals("miercoles")) {
      System.out.println(" El día miércoles tienes PROGRAMACIÓN");
    } else if (diaDeLaSemana.equals("jueves")) { // si pones jueves en Mayuscula te da error cuando lo escribes con toLowerCase. debo usar toUpperCase
      System.out.println(" El día jueves tienes BASES DE DATOS");
    } else if (diaDeLaSemana.equals("viernes")) {
      System.out.println(" El día viernes tienes LENGUAJE DE MARCA");
    } else {
      System.out.println(" disculpa pero ese día no existe o no esta bien escrito");  
    }    
  }
}


