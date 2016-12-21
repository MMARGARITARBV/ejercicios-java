/**
 *Ejercicio 10: Escribe un programa que calcule la media de un conjunto de
 *números positivos introducidos por teclado. A priori, el programa no sabe
 *cuántos números se introducirán. El usuario indicará que ha terminado de
 *introducir los datos cuando meta un número negativo.
 *
 *@author Margarita B. V
 */
 
public class Ejer10 {
  public static void main (String[] args){
    System.out.println("Vamos a calcular la media de varios números");
    System.out.println("-------------------------------------------");
    
    int contador = 0;
    int numero;
    double media = 0;
    
    do{
      System.out.print("\nINTRODUCE EL NÚMERO: ");
      numero = Integer.parseInt(System.console().readLine());
            
      if (numero >= 0){
        media += numero;
        contador++;
        System.out.print("\nRecuerde que el programa finaliza cuando introduce un NÚMERO NEGATIVO \n");
      }
    } while (numero >= 0);
    
    if (contador > 1 || media != 0){
      System.out.print("\nLa media de los números introducidos es de: ");
      System.out.printf("%.2f", (media)/(double)contador); // hacemos un Casting para mostrar los decimales
    } else{
      System.out.print("ERROR! No se ha introducido ningún número positivo.");
    }
  }
}
