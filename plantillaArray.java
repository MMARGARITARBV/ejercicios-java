/**
 *RESUMEN EJERCICIOS
 * 
 * @ Margarita Benitez V
 * 
 * 
 */

public class plantilla {
  public static void main(String[] args) {
    
    System.out.println("\n NOMBRE PROGRAMA\n"  );

    int num[] = new int [12]; // ARRAY VACIO DE 12 POSICIONES

    for (int x = 0; x < 12; x++) { // GUARDA EN EL ARRAY LOS NUMEROS ALEATORIOS ENTRE 1 Y 12
      num[x] = (int)(Math.random()*12 + 1);
     } 
    
    for (int x = 0; x < 12; x++) { // LOS MUESTRA 
      System.out.println ("El elemento " + x + "\t del array es: \t " + num[x]);   
      
  }
}


