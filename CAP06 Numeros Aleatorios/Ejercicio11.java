/**
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Margarita B.V
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa printa, al azar, notas.");
    
    String tipodenota = " ";// Almacena las notas aleatorias
    int contadorsuspenso = 0;
    int contadorsuficiente = 0;
    int contadorbien = 0;
    int contadornotable = 0;
    int contadorsobresaliente = 0;
    
    // Generamos las 20 notas aleatorias y mostramos el número de cada una por pantalla
      for (int x = 1; x <= 20; x++) {
        int nota = (int)(Math.random() * 5); // genera aleatorios de las 5 notas especificadas en el switch
        switch (nota) {
          case 0:
          tipodenota = "suspenso";
          contadorsuspenso++; // guarda las veces que han salido los suspensos
          break;
          case 1:
          tipodenota = "suficiente";
          contadorsuficiente++; // guarda las veces que han salido los suficiente
          break;
          case 2:
          tipodenota = "bien";
          contadorbien++; // guarda las veces que han salido bien
          break;
          case 3:
          tipodenota = "notable";
          contadornotable++; // guarda las veces que han saludo notables
          break;
          case 4:
          tipodenota = "sobresaliente";
          contadorsobresaliente++; // guarda las veces que ha salido sobresaliente
          break;
          default:
          break;
        }
        System.out.println("La nota nº" + x + " es: " + tipodenota); // muestra el número de nota y el tipo de nota que generamos aleatoriamente
      }
    System.out.println("\nLa cantidad de Suspensos es: " + contadorsuspenso); // muestra la cantidad de suspenso que ha generado
    System.out.println("La cantidad de Suficientes es: " + contadorsuficiente); // muestra la cantidad de suficiente que han salido
    System.out.println("La cantidad de Bienes es: " + contadorbien); // muestra la cantidad de bien que han salido
    System.out.println("La cantidad de Notables es: " + contadornotable); // muestra la cantidad de notables que ha generado
    System.out.println("La cantidad de Sobresalientes es: " + contadorsobresaliente); // muestra la cantidad de notables que ha generado
  }
}
