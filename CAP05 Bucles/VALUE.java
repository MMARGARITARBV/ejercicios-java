/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos. Además que nos diga cual es el número 
 * máximo introducido y cual es el mínimo. 
 *
 * @author Margarita B. V
 */
 
public class VALUE {
  public static void main (String[] args){
    System.out.println("Números positivos, negativos, máximos y mínimos");
    System.out.println("-------------------------------------------");
    
    int contadorPositivos = 0;
    int contadorNegativos = 0;
    int iteracion = 0;
    int max = 0;
    int min = 0;
    int numero = 0;
    
    do{
      System.out.print("\nINTRODUCE EL NÚMERO: ");
      numero = Integer.parseInt(System.console().readLine());
  
      if(iteracion == 0){ 
        max = numero;
        min = numero;
      } else{
    
        if(numero > max){
          max = numero;
        } else if(numero < min){
          min = numero;
        }
      }
           
      if (numero > 0){
        contadorPositivos++;
      }else if (numero < 0){
        contadorNegativos++;
      }       
      iteracion++;
    } while (iteracion < 10);
    
    System.out.println("\nLa cantidad de numeros introducidos positivos es: " + contadorPositivos);
    System.out.println("\nLa cantidad de numeros introducidos negativos es: " + contadorNegativos);
    System.out.println("\nEl número máximo es: " + max);
    System.out.println("\nEl número mínimo negativo es: " + min);
  }
}
