/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Margarita Benitez
 */

public class Ejer05 {
  public static void main(String[] args) {
    
    
    System.out.println ("         CALCULA EL AREA DEL RECTANGULO\n ");
    System.out.println("Recuerda que A (área del rectángulo) : b x h \n");
    //System.out.println ("         CALCULA EL AREA DEL TRIANGULO\n ");
    
    
    System.out.print("Escribe la BASE         : ");
    int base = Integer.parseInt(System.console().readLine());// entrada de datos (enteros)
    System.out.print("Ahora escribe la ALTURA : ");
    int altura = Integer.parseInt(System.console().readLine());// entrada de datos (enteros)
    
    System.out.println ("\n");
    
    int area = base * altura; //operación área rectangulo
        
    System.out.println("AREA DEL RECTANGULO = "+ area);//como colocar formateado a la izquiera junto con la limitación de decimales. 
  
  }
}


