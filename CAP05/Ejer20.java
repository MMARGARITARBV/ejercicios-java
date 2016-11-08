/**
 *  que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * 
 * @author Margarita B.v
 */
public class Ejer20 {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pirámide hueca.");
    System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    char caracter = (System.console().readLine()).charAt(0);
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int alturainicial = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;
    int j = 0;
    int relleno = 0;

    while (altura < alturainicial) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print("_");
      }
      System.out.print(caracter);
      for (i = 1; i < relleno; i++) {
        System.out.print("l");
      }
      if (altura > 1) {
        System.out.print(caracter);
      }
        
      System.out.println();
      espacios--;
      altura++;
      relleno = relleno + 2;;
    }
  
    for (i = 1; i < (alturainicial * 2); i++) {
      System.out.print(caracter);
    }
    
  }
}
