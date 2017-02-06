/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class primoPrimero {
  public static void main(String[] args) {
    System.out.println("Este genera un nuevo array con numeros primos.");
    
    int num[] = new int [10];
    int nuevo[] = new int [10];
    int contador = 0;
    int j = 0;
    
    //pida 10 números por teclado y que los almacene en un array.
      for (int x = 0; x < 10; x++) {
        System.out.print("Por favor, introduzca un numero: ");
        num[x] = Integer.parseInt(System.console().readLine());
      }   //pide los números
      
      //A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
      System.out.println("índice\t\t\t\tNumero");
      for (int x = 0; x < 10; x++) {
        System.out.print(x + "\t\t\t\t" + num[x]);

          for( int i = 2; i <= (num[x]/2); i++) {
            //Seguidamente el programa pasará los primos a las primeras posiciones,
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador == 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
        System.out.println();
      } // pasa los primos a las primeras posiciones
      
      for (int x = 0; x < 10; x++) {
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador != 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
      } //pasa el resto de los números al resto de las posiciones
      
      System.out.println("Asi queda el nuevo array:");
      System.out.println("indice\t\t\t\tNumero");
      for (int x = 0; x < 10; x++) {
        System.out.println(x + "\t\t\t\t" + nuevo[x]);
      } //Muestra el nuevo array
  }
}
