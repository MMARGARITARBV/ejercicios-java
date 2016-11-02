/**
 *Ejercicio 19: Realiza un programa que pinte una pirámide por pantalla. La 
 *altura se debe pedir por teclado. El carácter con el que se pinta la pirámide 
 *también se debe pedir por teclado.
 *
 *@author Margarita B.V
 */
 
public class Ejer19 {
  public static void main (String[] args){
    int altura;
        
    do{
      System.out.print("Introduzca la altura de la pirámide: ");
      altura = Integer.parseInt(System.console().readLine());
    }while (altura <= 0);
    
    System.out.print("Introduzca el carácter para pintar la pirámide: ");
    char caracter = (System.console().readLine()).charAt(0);
    
    for (int i = 0; i < altura; i++){
      /*for (int espacios = 0; espacios < altura - (i+1); espacios++){
        System.out.print(" ");
      }
      for (int j = 0; j <= i * 2; j++){
        System.out.print(caracter);
      }*/
      System.out.println();
    }
  }
}
