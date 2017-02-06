/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
*introducidos junto con las palabras máximo y mínimo al lado del máximo y del mínimo
*respectivamente.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class maxYminArray {
  public static void main(String[] args) {
    System.out.println("Este programa lee numeros y muestra si es minimo o maximo.");
    
    //Escribe un programa que pida 10 números por teclado
    int num[] = new int [10];

    int max = 0;
    int min = 0;
    
    // funcion max o min. 

    
    // pido los numeros al usuario y los cargo en el array
    for (int x = 0; x < num.length; x++) {
      System.out.print("Por favor, introduzca un numero: ");
      num[x] = Integer.parseInt(System.console().readLine());
      if (x == 0) {
        min = num[x];     //Se inicializan el máximo y el mínimo con el primer número introducido
        max = num[x];
      }
      if (num[x] > max) {
        max = num[x];
      }
      if (num[x] < min) {
        min = num [x];
      }
    }

    //muestre los números introducidos junto con las palabras “máximo y “mínimo
    //al lado del máximo y del mínimo respectivamente.

    for (int x = 0; x < num.length; x++) { // muestro el array
      System.out.print("La posicion " + x + " del array es: " + num[x]);
      if (num[x] == max) {
        System.out.print(" maximo");
      }
      if (num[x] == min) {
        System.out.print(" minimo ");
      }
      System.out.println();
    }
  }
}
