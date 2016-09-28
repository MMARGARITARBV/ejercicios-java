/**
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto
 * a su correspondiente traducción al castellano. Las palabras deben estar
 * distribuidas en dos columnas y alineadas a la izquierda.
 *
 * @author Margarita B. V
 */

public class Ejer03 { // Clase principal
  public static void main(String[] args) {
    System.out.println("PALABRAS EN INGLES Y CASTELLANO"); //formateado de texto izq (-)
      System.out.printf("%-10s      %-12s  %-12s \n", 				"INGLES","CASTELLANO","PAJARITO");
      System.out.println("Bee     \t" + "Abeja");
      System.out.println("Eagle   \t" + "Aguila");
      System.out.println("Moose   \t" + "Alce");
      System.out.println("Clams   \t" + "Almejas");
      System.out.println("Lark    \t" + "Alondra");
      System.out.println("Anchovy \t" + "Anchoa");
      System.out.println("Eel     \t" + "Anguila");
      System.out.println("Antelope\t" + "Antilope");
      System.out.println("Spide   \t" + "Arana");
      System.out.println("Squirrel\t" + "Ardilla");
   
  }
}
