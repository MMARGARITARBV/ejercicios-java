/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Margarita Benitez
 */

public class Ejer08 {
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
      } else {
        System.out.print("Introduce la nota del tercer exámen:  ");
        double tercerExamen = Double.parseDouble(System.console().readLine());
        
        if ((tercerExamen < 0) || (tercerExamen > 10)){
          System.out.print("La nota del tercer exámen no es correcta \n");
        }else{
       
        double notaMedia = (primerExamen + segundoExamen + tercerExamen) / 3;
        String calificacion = "niidea" ; // preguntar por qué tengo que inicializarla
            
        if ((notaMedia >= 0) && (notaMedia < 5)){
          calificacion = "INSUFICIENTE";
        } else if ((notaMedia >= 5) && (notaMedia < 6)){
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
    
          
          System.out.println("--------------------------- "  );
          System.out.println("       RESUMEN NOTAS     \n"  );
          System.out.println("---------------------------"  );
        
          System.out.printf(" LA NOTA MEDIA ES : %.2f \n" , notaMedia);
          System.out.printf(" LA CALIFICACIÓN ES : " + calificacion);
        }
      }  
    }      
  }      
}


