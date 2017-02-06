/**
*  Escribe un programa que diga cuántos números terminados en 8 ha introducido el usuario. A priori, el
* programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
* los datos metiendo el 0. Los números negativos también se tienen en cuenta.
* Ejemplo 1:
* Por favor, vaya introduciendo números y pulsando [INTRO]:
* 34
* - 28
* 585
* 8 
* 168
* -6
* 0
* Ha introducido 3 números terminados en 8.
* Ejemplo 2:
* Por favor, vaya introduciendo números y pulsando [INTRO]:
* 3-
* 1
* 880
* 0
* Ha introducido 0 números terminados en 8.
*
* Fecha: 24/01/2016 
* @author Maria Margarita Benitez Vargas
*/
 
 public class Ex05mmbv01 {
  public static void main (String[] args){
    System.out.println("** PROGRAMA **\n");


    System.out.println("\n ESTE PROGRAMA DICE CUANTOS NUMEROS TERMINADOS EN 8 HA INTRODUCIDO EL USUARIO\n"  );
    
    int contador = 0;
    int numeroIntroducido = 0;
    
    do{
      System.out.print("Introduce un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      //Escribe un programa que diga cuántos números terminados en 8 ha introducido el usuario
      if ((numeroIntroducido % 10) == 8 || (numeroIntroducido % 10) == -8){
	    contador++;
	  }
    }while(numeroIntroducido != 0);
  
	System.out.print("los numeros terminados en 8 son: " + contador);
    
  
  }
}


