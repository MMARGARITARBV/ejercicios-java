/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class ordenaArrayPrimeroPares {
  public static void main(String[] args) {
    System.out.println("Este genera un nuevo array con numero pares seguidos de impares.");
    
    int num[] = new int [20];
    int nuevo[] = new int [20];
    int i = 0;
    
    //genere 20 números enteros aleatorios entre 0 y 100 y los guarda en num[]
    for (int x = 0; x < 20; x++) {
      num[x] = (int)(Math.random()*101);
    }  
    
    //Muestra los números generados
    System.out.print("Los numeros generados son: ");
    for (int x = 0; x < 20; x++) {
      System.out.print(num[x] + " ");
    }
    System.out.println();
    System.out.println();
    
    //indicamos simplemente el nombre del array que queremos recorrer y en qué variable 
    //se va a ir colocando cada elemento con cada iteracción del bucle.
    
    for (int n : num) { //foreach
      //comprueba si es par
      if ((n % 2) == 0) {
        nuevo[i] = n;
        i++;
      }
    } //coloca los pares
    
    for (int n : num) {
      if ((n % 2) != 0) {
        nuevo[i] = n;
        i++;
      }
    } //coloca los impares
    
    for (int x = 0; x < 20; x++) {
      System.out.println("La posicion " + x + " es: " + nuevo[x]);
    } // los muestra
  }
}
