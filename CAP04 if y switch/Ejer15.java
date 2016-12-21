/**
 *Ejercicio 15: Escribe un programa que pinte una pirámide rellena con un
 *carácter introducido por teclado que podrá ser una letra, un número o un
 *símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario mediante
 *un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia
 *abajo, hacia la izquierda o hacia la derecha.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer15 {
  public static void main (String[] args){
    System.out.print("Introduzca un carácter para pintar nuestra pirámide: ");
    char caracter = (System.console().readLine()).charAt(0); // utilizamos char para guardar un caracter en una variable y charAt es un método para mostrar los carácteres
    
    
    System.out.println("¿Hacia donde quiere que este la punta de la pirámide?, escriba la opcion con número: ");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Derecha");
    System.out.println("4. Izquierda");
    System.out.println("5. Rombo");
    int eleccion = Integer.parseInt(System.console().readLine());
    
    switch (eleccion){  // lo utilizamos por ser más util a la hora de programar
      case 1:
        System.out.println("     "+ caracter); // opcion ARRIBA
        System.out.println("    "+ caracter+caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        break;
      case 2:           // OPCION ABAJO
        System.out.println(" "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter+caracter+caracter);
        System.out.println("    "+ caracter+caracter+caracter);
        System.out.println("     "+ caracter);
        break;
      case 3:            // OPCION DERECHA
        System.out.println("     "+ caracter);
        System.out.println("    "+ caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter);
        System.out.println(" "+ caracter+caracter+caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter);
        System.out.println("    "+ caracter+caracter);
        System.out.println("     "+ caracter);
        break;
      case 4:            // OPCION IZQUIERDA
        System.out.println("     "+caracter+ "");
        System.out.println("    "+caracter+caracter+"");
        System.out.println("   "+caracter+caracter+caracter+"");
        System.out.println("  "+caracter+caracter+caracter+caracter+"");
        System.out.println(" "+caracter+caracter+caracter+caracter+caracter +"");
        System.out.println("  "+caracter+caracter+caracter+caracter +"");
        System.out.println("   "+caracter+caracter+caracter+ "");
        System.out.println("    "+caracter+caracter+"");
        System.out.println("     "+caracter+"");
        break;
      case 5:           // OPCION ROMBO
        System.out.println("     "+ caracter);
        System.out.println("    "+ caracter+caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println("  "+ caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println("   "+ caracter+caracter+caracter+caracter+caracter);
        System.out.println("    "+ caracter+caracter+caracter);
        System.out.println("     "+ caracter);
        break;
      default:
        System.out.print("dato introducido incorrecto");
        break;
    }
  }
}
