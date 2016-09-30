/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 * @author Margarita Benitez
 */

public class Ejer07 {
  public static void main(String[] args) {
    
    System.out.println(" \n CALCULA EL TOTAL DE LA FACTURA CON MI PERRO CHARLI \n "  );
    
    System.out.print("Introduce la base imponible:  ");
    int baseImponible = Integer.parseInt(System.console().readLine());// entrada de datos (enteros)
    
    System.out.println("");
    
    double totalIva  = baseImponible * 0.21;
    double totalFactura = totalIva + baseImponible;
    
    System.out.println(" ---------------------- "  );
    System.out.println("|       FACTURA        |"  );
    System.out.println("|                      |"  );
    
    System.out.println("|Base Imponible:  " + baseImponible + '€'+" |");
    System.out.printf("|TOTAL IVA:      %.1f€ | \n" , totalIva);
    System.out.println("----------------------- "); //rayitas separando 
    System.out.println("|TOTAL FACTURA =  " + (int) totalFactura + '€' +" |" ); //casting de double a entero(int)
    System.out.println("----------------------- ");;
    System.out.println("       o          " );
    System.out.println("       o          " );
    System.out.println("        ◯         " ); //PREGUNTAR CARECTERES ESPECIALES EJER
    System.out.println("      ^ --- ^     " );
    System.out.println("     | @  @ |    '|'" );
    System.out.println("      |  *  |    '|' "  );
    System.out.println("       | u |------|  "  );
    System.out.println("        ---|      |  "  );
    System.out.println("           | |--|||  "  );
    System.out.println("           |_|  |||  "  );
  }
}


