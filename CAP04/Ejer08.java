/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Margarita Benitez
 */

public class Ejer08 {
  public static void main(String[] args) {
    
    System.out.println(" \nCALCULA LA NOTA MEDIA DE TRES ASIGNATURAS\n "  );
    
    System.out.print("Introduce la nota del primer examen de FOL:  ");
    double primerExamenFol = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen de FOL:  ");
    double segundoExamenFol = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del tercer examen de FOL:  ");
    double tercerExamenFol = Double.parseDouble(System.console().readLine());
    
    System.out.println("");
           
    double notaMediaFol  = (primerExamenFol + segundoExamenFol + tercerExamenFol) / 3;
        
    System.out.println("--------------------------- "  );
    System.out.println("       RESUMEN NOTAS     \n"  );
    System.out.println("---------------------------"  );
    
    String calificacion = "nada"; // nota inicializar la variable con algún valor, sino me dice que tengo que inicializarla
      
    if ((notaMediaFol <0) || (notaMediaFol > 10)){
      System.out.printf(" LA NOTA INTRODUCIDA ES ERRONEA");
    }else if (notaMediaFol >= 5 && notaMediaFol < 6){
      calificacion = "SUFICIENTE";
    }else if (notaMediaFol >= 6 && notaMediaFol < 7){
      calificacion = "BIEN";
    }else if (notaMediaFol >= 7 && notaMediaFol < 9){
      calificacion = "NOTABLE";
    }else if (notaMediaFol >= 9 && notaMediaFol <=10){
      calificacion = "SOBRESALIENTE";
    }else{
      System.out.printf(" LA NOTA INTRODUCIDA ES ERRONEA");
    }
    
    
    System.out.printf("Nota media FOL: %.2f \n" , notaMediaFol );
    System.out.printf("" + calificacion );
   
  }
}


