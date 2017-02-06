/**
 * Este programa muestra un array de 12 numeros enteros aleatorios.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class muestraArrayAleatorio {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un array de 12 numeros enteros aleatorios.");
    
    int num[] = new int [12];
    
    //int numeros = (int)(Math.random()*220) + 330; // números aleatorios entre 330 y 550 sin array
    
    for (int x = 0; x < num.length; x++) { // GUARDA EN EL ARRAY LOS NUMEROS ALEATORIOS ENTRE 1 Y 12
      num[x] = (int)(Math.random()*12 + 1);
    } 
    
    for (int x = 0; x < num.length; x++) { // LOS MUESTRA 
      System.out.println ("El elemento " + x + "\t del array es: \t " + num[x]);
    }       //los valores que no se inicializan java los pone a 0.
  }
}
