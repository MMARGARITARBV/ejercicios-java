/**
 *  Realiza un programa que pinte un sendero aleatorio.
 * 
 *  Los bordes se pintan con el carácter #.
 * 
 *  La anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en
 * medio, en total 6 caracteres (incluyendo espacios). 
 * 
 * A cada metro, el sendero puede continuar recto,
 * girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. 
 * 
 * Por cada metro de sendero – representado por una línea – puede que haya un obstáculo o puede que no,
 * la probabilidad es del 50%. 
 * 
 * La posición del obstáculo es aleatoria y puede estar entre el primer y el cuarto carácter dentro de la línea. 
 * 
 * En caso de existir un obstáculo en un metro de sendero (en una línea),
 * puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u otro es la misma.
 *  Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 *
 * @author Margarita Benitez V 
 */
public class Ex05mmbv4_alternativo {
  public static void main(String[] args) {
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa pintará un camino aleatorio");
    System.out.println("------------------------------------------------------");
        
    // Introducimos la longitud 
    System.out.print("\nPor favor, introduzca la longitud del camino: ");
    int longitud = Integer.parseInt(System.console().readLine());

    System.out.println();
    
    int margenIzquierdo = 20;

    
    for (int i = 0; i < longitud; i++) {
      // Pinta los espacios del margen izquierdo
      for(int j = 0; j < margenIzquierdo; j++) {
        System.out.print(" ");
      }
      
      int direccion = (int)(Math.random() * 3) - 1;
      margenIzquierdo += direccion;
      
      int hayObstaculo = (int)(Math.random() * 2) + 1;
      
      int posicionDeObstaculo = (int)(Math.random() * 6) + 1;
      
      // Pinta una linea del camino
      System.out.print("#");
      for (int j = 1; j < 7; j++) {
        if ((j == posicionDeObstaculo) && (hayObstaculo == 1)) {
          int obstaculo = (int)(Math.random() * 2) + 1;
          if (obstaculo == 1) {
            System.out.print("*");
          } else {
            System.out.print("O");
          }
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("#");
      }
  }
}
