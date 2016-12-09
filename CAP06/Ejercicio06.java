/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Margarita B.V
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("Usted debe adivinar el número que estoy pensando (entre 0 y 100). \nTiene 5 oportunidades. \n");
    
    int numerosecreto = (int)(Math.random()*101); // Almacenamos el número secreto a adivinar
    boolean acierto = false;
    
    System.out.println("El numero pensado es: " + numerosecreto); // muestra el número secreto y nos sirve para comprobar
    
    for(int x = 4; (x >= 0) && (!acierto); x--) { // especificamos en un bucle el número de intentos y si cumple con la la condicion 
      
      System.out.print("Por favor, introduzca el número que estoy pensando:"); // introducimos el número 
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      System.out.println("");
      
      if (numeroIntroducido == numerosecreto) { // si la condicion es verdadera
        acierto = true;
        System.out.println("Enhorabuena, has acertado!");
        
      } else if (numeroIntroducido > numerosecreto) { // si numero introducido es mayor que el número secreto
        System.out.println("El número que estoy pensando es menor al número que has introducido");
        System.out.println("Te quedan " + x + " oportunidades.\n"); // nos dice las oportunidades que le quedan
        
      } else if (numeroIntroducido < numerosecreto) { // nos dice que el número introducido es mayor al número secreto
        System.out.println("El número que estoy pensado es mayor al número que has introducido");
        System.out.println("Te quedan " + x + " oportunidades.\n"); // nos dice las oportunidades que te quedan
      }
    }
  }
}
