/**
 *Ejercicio 9: Realiza un programa que resuelva una ecuación de segundo grado
 *(del tipo ax 2 + bx + c = 0).
 *
 *@author Margarita B. V
 */
 
public class Ejer09 {
  public static void main (String[] args){
    System.out.print("VAMOS A RESOLVER UNA ECUACIÓN DE SEGUNDO GRADO ");
    System.out.println("(ax2 + bx + c = 0).");
    System.out.println("");
    
    System.out.print("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double comprobarTipoRaiz = (Math.pow(b, 2) - (4 * a * c)); //Variable para comprobar que la raíz cuadrada no es negativa
    
    if (comprobarTipoRaiz >= 0) {
       System.out.println("x = " + (((b * -1) - Math.sqrt(comprobarTipoRaiz)) / (2 * a)) + " o x = " + (((b * -1) + Math.sqrt(comprobarTipoRaiz)) / (2 * a)));
    } else {
       System.out.println("Esta ecuación no tiene una solución real");
     }
    
    /*if (a != 0){ // segunda forma mucho más larga y no es exacta
      if (b != 0){
        if (c != 0){
          if (Math.pow(b,2)-(4*a*c) >= 0){
            resultadoPos = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
            resultadoNeg = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
          }else{
            System.out.print("Raíz cuadrada negativa.");
          }
        }else{
          if ((-b/a) >= 0){
            resultadoPos = Math.sqrt(-b/a);
            resultadoNeg = -resultadoPos;
          }else{
            System.out.print("Raíz cuadrada negativa.");
          }
        }
      }else{
        if ((-c/a) >= 0){
          resultadoPos = Math.sqrt(-c/a);
          resultadoNeg = -resultadoPos;
        }else{
          System.out.print("Raíz cuadrada negativa.");
        }
      }
    }else{
      System.out.print("Ecuación sin solución real.");
    }
    
    if (!((resultadoPos > -0.00000001) && (resultadoPos < 0.00000001))){
      if (!((resultadoNeg > -0.0000001) && (resultadoNeg < 0.00000001))){
      System.out.printf("Resultado 1: %.2f\n", resultadoPos);
      System.out.printf("Resultado 2: %.2f", resultadoNeg);
      }
    }*/
  }
}
