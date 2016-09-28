/**
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asignales los valores 144 y 999 respectivamente. A continuación, muestra
 * por pantalla el valor de cada variable, la suma, la resta, la división y 
 * la multiplicación.
 * 
 * @author Margarita Benitez
 */

public class Ejer01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;

    int suma = x + y;
    System.out.println("La suma es igual a = " + suma);
    
    int resta = x - y;
    System.out.println("La resta es igual a = " + resta);
    
    int division = x + y;
    System.out.println("La división es igual a =  " + division);
    
    int multiplicacion = x * y;
    System.out.println("La multiplicación es igual a = " + multiplicacion);   
  }
}

