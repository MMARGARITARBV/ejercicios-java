/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Margarita Benitez
 * 
 * Lectura de datos desde teclado
 * 
 */

public class Ejer11 {
  public static void main(String[] args) {
    
    System.out.println(" \n CONVERSOR DE Kb a Mb \n "  );
    
    System.out.print("Introduce la cantidad de Kb :  ");
    double kb = Double.parseDouble(System.console().readLine());
    
    double mb = kb / 1024 ;
    double gb = kb / 1048576 ;
    double tb = kb / 1073741824 ;
    
    System.out.println("--------------------------- "  );
    System.out.println("       DETALLE CONVERSOR     \n"  );
    
    System.out.printf("%.2f Kb = %.2f Mb \n", kb , mb );
    
    System.out.println("\nOTRAS CONVERSIONES  \n"  );
    
    System.out.printf("%.2f Kb = %.2f Gb \n", kb , gb );
    System.out.printf("%.2f Kb = %.2f Tb", kb , tb );
        
  }
}


