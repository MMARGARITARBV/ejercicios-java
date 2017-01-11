/**
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Margarita B.V
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Este programa printa, al azar, caracteres.");
    int longitudLinea = (int)(Math.random() * 40) + 1; // genera la longitud aleatoriamente entre 1 y 40
    String caracter = " "; // Almacena los caracteres aleatorios en cada línea

    //
    for (int i = 1; i <= 10; i++) { // genera las 10 lineas que tenemos que pintar 
        for (int x = 1; x <= longitudLinea; x++) { // pinta los caracteres con una longitud aleatoria
          int numcaracter = (int)(Math.random() * 7) + 1; // generamos los caracteres aleatorios
          switch (numcaracter) { // especificamos los caracteres
            case 1:
            caracter = "*";
            break;
            case 2:
            caracter = "-";
            break;
            case 3:
            caracter = "=";
            break;
            case 4: 
            caracter = ".";
            break;
            case 5:
            caracter = "|";
            break;
            case 6:
            caracter = "@";
            break;
            default:
            break;
          }
        System.out.print(caracter); // pinta los caracteres
      }
      System.out.println(); // salto de linea
    }
  }
}
