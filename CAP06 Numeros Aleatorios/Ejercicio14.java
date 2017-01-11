/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
estás pensando es mayor o menor que el que te acaba de decir.
 * @author Margarita B.V
 * 
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Voy a adivinar el número que estas pensando (entre 0 y 100).\nTengo 5 oportunidades.\n");
    
    boolean acierto = false;
    int menor = 0;
    int mayor = 100;
    
    for(int x = 4; (x >= 0) && (!acierto); x--) { //si el buleano tiene ! significa que es diferente de verdadero, osea que es true
      int numeropensado = (int)(((Math.random() * (mayor - menor)) + menor));
      
      System.out.println("El numero que estoy pensando es: " + numeropensado);
      
      System.out.print("¿Es este el número que estas pensando tú?: ");
      String respuesta = System.console().readLine();
        if (respuesta.equals("no")) { // si respuesta es no
          System.out.print("¿El número que estas pensando es mayor o menor al número que pensé antes?: ");
          String mayoromenor = System.console().readLine(); //lee si es mayor o menor
          if (x > 0) {
          System.out.println("Me quedan " + x + " oportunidades.");
          } else {
            System.out.println("Que lástima, ya no me quedan más oportunidades.");
          }
          if (mayoromenor.equals("mayor")){
            menor = (numeropensado + 1);
          } else if (mayoromenor.equals("menor")){
            mayor = (numeropensado - 1);
          } else {
            System.out.println("Lo siento, respuesta incorrecta.");
          }
          
        } else if (respuesta.equals("si")) {
          System.out.print("He acertado!");
          acierto = true;
        } else {
          System.out.println("Lo siento, respuesta incorrecta.");
        }
    }
  }
}

