/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Margarita Benitez V
 * 
 * Array de una dimensión
 */
public class potenciaAPelo {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el cuadrado y el cubo de numeros aleatrorios.");

   // Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
    int numero[] = new int [20];
    int cuadrado[] = new int [20];
    int cubo[] = new int [20];
    
    //Carga el array numero con valores aleatorios entre 0 y 100
    for (int x = 0; x < numero.length; x++) {
      numero[x] = (int)(Math.random() * 101);
      
      //En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero
      //cuadrado[x] = (int)(Math.pow(num[x],2));  // 
      cuadrado[x] = numero[x]* numero[x];
      //En el array cubo se deben almacenar los cubos de los valores que hay en numero
      //cubo[x] = (int)(Math.pow(num[x],3));
      cubo[x] = cuadrado[x]* numero[x];
    }
    System.out.println("Número\t\tCuadrado\tCubo");
    
    for (int x = 0; x < numero.length; x++) {
      System.out.print(numero[x] + "\t\t" + cuadrado[x] + "\t\t" + cubo[x]);
      System.out.println();
    }
  }
}
