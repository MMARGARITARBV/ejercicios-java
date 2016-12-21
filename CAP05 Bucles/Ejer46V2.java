/**
 * 
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author Margarita Benitez
 */
public class Ejer46V2 {
  public static void main(String[] args) {
  System.out.println("Vamos a dibujar una Pecera.");
  System.out.println("Por favor, introduzca la altura que desee que tenga la pecera: ");
  int altura = Integer.parseInt(System.console().readLine()); 
  
  System.out.println("Por favor, introduzca el ancho que desee que tenga la pecera: ");
  int ancho = Integer.parseInt(System.console().readLine());    
 
  
  String simbolo = "#";
  
  int espaciosInteriores = ancho - 2;  
  int uno = ((int)(Math.random()*(ancho - 2)) + 1);  
  int dos = ((int)(Math.random()*(altura - 2))  +1); 
   
  
          
    for (int i = 0; i < ancho; i++) {   
      
      System.out.print(simbolo); //Imprime primera linea pecera               
      
    }
    
    System.out.println ();
      
    for (int i = 0; i < altura - 2 ; i++) {
   
   System.out.print(simbolo); 
   
   for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores   
    
     
    if ((uno == j ) && (dos == i)){
     
     System.out.print("@");
     
    } else  {
     System.out.print(" "); 
     
    } 
      
   
   } 
   System.out.print(simbolo); 
    
  System.out.println (); 
   
    }
     
    for (int i = 0; i < ancho; i++) {   
      
      System.out.print(simbolo); //Imprime ultima linea pecera               
      
    }                
  }
}
