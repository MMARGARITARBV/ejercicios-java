/**
 * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * Devuelve la posición de la primera vez que encuentra el digito que solicitamos por teclado
 * @ Margarita Benitez V
 * 
 * 
 */
 
public class devuelvePosicionDeDigitosN {
  public static void main(String[] args) {
    
    System.out.println("\nPROGRAMA QUE DEVUELVE LA PRIMERA OCURRENCIA DE UN DIGITO\n"  );

    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;

    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print("NUMERO DEL REVES " + numeroReves + " \n");
    
      System.out.print("Introduce el digito que quieres buscar: ");
      int digitoABuscar = Integer.parseInt(System.console().readLine());
    
    
    int aux = numeroReves;   
    boolean existe = false;
    int contador = 0;
     
    
    // muestra todos las posiciones de lo digitos que quieres buscar
    
    int posicion = 1;
    
     while (numeroReves > 0) {
      if (numeroReves % 10 == digitoABuscar) {
	existe = true;
        System.out.println("la posicion del numero es: " + (posicion));
      }
      numeroReves = numeroReves / 10;
      posicion++;
    }
    if (!existe){ // primer operando distinto que el segundo, si es diferente de verdadero
      System.out.println("No encuentra el digito, valor: -1 ");
    } 
         
	 
    // da la posición de la primera ocurrencia del digito a buscar
    
  }
}


