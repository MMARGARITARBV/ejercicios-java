/**
 * 
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 * 
 * @author Margarita Benitez
 *  */
public class Ejer07 {

  public static void main(String[] args) {
    
    System.out.println("\n ** ADIVINA LA CONTRASEÑA DE MI CAJA FUERTE **  "  );
    System.out.println("**********************************************"); 
    
    System.out.println("NOTA : Tienes solo 4 posibilidades para abirla"  );
    System.out.println("PISTA: La combinación es un número de 4 cifras\n"  );
   
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 1234) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
