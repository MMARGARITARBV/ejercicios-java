/*
 
Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
y el 210 ambos incluidos.
Ejemplo:
203 322 140 336 217 203 175 266 301 182
 * 
 */

public class numerosMultiplos {
  public static void main(String[] args) {

  System.out.println("\nEste programa muestra una secuencia aleatoria de 10 números múltiplos de 7:\n");
  System.out.print("Los multiplos de 7, entre el 140 y el 210 ambos incluidos son los siguientes: ");

  int multiplos = 0;     
    while (multiplos < 10){
        
        int numerosMultiplos = 0;
        int numeros = (int)(Math.random()*70) + 140; // números aleatorios entre 330 y 550
        //System.out.println(numeros+ " ");
        numerosMultiplos = numeros;

         if (numerosMultiplos % 7 == 0) { // si es multiplo de 7 lo muestra
         System.out.print(numerosMultiplos +" ");
         multiplos++;
         }
    }
    System.out.println(" ");
    //System.out.print( multiplos +"\n" );// multiplos es el contador de números múltiplos
  }
}

