/**
 * Devuelve el número de dígitos que contiene un número entero
 * 
 * @ Margarita Benitez V
 */

public class numeroDeDigitos {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA NOS DICE CUANTOS DIGITOS TIENE UN NUMERO:\n"  );
    
    System.out.print("Introduce un numero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    int numeroDeDigitos = 0;
    
	  if (numeroIntroducido == 0) {
	    System.out.print("El numero tiene que ser mayor que 0");
	  } else {
	    while (numeroIntroducido > 0) {
	      numeroIntroducido = numeroIntroducido / 10;
	      numeroDeDigitos++;
	    }
	    System.out.print("numero de digitos: " + numeroDeDigitos);
	  }
    /*if (numeroIntroducido == 0){
      System.out.print("El número tiene que ser mayor que 0, vuelva a intentarlo");
    } else{
	do{	  
	  numeroIntroducido = numeroIntroducido / 10;
	  numeroDeDigitos++;
	}while (numeroIntroducido > 0);
      System.out.print("numeros introducidos: " + numeroDeDigitos);
    }*/
  }
}


