/**
 * 
 *Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
 * 330 y el 550 ambos incluidos.
 * Ejemplo:
 * 
 * 517 440 385 374 550 517 484 462 363 418
 *
 * @author Margarita Benitez V
 */
public class  Ex05mmbv2 {
  public static void main(String[] args) {
    System.out.print("Este programa muestra hasta 10 números Aleatorios, que deben ser múltiplos de 11, ");
    System.out.println("además deben estar comprendidos entre el 330 y el 550 ambos incluidos.\n");
    
    int multiplos = 0; // Cuenta los múltiplos de 11
    
    //Genera los números al azar y muestra todos los aleatorios y dentro de esos los que son multiplos
    while (multiplos < 10){
    
      int numerosMultiplos = 0;
      int numeros = (int)(Math.random()*220) + 330; // números aleatorios entre 330 y 550
      numerosMultiplos = numeros;
      //System.out.println("*"+ numeros+ "*");// muestra todos los números generados aleatoriamente
      if (numerosMultiplos % 11 == 0) { // Si entre los números aleatorios alguno es múltiplos de 11, los muestra.
        System.out.println(numerosMultiplos +" ");
        multiplos++;
      }
    }
    System.out.printf("\n\nEntre todos los números aleatorios existen %d multiplos de 11", multiplos);
  }
}
