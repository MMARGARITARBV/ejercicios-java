/**
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto
 * a su correspondiente traducción al castellano. Las palabras deben estar
 * distribuidas en dos columnas y alineadas a la izquierda.
 *
 * @author Margarita B. V
 * 
 * Salida de datos por pantalla. 
 */

public class Ejer03 { // Clase principal
  public static void main(String[] args) {
    //System.out.println("  PALABRAS EN INGLES Y CASTELLANO  "); //formateado de texto izq (%-) a la derecha %. Especificar tipo de dato
      System.out.printf("%-8s %-8s \n", "INGLES" , "CASTELLANO");// Los espacios entre los % cuentan como espacio más.
      System.out.printf("%-8s %-8s \n","Bee" , "Abeja");
      System.out.printf("%-8s %-8s \n","Eagle" , "Aguila");
      System.out.printf("%-8s %-8s \n","Moose" , "Alce");
      System.out.printf("%-8s %-8s \n","Clams" , "Almejas");
      System.out.printf("%-8s %-8s \n","Lark" , "Alondra");
      System.out.printf("%-8s %-8s \n","Anchovy" , "Anchoa");
      System.out.printf("%-8s %-8s \n","Eel" , "Anguila");
      System.out.printf("%-8s %-8s \n","Antelope" , "Antilope");
      System.out.printf("%-8s %-8s \n","Spide" , "Arana");
      System.out.printf("%-8s %-8s \n","Squirrel" , "Ardilla");
   
  }
}
