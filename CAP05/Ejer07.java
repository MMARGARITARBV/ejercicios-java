/**
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Margarita B. V
 */

public class Ejer07 {
  public static void main(String[] args) {
    
    System.out.println("\n ** ADIVINA LA CONTRASEÑA DE MI CAJA FUERTE **  "  );
      System.out.println("**********************************************"); 
    
    System.out.println("NOTA : Tienes solo 4 posibilidades para abirla"  );
    System.out.println("PISTA: La combinación es un número de 4 cifras"  );
    System.out.println("\nINTRODUCE LA CONTRASEÑA:\n"  );
    int contrasena = Integer.parseInt(System.console().readLine());
       
    int numero = 320;
    
    do {
      System.out.println(numero);
      numero -= 20;
    } while (numero >= 160); 
    
  
     * WHILE
    contraseña; 
       
    while (contrasena == 1936) { // mientras número mayor o igual que 160
      System.out.println("la contraseña es incorrecta"); //sentencia
      numero -= 20; // Realiza el bucle negativo hasta 160 de 20 en 20
    }
           
    CON FOR
     
     for (int numero = 320; numero >= 160; numero -= 20) { // (numero = numero - 20)  es igual que escribir (numero -= 20)  
      System.out.println(numero);
    }   
    */
  }
}


