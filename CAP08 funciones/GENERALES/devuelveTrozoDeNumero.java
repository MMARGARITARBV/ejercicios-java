/**
 *RESUMEN EJERCICIOS
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class devuelveTrozoDeNumero {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA DEVUELVE UN TROZ DE UN NUMERO SEGUN SU POSICION\n"  );

    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    //System.out.print("Introduce la posicion del primer digito de corte (de izquierda a derecha): ");
    //int primeraPosicion = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la posicion del ultimo digito del nuevo numero: ");
    int ultimaPosicion = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;
    
    // muestra todos las posiciones de lo digitos que quieres buscar
    //boolean existe = false;
    //int posicion = 1;
    
    //while (numeroReves > 0 && !existe) {
      for (int posicion = 1; posicion < ultimaPosicion; posicion++){
	    numeroIntroducido = numeroIntroducido/10;
	      //if (posicion == ultimaPosicion){ //&& !existe){
		  //existe = true;
	      //System.out.println("la posición dentro del if: " + posicion + "del numero cortado: " +numeroIntroducido);
	      //}
	      posicion++;
	      //ultimaPosicion--;
	System.out.println("la posición dentro del for: " + posicion + "del numero cortado: " +numeroIntroducido);
      }
      
    //}
      
    /*  if (numeroReves % 10 == digitoABuscar) {
	existe = true;
        System.out.println("la posicion del numero es: " + (posicion));
      }
      numeroReves = numeroReves / 10;
      posicion++;
    }
    if (!existe){ // primer operando distinto que el segundo, si es diferente de verdadero
      System.out.println("No encuentra el digito, valor: -1 ");
    } 

    // DA LA VUELTA AL NUMERO 
    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print("NUMERO DEL REVES " + numeroReves + " \n");
    
      System.out.print("Introduce el digito que quieres buscar: ");
      int digitoABuscar = Integer.parseInt(System.console().readLine());
    */   
  }
}


