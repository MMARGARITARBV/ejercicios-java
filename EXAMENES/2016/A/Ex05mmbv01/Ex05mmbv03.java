/**
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha.
 * 
 * El programa pedirá el número de escalones y la altura de cada escalón. 
 * 
 * La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 *Fecha: 15/11/2016 
 *@author Maria Margarita Benitez Vargas
 */
 
public class Ex05mmbv03 {
  public static void main (String[] args){
    
    //String ESCALON = "****";
    System.out.print("Introduzca el número de escalones: ");
    int numEscalones = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la anchura de cada escalón: ");
    int anchuraEscalon = Integer.parseInt(System.console().readLine());
    
    for(int z=0; z < numEscalones; z ++){    
      for(int y = 0 ; y < alturaEscalon; y++){
        for (int x = 0 ; x < anchuraEscalon + anchuraEscalon * z; x++) {//ancho de los escalones
          System.out.print("*");
        }
        System.out.print("\n");
      }
    }
  }
}
