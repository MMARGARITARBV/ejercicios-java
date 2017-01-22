/**
 *  juntaNumeros: Pega dos números para formar uno.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class juntaDosNumeros {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA PEGA DOS NUMEROS PARA FORMAR UNO\n"  );

    System.out.print("Introduce el primer numero: ");
    String primerNumeroIntroducido = System.console().readLine();
    
    System.out.print("Introduce el segundo numero: ");
    String segundoNumeroIntroducido = System.console().readLine();
    //los numeros son STRING y los convierto con Integer.parseInt
    // podemos concatenar al ser String, el detalle es poner las comillas en medio.
    
    int nuevoNumero =  Integer.parseInt(primerNumeroIntroducido + "" + segundoNumeroIntroducido);//MUESTRA LOS DOS NUMEROS UNIDOS
    System.out.println("El nuevo numero es: " + nuevoNumero +" \n");
        
    nuevoNumero = nuevoNumero + 100;
    System.out.println("numero sumado" + nuevoNumero);
  
  }
}


