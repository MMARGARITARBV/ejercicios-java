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
public class Ex05mmbv4{
  public static void main(String[] args) {
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa pintará un camino aleatorio");
    System.out.println("------------------------------------------------------");
        
    // Introducimos la longitud 
    System.out.print("\nPor favor, introduzca la longitud del camino: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    int espacios = 6; // Almacenamos los espacios base
    //System.out.printf("\n%13s\n", " ");
    System.out.println();
    
    
    for (int i = 0; i < longitud; i++) {
        int espaciosAleatorios = (int)(Math.random()*3)-1;
      
          espacios += espaciosAleatorios;
      
          // Generamos los espacios resultantes y pintamos el carácter al final
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.print("#");
      //System.out.println();
      
      for (int x = 0; x < espacios; x++) {
        System.out.print(" ");
      }
      System.out.print("#");
      System.out.println();
    }
    System.out.println();
  }
}
