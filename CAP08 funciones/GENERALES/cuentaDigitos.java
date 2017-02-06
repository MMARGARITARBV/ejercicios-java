/**
 *  Este programa cuenta los digitos de un numero y los muestra con un indice.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class cuentaDigitos {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA CUENTA LOS DIGITOS DE UN NUMERO\n"  );

    System.out.print("Introduce el numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
     //PRIMERO TENEMOS QUE SABER CUANTOS DIGITOS TIENE EL SEGUNDO NUMERO
     
    
    int contadorDigitos= 0;
    int indice = 1;

    while (numeroIntroducido > 0){
	    System.out.println("Indice: " + indice +" numero: " + numeroIntroducido);
	    numeroIntroducido = numeroIntroducido/10;
	    contadorDigitos++;
	    indice++;
    }
    System.out.println("El numero introducido tiene: " + contadorDigitos +" digitos");
        
  }
}


