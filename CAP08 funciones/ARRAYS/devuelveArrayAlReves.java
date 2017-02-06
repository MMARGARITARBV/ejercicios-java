/**
 * Este programa guarda dentro de un array 10 numeros introducidos y los devuelve mostrados al revés.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class devuelveArrayAlReves {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un array de 10 numeros introducidos por tecladoenteros aleatorios.");
    
    int num[] = new int [10];
    
    for (int x = 0; x < 10; x++) { // GUARDA EN EL ARRAY CON DATOS INTRODUCIDO POR TECLADO
     System.out.print("Por favor, introduzca el numero: ");
     num[x] = Integer.parseInt(System.console().readLine());
    } 
    
    System.out.println("-----------------------------------");
    
    // num.length-1 en ese caso es igual a 9(posición 9)
    for (int x = num.length-1; x >= 0; x--) { // LOS MUESTRA INVIRTIENDO EL INDICE Y POR TANTO LOS DATOS
      System.out.println ("El elemento " + (x + 1) + "\t del array es: \t " + num[x]);
    }       
  }
}
