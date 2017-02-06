/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa cambia los valores de un array.");
    
    int num[] = new int [100];
    
    //generA 100 números aleatorios del 0 al 20
    for (int x = 0; x <= 99; x++) {
      num[x] = (int)(Math.random() * 21);
    }     
     //los muestra por pantalla separados por espacios.
    System.out.print("Los numeros son: ");
    for (int x = 0; x <= 99; x++) {
      System.out.print(num[x] + " ");
    }    
    
    System.out.println();   

    //El programa pedirá el primer valor
    System.out.print("Por favor, introduzca un numero del 0 al 20: ");
    int primerValor = Integer.parseInt(System.console().readLine());

    //El programa pedirá el segundo valor
    System.out.print("Por favor, introduzca el numero que quiera introducir: ");
    int segundoValor = Integer.parseInt(System.console().readLine());
        
    System.out.print("Los numeros son: ");
    for (int x = 0; x <= 99; x++) {
      //busca las ocurrencias que coincidan con el primer valor 
      if (num[x] == primerValor) {
       //y las guarda con el valor del segundoValor
        num[x] = segundoValor;
        System.out.print("'" + num[x] + "'");
      } else {
        System.out.print(num[x] + " ");
      } //muestra los números nuevos
    }    
  }
}
