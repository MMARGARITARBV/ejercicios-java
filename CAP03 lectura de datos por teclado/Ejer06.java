/**
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Margarita Benitez
 * 
 * Lectura de datos desde teclado
 * 
 */

public class Ejer06 {
  public static void main(String[] args) {
    
    
    System.out.println ("         CALCULA EL AREA DEL TRIANGULO\n ");
    System.out.println("Recuerda que A (área del triángulo) : b x h dividido en 2 \n");
      
    System.out.print("Escribe la BASE         : ");
    int base = Integer.parseInt(System.console().readLine());// entrada de datos (enteros)
    System.out.print("Ahora escribe la ALTURA : ");
    int altura = Integer.parseInt(System.console().readLine());// entrada de datos (enteros)
    
    System.out.println ("\n");
    
    int area = ((base * altura) / 2); //operación área rectangulo
        
    System.out.println("AREA DEL TRIANGULO = "+ area);//como colocar formateado a la izquiera junto con la limitación de decimales. 
  
  }
}


