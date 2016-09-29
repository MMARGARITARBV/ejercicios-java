/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * @author Margarita Benitez
 */

public class Ejer06 {
  public static void main(String[] args) {
    
    int baseImponible = 100;
    double totalIva  = baseImponible * 0.21;
    double totalFactura = totalIva + baseImponible;
        
    System.out.println("  FACTURA MERCADILLO \n "  );
    System.out.printf("Base Imponible:  %-1s%-6s", baseImponible ," Euros\n");
    System.out.printf("IVA           :  %-1s%-6s", totalIva, " Euros\n \n");
    System.out.printf("TOTAL FACTURA =  %-1s%-6s \n\n", (int)totalFactura ," Euros"); //casting de double a entero(int)   
    }
}


