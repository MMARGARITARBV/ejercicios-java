/**
 * Escribe un programa que pida un número entero y que diga a continuación si las cifras que lo
 * componen están en orden, mirando de izquierda a derecha. Se considerarán números positivos o
 * negativos de 5 dígitos como máximo.
 * 
 * Ejemplo 1:
 * Por favor, introduzca un número entero con 5 dígitos como máximo: 3067
 * Los dígitos de 3067 están en orden.
 * Ejemplo 2:
 * Por favor, introduzca un número entero con 5 dígitos como máximo: 85
 * Los dígitos de 85 no están en orden.
 * 
 */
public class Ejemplo0204 {
  public static void main(String[] args) {
    
    
   
    System.out.println("Este programa calcula las veces que aperece un dígito en un número entero.");
    System.out.print("Por favor introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int num = Math.abs(numeroIntroducido);//Devuelve el valor absoluto de un número (el valor independientemente de 
              //si es positivo o negativo). Por ejemplo, el valor absoluto de -5 es el mismo que el valor absoluto de 5.
              
    int x = 1; //boleano
    
    int dig = (num % 10);
    num /= 10;
    
    while (num > 0){
      if (!((num % 10) < dig)) {
      //if ((num % 10) >= dig) {
        x = 0;
      }
      dig = (num % 10);
      num /= 10;
    }
    
    if(x == 1){
      System.out.println("Ordenado");      
    }
    else{
      System.out.println("Desordenado");      
    }
  }
}
