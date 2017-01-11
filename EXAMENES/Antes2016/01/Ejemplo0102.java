/*
 * Ejemplo0102.java
 * 
 * Copyright 2016 FPMARGA <fpmarga@fpmarga>
 * 
 * Escribe un programa que genere una factura bien desglosada 
 * a partir del precio inicial, el descuento (si procede) y el IVA aplicado. 
 * 
 * 
 * El precio inicial se debe indicar en euros y puede tener decimales.
 *  
 * El programa preguntará si el artículo está en oferta; 
 * 
 * si contestamos que sí, se hace un 10% de descuento, 
 * si no, no hay descuento. 
 * 
 * El tipo de IVA puede ser 
 * 
 * 1) Superreducido siendo del 4%
 * 2) Reducido siendo del 10%
 * 3) General, siendo del 21% 
 *  
 * El IVA se aplica después de haber calculado el descuento.
 * 
 * 
 */


public class Ejemplo0102 {
 
 public static void main (String args[]) {
   
    System.out.println("Este programa GENERA UNA FACTURA BIEN DESGLOSADA.");
    
    System.out.print("Por favor, introduzca el precio inicial del artículo en euros: "); // precio sin iva
    double baseImponible = Double.parseDouble(System.console().readLine().toLowerCase());
    
    System.out.print("¿El artículo está en oferta? (s/n): "); // precio sin iva
    String oferta = System.console().readLine().toLowerCase();
    
    double tipo = 0;
    String descuento = "";
    
    switch (oferta){
      case "s":
      tipo = baseImponible * 0.10 ;
      descuento = " (10 %)"; // descuento
      break;
      case "n":
      tipo = 0;
      descuento = " (0%)"; // no tiene descuento
      break;
      default:
      System.out.println("Escrito incorrectamente, recuerde escribir 's' o 'n'");
      }
      
      System.out.printf("\nEl precio del articulo sin iva es de : %.2f Euros %s " , (baseImponible - tipo) , descuento);
      System.out.println("\n");
      
      System.out.println("TIPOS DE IVA: ");
      System.out.println("1) Superreducido:  del 4%");
      System.out.println("2) Reducido:       del 10%");
      System.out.println("3) General:        del 21%\n");
      
      
      System.out.print("¿Escriba cual es el tipo de Iva:  "); 
      String iva = System.console().readLine().toLowerCase();
      
      double ivaAplicado = 0;
      String porcentajeIva = "";
      
      
    switch (iva) {
      case "1":
      ivaAplicado = (baseImponible - tipo) * 0.04;
      porcentajeIva = " (4%)";
      break;
      case "2":
      ivaAplicado = (baseImponible - tipo) * 0.10;
      porcentajeIva = " (10%)";
      break;
      case "3":
      ivaAplicado = (baseImponible - tipo) * 0.21;
      porcentajeIva = " (21%)";
      break;
      default:
      System.out.println("El iva escrito no es correcto");
      break;
      }
      
    System.out.println("\n FACTURA: ");
    System.out.println("**************\n");
    
    System.out.println("Precio inicial:       " + baseImponible);
    System.out.println("Descuento:            " + tipo + descuento);
    System.out.printf("Precio con descuento: %.2f " , (baseImponible - tipo));
    
    System.out.printf("\nIVA: %.2f %s  " , ivaAplicado , porcentajeIva);
    System.out.printf("\nTOTAL FACTURA:  %.2f Euros  " , ((baseImponible - tipo) + ivaAplicado));
  
 }
}

