/**
 * 
 * quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * @ Margarita Benitez V
 * 
 * 
 */

public class quitaNumerosPorDetras {
  public static void main(String[] args) {
    
    System.out.println("\n ESTE PROGRAMA QUITA x NUMEROS POR DENTRAS\n"  );
    
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la cantidad de numeros que deseas borrar: ");
    int numerosABorrar = Integer.parseInt(System.console().readLine());
    
    int nuevoNumero = 0;
   
      while (numerosABorrar > 0) {
	numeroIntroducido /= 10;
	nuevoNumero = numeroIntroducido;
	numerosABorrar--;
	}
    
   /* if (numeroIntroducido > 0){ 
      for(int i = 0; i < numerosABorrar; i++ ){
	numeroIntroducido = numeroIntroducido/10;
	nuevoNumero = numeroIntroducido;
      }
    }else{
      System.out.println("El número introducido debe ser mayor que 0");
    }*/
    
    //numeroIntroducido = numeroIntroducido / (numerosABorrar * 10); //mal
    
    System.out.print("El nuevo numero es el siguiente: " + nuevoNumero);
    
  }
}


