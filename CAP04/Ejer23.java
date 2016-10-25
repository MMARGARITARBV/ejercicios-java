/**
 *Escribe un programa que calcule el precio final de un producto según su
 *base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 *reducido o superreducido) y el código promocional. Los tipos de IVA general,
 *reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
 *gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 *se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
* muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author Margarita Benitez V
 */
public class Ejer23 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el precio final de un produgto según su base imponible.");
    System.out.println("Por favor, recuerde ingresar los datos correspondientes (respete mayúsculas).");
    
    System.out.print("Por favor, introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine().toLowerCase());
    System.out.println("Los tipos de IVA son los siguientes: ");
    System.out.println("1. General ");
    System.out.println("2. Reducido ");
    System.out.println("3. Superreducido ");
    System.out.print("Por favor, introduzca el tipo de IVA: ");
    String tipodeIva = System.console().readLine();
    System.out.println("Los codigos promocionales son: ");
    System.out.println("1. Nopro ");
    System.out.println("2. Mitad ");
    System.out.println("3. Meno5 ");
    System.out.println("4. 5proc ");
    System.out.print("Por favor, introduzca el código promocional: ");
    String codigoPromocional = System.console().readLine();
    
    double iva = 0;
    double totalIva = 0;
    double totalPromocion = 0;
    double total = 0;
    
    switch (tipodeIva) {
      case ("General"):
      iva = (baseImponible * 21) / 100;
      totalIva = baseImponible + iva;
      break;
      case ("Reducido"):
      iva = (baseImponible * 10) / 100;
      totalIva = baseImponible + iva;
      break;
      case ("Superreducido"):
      iva = (baseImponible * 4) / 100;
      totalIva = baseImponible + iva;
      break;
      default:
      break;
    }
    
    switch (codigoPromocional) {
      case ("Nopro"):
      totalPromocion = 0;
      total = totalIva - totalPromocion;
      break; 
      case ("Mitad"):
      totalPromocion = totalIva / 2;
      total = totalIva - totalPromocion;
      break; 
      case ("Meno5"):
      totalPromocion = 5;
      total = totalIva - totalPromocion;
      break; 
      case ("5proc"):
      totalPromocion = (totalIva * 5) / 100.00;
      total = totalIva - totalPromocion;
      break; 
      default:
      break;
    }
      
    System.out.print("Base Imponible:\t\t");
    System.out.printf("%.2f\n", baseImponible);
    System.out.print("Iva (" + tipodeIva + ")\t\t");
    System.out.printf("%.2f\n", iva);
    System.out.print("Precio con IVA\t\t");
    System.out.printf("%.2f\n", totalIva);
    System.out.print("CodPromo (" + codigoPromocional + ")\t");
    System.out.printf("-%.2f\n", totalPromocion);
    System.out.print("TOTAL\t\t\t");
    System.out.printf("%.2f", total);
  }
}
