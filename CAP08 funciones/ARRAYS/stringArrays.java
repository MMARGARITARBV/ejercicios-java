/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class stringArrays {
  public static void main(String[] args) {
    System.out.println("Este programa muestra la media de temperatura de un mes con barras horizontales.");
    
    //inicializo el array de String con los meses del año.
    String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Ocutubre", "Noviembre", "Diciembre"};
    
    // inicializo el array de temperatura y le asigno 12 posiciones // los meses del año
    int temperatura[] = new int [12];
    // pido las temperaturas y las guardo 
    for (int x = 0; x < 12; x++) {
      // muestro los meses 
      System.out.print("Por favor, introduzca la temperatura media de " + mes[x] + ": ");
      temperatura[x] = Integer.parseInt(System.console().readLine());
    }   //pide la temperatura

        
    for (int x = 0; x < 12; x++) {
      // PINTA LOS MESES
      System.out.printf("%13s: ",mes[x]);// PITANDO LOS DOS PUNTO JUNTITOS
      // JUSTO AL LADO LOS DOS 
      //System.out.print(": ");
      for (int i = 1; i <= temperatura[x]; i++) {
	// PINTO LOS GRADOS CON ASTERISCOS
        System.out.print("*");
      }
      // TERMINO IMPRIMIENDO LOS GRADOS DENTRO DEL FOR PRINCIPAL. 
      
      System.out.print(temperatura[x] + "o");
      System.out.println();
    }
  }
}
