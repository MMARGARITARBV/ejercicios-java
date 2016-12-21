/**
 * 
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author Margarita Benitez
 */
public class Ejer46 {
  public static void main(String[] args) {
 
  System.out.println("**** Vamos a pintar un rectángulo hueco hecho con asteriscos.****\n");
  System.out.println("NOTA: Recuerda que para que no te de error la altura y el ancho deben ser mayor o igual que dos y números enteros.\n");
  System.out.print("Por favor, introduzca la altura: ");
  int altura = Integer.parseInt(System.console().readLine()); 
  System.out.print("Por favor, introduzca el ancho: ");
  int ancho = Integer.parseInt(System.console().readLine());   	
 
  
  String simbolo = "*";

  int espaciosInteriores = ancho - 2;
  int uno = ((int)(Math.random()*(ancho - 2)) + 1);
  int dos = ((int)(Math.random()*(altura - 2))  +1); 

    if ((altura >= 2) && (ancho >= 2)){
   
       for (int i = 0; i < ancho; i++) {
        System.out.print(simbolo); //Imprime primera linea, la parte de arriba
      }
      
      System.out.println ();
        
        for (int i = 0; i < altura - 2 ; i++) {

          System.out.print(simbolo); 

          for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores

            if ((uno == j ) && (dos == i)){

            System.out.print(" ");

            } else  {
            System.out.print(" ");
            }
        
          }    
        System.out.print(simbolo);
        System.out.println ();
      }
       
      for (int i = 0; i < ancho; i++) {
        
        System.out.print(simbolo); //Imprime ultima linea, la parte de abajo
      }
      
    } else {  System.out.println("Error!!. La altura y el ancho tiene que ser superiores o iguales a 2");
    
    }
  }
}
