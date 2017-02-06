
/**
 * Este programa guarda dentro de un array 10 numeros introducidos por teclado y los muestra.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class muestraArrayIntroducido {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un array de 10 numeros introducidos por tecladoenteros aleatorios.");
    
    int num[] = new int [10];
    
    for (int x = 0; x < num.length; x++) { // GUARDA EN EL ARRAY CON DATOS INTRODUCIDO POR TECLADO
     System.out.print("Por favor, introduzca el numero: ");
     num[x] = Integer.parseInt(System.console().readLine());
    } 
    
    System.out.println("-----------------------------------");
    
    for (int x = 0; x < num.length; x++) { // LOS MUESTRA 
      System.out.println ("El elemento " + x + "\t del array es: \t " + num[x]);
    }       //los valores que no se inicializan java los pone a 0.
  }
}
