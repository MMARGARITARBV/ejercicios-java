/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Margarita Benitez
 */

public class Ejer21 {
  public static void main(String[] args) {
    
    System.out.println(" \nCALCULA LA NOTA MEDIA \n "  );
    
    System.out.print("Introduce la nota del primer exámen:  ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    if ((primerExamen < 0) || (primerExamen > 10)){
      System.out.print("La nota del primer exámen no es correcta \n");
    } else {
      System.out.print("Introduce la nota del segundo exámen: ");
      double segundoExamen = Double.parseDouble(System.console().readLine());
      
      if ((segundoExamen < 0) || (segundoExamen > 10)){
        System.out.print("La nota del segundo exámen no es correcta \n");
        
      }else { 
      
        double notaMedia = (primerExamen + segundoExamen) / 2;
        String calificacion = "niidea" ; 
            
        if ((notaMedia >= 0) && (notaMedia < 5)){
          calificacion = "INSUFICIENTE";
          System.out.println("\nHAS TENIDO QUE HACER RECUPERACIÓN.");
          System.out.println("---------------------------------- \n"  );
          
          System.out.print("Responde si el resultado de la recuperación ha sido 'Apto' o 'No apto': ");
          String recuperacion = System.console().readLine().toLowerCase();
                             
          String asignatura; 
          
          switch (recuperacion) {
              case "apto": // ojo con los dos puntos
              System.out.println("\nESFUERZATE UN POCO MÁS Y CONSEGUIRÁS MEJORAR\n");
              System.out.println("---------------------------------------------");
              System.out.printf(" NOTA PRIMER  EXAMEN: %.2f \n" , primerExamen);
              System.out.printf(" NOTA SEGUNDO EXAMEN: %.2f \n" , segundoExamen);
              System.out.println("--------------------------- "  );
              asignatura = "SU NOTA MEDIA DEL TRIMESTRE ES 5";
              break; // se utiliza para que no siga realizando el proceso infinitamente
            case "noapto":
            case "no apto":
              System.out.println("\nESFUERZATE UN POCO MÁS Y LO CONSEGUIRÁS\n");
              System.out.println("---------------------------------------------");
              System.out.printf(" NOTA PRIMER  EXAMEN: %.2f \n" , primerExamen);
              System.out.printf(" NOTA SEGUNDO EXAMEN: %.2f \n" , segundoExamen);
              System.out.println("--------------------------- "  );
              asignatura ="SU NOTA MEDIA DEL TRIMESTRE ES: " + notaMedia ;
              break;
              
            default: // se utiliza en el caso de que no cumpla ninguno de los casos
              asignatura = "\nDisculpa pero no has escrito correctamente la respuesta, vuelve a intentarlo";
            }             
              System.out.println(" "+ asignatura + " ");         
                                  
          } else{
                        
            if ((notaMedia >= 5) && (notaMedia < 6)){
              calificacion = "SUFICIENTE";
            } else if ((notaMedia >= 6) && (notaMedia < 7)){
              calificacion = "BIEN";
            } else if ((notaMedia >= 7) && (notaMedia < 9)){
              calificacion = "NOTABLE";
            } else if (notaMedia >= 9 && notaMedia <=10){
              calificacion = "SOBRESALIENTE";
            }else{
              System.out.printf(" LA NOTA INTRODUCIDA ES ERRONEA");
            }
          
            System.out.println("\nGENIAL, HAS APROBADO:  ");
            System.out.println("--------------------------- "  );
            System.out.println("\n      RESUMEN NOTAS     \n"  );
            System.out.println("---------------------------"  );
            
            System.out.printf("NOTA PRIMER  EXAMEN: %.2f \n" , primerExamen);
            System.out.printf("NOTA SEGUNDO EXAMEN: %.2f \n" , segundoExamen);
            System.out.println("---------------------------\n"  );
            System.out.printf("\nTU NOTA MEDIA ES :    %.2f \n" , notaMedia);
            System.out.printf("TU CALIFICACIÓN ES : " + calificacion);
        
          
        }  
      }  
    }      
  }      
}


