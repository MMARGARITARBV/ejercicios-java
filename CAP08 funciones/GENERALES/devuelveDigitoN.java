/**
 * Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class devuelveDigitoN {
  public static void main(String[] args) {
    
    System.out.println("\nPROGRAMA QUE DEVUELVE UN DIGITO POR SU POSICION\n"  );

    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;

    while (numeroIntroducido > 0) {
        numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
	numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.print("NUMERO DEL REVES " + numeroReves + " \n");
    
    System.out.print("Introduce la posicion del digito que quieres mostrar: ");
    int posicionDigito = Integer.parseInt(System.console().readLine());
    
    int aux = numeroReves;   
    
      if (posicionDigito == 1){
      System.out.print("El digito: " + (aux%10)+ " se encuentra en la posicion: " + posicionDigito);
      }else {
        for (int i = 1; i < posicionDigito; i++){
        aux = aux/10;
        System.out.println(aux);
      }    
      System.out.print("El digito: " + (aux%10)+ " se encuentra en la posicion: " + posicionDigito);
      }
  }
}


