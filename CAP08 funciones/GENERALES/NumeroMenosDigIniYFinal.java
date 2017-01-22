/**
 *  TrozoDeNumero: Toma como parámetros las posiciones inicial y final
 *  dentro de un número y devuelve el trozo correspondiente.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class NumeroMenosDigIniYFinal {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA DEVUELVE UN NUMERO SIN EL PRIMER Y ULTIMO DIGITO\n"  );

    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    // ELIMINA EL ULTIMO DIGITO
    numeroIntroducido = numeroIntroducido/10;
    System.out.println("Numero sin la ultima posicion: " + numeroIntroducido + " \n");
     
    // DA LA VUELTA AL NUMERO PARA ELIMINAR EL PRIMER DIGITO
    
    int numeroReves = 0;
    
    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
    System.out.print("Numero al reves cortado: " + numeroReves + " \n");
    
    //ELIMINAMOS EL ULTIMO NUMERO DESPUES DE VOLTEARLO 
    numeroReves = numeroReves/10;    
        
    //VOLVEMOS A DARLE LA VUELTA AL NUMERO Y MOSTRAMOS EL NUMERO DEFINITIVO
    int numeroFinal= 0;
    
    while (numeroReves > 0) {
        numeroFinal = (numeroFinal * 10) + (numeroReves % 10);
	numeroReves = numeroReves / 10;
        }
    
    System.out.print("El numero definitivo es: " + numeroFinal + " \n");
  }
}


