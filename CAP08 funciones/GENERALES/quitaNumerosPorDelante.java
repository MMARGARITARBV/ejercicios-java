/**
 * Le quita a un número n digitos por delante (por la izquierda).
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class quitaNumerosPorDelante {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA QUITA NUMEROS POR DELANTE\n"  );

    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;
    
    // DAMOS LA VUELTA AL NÚMERO
    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print("NUMERO DEL REVES " + numeroReves + " \n");
    
    
    //QUITAMOS NUMEROS DEL NUMERO DEL REVES POR DETRAS
    System.out.print("Introduce la cantidad de numeros que deseas borrar: ");
    int numerosABorrar = Integer.parseInt(System.console().readLine());
    
    int nuevoNumero = 0;
    
     while(numerosABorrar > 0){
	numeroReves /= 10;
	nuevoNumero = numeroReves;
	numerosABorrar--;
	}
      System.out.println("Numero del revez con digitos quitados: " + nuevoNumero );
      
    // VOLVEMOS A DAR LA VUELTA AL NUMERO PARA MOSTRARLO
    int numeroRevesDelNuevoNumero = 0;
    
    while (nuevoNumero > 0) {
        numeroRevesDelNuevoNumero = (numeroRevesDelNuevoNumero * 10) + (nuevoNumero % 10);
	nuevoNumero = nuevoNumero / 10;
        }
    
    System.out.print("Numero introducido por teclado sin las dos primeras cifras: " + numeroRevesDelNuevoNumero + " \n");
      
  }
}


