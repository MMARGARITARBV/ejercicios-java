/**
 *  juntaNumeros: Pega dos números para formar uno.
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class integraNumerosEnteros {
  public static void main(String[] args) {
    
    System.out.println("\nESTE PROGRAMA PEGA DOS NUMEROS PARA FORMAR UNO\n"  );

    System.out.print("Introduce el primer numero: ");
    int primerNumeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo numero: ");
    int segundoNumeroIntroducido = Integer.parseInt(System.console().readLine());

    //PRIMERO TENEMOS QUE SABER CUANTOS DIGITOS TIENE EL SEGUNDO NUMERO
     
    int digitosSegundoNumero = segundoNumeroIntroducido;
    int contadorDigitos= 0;
    int indice = 1;

    while (digitosSegundoNumero > 0){
	    System.out.println("Indice: " + indice +" numero: " + digitosSegundoNumero);
      digitosSegundoNumero = digitosSegundoNumero/10;
	    contadorDigitos++;
	    indice++;
    }
    System.out.println("El segundo numero introducido tiene: " + contadorDigitos +" digitos");
    
    //SABIENDO LOS DIGITOS DEL SEGUNDO NÚMERO, MULTIPLICAMOS EL PRIMER NÚMERO POR 10, TENIENDO EN CUENTA EL NÚMERO DE DIGITO 10  
     
    for (int i = 0; i < contadorDigitos; i++) {
      primerNumeroIntroducido = primerNumeroIntroducido * 10;
    }
    System.out.println("El primer numero se queda convertido en: " + primerNumeroIntroducido);
    
    // UNA VEZ HEMOS SUMADO CEROS(SEGÚN contadorDigitos) AL PRIMER NUMERO, LE SUMAMOS EL SEGUNDO 
    int nuevoNumero = primerNumeroIntroducido + segundoNumeroIntroducido;
    
    System.out.println("El nuevo numero es: " + nuevoNumero +" \n");
    
  }
}


