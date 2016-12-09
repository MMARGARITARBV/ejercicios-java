/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Margarita B.V
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra, al azar, 50 números entre 100 y 199.");
    System.out.println("Además muestra el máximo, el mínimo y la media de esos números.\n");
   
    //int minimo = Integer.MAX_VALUE; // Almacena un valor muy alto para hacer el mínimo
    //int maximo = Integer.MIN_VALUE; // Almacena un valor muy pequeño para hacer el máximo
    
    int minimo = 200;
    int maximo = 99;
    
    int suma = 0; // Almacenará la suma total de todos los números
    System.out.println();
   
    
    // Genera los 50 números aleatorios, y realiza el mínimo, el máximo y la suma total
    for(int x = 0; x < 50; x++) {
      int numeros = (int)(Math.random() * 100) + 100;
      System.out.print(numeros + " ");
      
      
      if (numeros > maximo) { // obtengo el valor minimo y maximo de todos los valores y dejo solo el valor mínimo y máximo
        maximo = numeros;
      } else if (numeros < minimo) {
        minimo = numeros;
      }
      suma = suma + numeros;      
    }
    
        
    System.out.println("\n");
    System.out.println("El menor de los números es: " + minimo + "\n");
    System.out.println("El mayor de los números es: " + maximo + "\n");
    System.out.printf("La media de los números es: %.2f", ((double)suma/50.0));

  }
}
