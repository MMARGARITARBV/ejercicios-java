/**
 * Dada una base y un exponente devuelve la potencia.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class potencia {
  public static void main(String[] args) {
    
    System.out.println("\nPROGRAMA QUE NOS DICE LA POTENCIA DE UN NUMERO\n"  );
        
    System.out.print("Introduce la base: ");
    int numeroBase = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    int potencia = 1;

    for (int i = 0; i < exponente; i++) {//recursividad 
      potencia = potencia * numeroBase; // = potencia *= numero base; multiplicación más asignación 
    }
    System.out.print("el valor de la potencia es: "+ potencia);
  
   
   
  }
}


