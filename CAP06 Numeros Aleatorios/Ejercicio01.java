/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 *
 * @author Margarita B.V
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra la tirada de tres dados.");
    int dado = 0;
    int suma = 0;
    
    // realizamos las tres tiradas de datos aleatoriamente, entre 1 y 6
    for (int  x = 1; x <= 3; x++) {
    dado = (int)(Math.random() * 6 ) + 1;
    System.out.println("La tirada del " + x +"º dado es: " + dado); // x nos dice la tirada por la que vamos
    
    //sumamos los valores de la tiradas
    suma = suma + dado;
    }
    // mostramos el resultado de la suma
    System.out.println("La suma de las tiradas es: " + suma);
  }
}
