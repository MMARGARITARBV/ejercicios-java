/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Margarita Benitez
 */

public class Ejer04 {
  public static void main(String[] args) {
    
    
    System.out.println ("¡SUMA, RESTA, MULTIPLICA Y DIVIDE CUALQUIER NÚMERO \n ");
    
    System.out.print("Por favor introduce el primer número:  ");
    double primerNumero = Double.parseDouble(System.console().readLine());// entrada de datos (decimales)
    System.out.print("Ahora introduce el segundo número:  ");
    double segundoNumero = Double.parseDouble(System.console().readLine());// entrada de datos (decimales)
    
    System.out.println ("\n");
    
    double suma            = primerNumero + segundoNumero; //operación suma
    double resta           = primerNumero - segundoNumero; //operación resta
    double multiplicacion  = primerNumero * segundoNumero; //operación multiplicación
    double division        = primerNumero / segundoNumero; //operación división
    
    System.out.printf("RESULTADO: \n\n TOTAL SUMA = %.2f \n ", suma);//como colocar formateado a la izquiera junto con la limitación de decimales. 
    
    System.out.printf("\nRESULTADO: \n\nTOTAL SUMA       \t = %.2f \nTOTAL RESTA      \t = %.2f \nTOTAL MULTIPLICACION \t = %.2f \nTOTAL DIVISIÓN   \t = %.2f", suma, resta , multiplicacion , division);
  }
}


