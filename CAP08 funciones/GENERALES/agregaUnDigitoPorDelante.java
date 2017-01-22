/**
 * Añade un dígito a un número por detrás.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class agregaUnDigitoPorDelante {
  public static void main(String[] args) {
    
  System.out.println("\nESTE PROGRAMA AGREGA UN DIGITO A UN NUMERO\n"  );
    
   System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numeroReves = 0;
    
    // DAMOS LA VUELTA AL NÚMERO
    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print("NUMERO DEL REVES " + numeroReves + " \n");
    
    
    //AGREGAMOS EL NUMERO AL "NUMERO DEL REVES" POR DETRAS
    
      System.out.print("Introduce el numero que deseas agregar: ");
      int digitoAgregado = Integer.parseInt(System.console().readLine());
    
      int nuevoNumero = numeroReves;
    // COMPRUEBO SI ES MAYOR QUE O Y REALIZO LA OPERACIÓN
    
      if (nuevoNumero > 0){ 
	nuevoNumero = numeroReves * 10 + digitoAgregado; //SUMO EL DIGITO POR DETRAS
      }else{
	System.out.println("El número introducido debe ser mayor que 0");
      }
    
      System.out.println("El nuevo numero del revez, agragando el digito es: " + nuevoNumero);// IMPRIMO EL NUEVO NUMERO
  
      
    // VOLVEMOS A DAR LA VUELTA AL NUMERO PARA MOSTRARLO
    int numeroRevesDelNuevoNumero = 0;
    
    while (nuevoNumero > 0) {
        numeroRevesDelNuevoNumero = (numeroRevesDelNuevoNumero * 10) + (nuevoNumero % 10);
	nuevoNumero = nuevoNumero / 10;
        }
    
    System.out.print("Nuevo numero con el digito agregado por delante: " + numeroRevesDelNuevoNumero + " \n");
    
  }  
}


