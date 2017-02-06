/**
 *  Realiza un programa que pinte una marina (un cuadro en el que se ve el mar). El marco del cuadro
 * siempre tiene un grosor de un carácter y se pinta con asteriscos. El mar se dibuja mediante el carácter
 * ~ (Alt Gr + ñ). El nivel del mar se situará en una posición aleatoria dentro del cuadro. El usuario debe
 * introducir la altura y anchura del cuadro. Ambos valores deben ser mayores o iguales a 7. En caso de
 * que el usuario introduzca una altura o anchura incorrectas, mostrará un mensaje de error.
 * Fecha: 24/01/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
 public class Ex05mmbv03 {
  public static void main (String[] args){
    System.out.println("** PROGRAMA **\n");

    System.out.println("Este programa muestra una marina. \n");

    System.out.print("Introduce el ancho: ");
    int largo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduzca la altura: ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int relleno = largo - 2;
    int altura = ancho - 1;
    int pezy = (int)(Math.random() * (ancho - 2) + 1);
    int pezx = (int)(Math.random() * (largo - 2)) + 1;
    boolean alturapez = false;
    
    for (int x = 1; x <= largo; x++) {      //pinta la primera linea
      System.out.print("*");
    }
      while (altura > 0) {                      // pinta pecera
      /*if (pezy == altura) {
        alturapez = true; 
      }*/
      for (int x = 1; x < largo; x++) {
        System.out.print("*");
        for (int i = 1; i <= relleno; i++) {
          System.out.print(" ");
          x++;
	}
      }
      System.out.println("*");
      altura--;
    }
    for (int x = 1; x <= largo; x++) {      //pinta ultima linea del cuadro
      System.out.print("*");
    }
  }
}

    
 
