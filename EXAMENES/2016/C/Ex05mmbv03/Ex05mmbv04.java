/**
 * Escribe un programa que diga cuánto suman todos los dígitos de un número introducido por el
 * usuario. El programa debe ser válido tanto para los números positivos como para los negativos.
 * Ejemplo 1:
 * Introduzca un número: 40958
 * Los dígitos del número 40958 suman 26
 * Ejemplo 2:
 * Introduzca un número: -164
 * Los dígitos del número -164 suman 11
 * Ejemplo 3:
 * Introduzca un número: 0
 * Los dígitos del número 0 suman 0
 * 
 * Fecha: 24/01/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
 public class Ex05mmbv04 {
  public static void main (String[] args){
    System.out.println("** PROGRAMA **\n");

    //Introducimos el numero por teclado

    System.out.print("Introduce el numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int num = Math.abs(numeroIntroducido);
     //Escribe un programa que diga cuánto suman todos los dígitos de un número introducido
    int numeroAMostrar = numeroIntroducido; 
    
    int contadorDigitos= 0;
    int indice = 1;
    int sumaDigitos = 1;

    // El programa debe ser válido tanto para los números positivos como para los negativos.
    if (num < 0 ){
      sumaDigitos = num % 10;
      while (num < 0){
	  //System.out.println("Indice: " + indice +" numero: " + numeroIntroducido+ " suma: " + sumaDigitos);
          num = num/10;
	  sumaDigitos= (num % 10) + sumaDigitos;
	  contadorDigitos++;
          indice++;
      }
      
    }else{
      sumaDigitos = num % 10;
        while (num > 0){
          //System.out.println("Indice: " + indice +" numero: " + numeroIntroducido+ " suma: " + sumaDigitos);
          num = num/10;
	  sumaDigitos= (num % 10) + sumaDigitos;
	  contadorDigitos++;
          indice++;
        }
    }
    System.out.println("El numero introducido es: " + numeroAMostrar +" y suma un total de: " + sumaDigitos);
  }
}

