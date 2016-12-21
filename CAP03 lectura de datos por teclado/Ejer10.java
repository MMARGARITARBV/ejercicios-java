/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Margarita Benitez
 * 
 * Lectura de datos desde teclado
 * 
 */

public class Ejer10 {
  public static void main(String[] args) {
    
    System.out.println(" \n CONVERSOR DE Mb a kb \n "  );
    
    System.out.print("Introduce la cantidad de Mb :  ");
    double mb = Double.parseDouble(System.console().readLine());
    
    double kb = mb * 1024 ;
    //double gb = mb / 1048576 ;
    //double tb = mb / 1073741824 ;
    
    System.out.println("--------------------------- "  );
    System.out.println("       DETALLE CONVERSOR     \n"  );
    
    System.out.printf("%.2f Mb = %.2f Kb \n", mb , kb );
    
    System.out.println("\nOTRAS CONVERSIONES  \n"  );
    
    //System.out.printf("%.2f Mb = %.8f Gb \n", mb , gb );
    //System.out.printf("%.2f Mb = %.8f Tb", mb , tb );
        
  }
}


