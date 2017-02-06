/**
 *
 * En ocasiones, en clase, se pide la iniciativa de un alumno voluntario para corregir ejercicios, salir a la
 * pizarra, etc. Por vergüenza, por no tener las tareas hechas o por cualquier otro motivo, a veces nadie
 * se presta voluntario o bien se ofrecen siempre los mismos. Para evitar esta situación vamos a realizar
 * un programa que seleccione un alumno de la clase de forma aleatoria. Para simplificar, se tienen en
 * cuenta solamente 6 alumnos. Todos los nombres se almacenan en un array tal como se muestra en la
 * siguiente tabla:  
 * 
 * Fecha: 24/01/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
 public class Ex05mmbv02 {
  public static void main (String[] args){
    System.out.println("** PROGRAMA **\n");

    //inicializo el array de String con los nombres de los alumnos.
    String alumnos[] = {"Adrian Aguilar", "Manuel Alcantara", "Jorge Alcaraz", "Joaquin Bello", "Maria Margarita Benitez", "Francisco Casasola"};
    

    // inicializo el array de salirPizarra y le asigno 6 posiciones // los alumnoses
    int salirPizarra[] = new int [6];
    // pido las salirPizarras y las guardo 
    for (int x = 0; x < 6; x++) {
      // muestro los alumnos
      salirPizarra[x] = (int)(Math.random()*5);
    }   //pide la salirPizarra

        
    for (int x = 0; x < 6; x++) {
      // PINTA LOS alumnos
     
      System.out.print("\t alumnos: " + alumnos[x]);// PITANDO LOS DOS PUNTO JUNTITOS
       System.out.println("\t indice: " + x);
      //System.out.print(": ");
  
      // TERMINO IMPRIMIENDO LOS GRADOS DENTRO DEL FOR PRINCIPAL. 
      
      //System.out.print(" l ");//no puedo imprimir los caracteres de las barras por la codificación me muestra otro.
      //System.out.println();

    }
    
  }
}
