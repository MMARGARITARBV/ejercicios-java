/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 *
 *
 * @author Margarita Benitez V
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Este programa crea un array bidimensional y situa al máximo y el mínimo");
           int [] [] num = new int [6] [10];
           int sumatotal = 0;
           int max = 0;
           int maxx = 0;
           int maxi = 0;
           int min  = 1000;
           int minx = 0;
           int mini = 0;
           
           for (int x = 0;  x < 6; x++) {
                for(int i = 0; i < 10; i++) {
                    int numAleatorio = (int)((Math.random())*1001);
                    num [x] [i] = numAleatorio;
                    if (x == 0) {
                        max = num[x][i];
                        maxx = x;
                        maxi = i;
                    } else if (num [x][i] > max) {
                        max = num[x][i];
                        maxx = x;
                        maxi = i;
                    }
                    if (num [x][i] < min) {
                        min = num[x][i];
                        minx = x;
                        mini = i;
                    }
                }
            } //Genera los números aleatorios y calcula la posicion del máximo y el mínimo
           
           
        System.out.print("         |");  
        for (int  x = 0; x < 11; x++) {
            System.out.print("  Columna " + x + "|");
        } //Imprime la cabecera de las columnas
          
        System.out.println();

        for(int i = 0;  i < 6; i++) {
            for (int x = 0; x < 10; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else {
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                }
            }
            System.out.println();
        } //Imprime cada fila
       
        System.out.print("El máximo número del array bidimensional es el ");
        System.out.println(max + " en la fila " + maxx + " columna " + maxi);
        System.out.print("El mínimo número del array bidimensional es el ");
        System.out.print(min + " en la fila " + minx + " columna " + mini);
       
    }     
}
