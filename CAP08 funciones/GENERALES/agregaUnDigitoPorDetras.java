/**
 * Añade un dígito a un número por detrás.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class agregaUnDigitoPorDetras {
  public static void main(String[] args) {
    
  System.out.println("\nESTE PROGRAMA AGREGA UN DIGITO A UN NUMERO\n"  );
    
   System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el numero que deseas agregar: ");
    int digitoAgregado = Integer.parseInt(System.console().readLine());
    
    int nuevoNumero = numeroIntroducido;
    // COMPRUEBO SI ES MAYOR QUE O Y REALIZO LA OPERACIÓN
    
    if (nuevoNumero > 0){ 
      nuevoNumero = numeroIntroducido * 10 + digitoAgregado; //SUMO EL DIGITO POR DETRAS
    }else{
      System.out.println("El número introducido debe ser mayor que 0");
    }
    
    System.out.print("El nuevo numero es el siguiente: " + nuevoNumero);// IMPRIMO EL NUEVO NUMERO
  }
}


