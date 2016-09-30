/**
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Margarita Benitez
 */

public class Ejer09 {
  public static void main(String[] args) {
    
    System.out.println("CALCULA EL VOLUMEN DE UN CONO\n"  );
    
    System.out.print("Introduce el RADIO del cono:  ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la ALTURA del cono:  ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double pi = Math.PI ; // definiendo la variable pi y utilizando la clase MATH.PI para sacar el número pi
    double r  = 3.14 ;
       
    double volumen = (((pi * (radio * radio)) * altura)/3) ;
    double volumenV2 = (((3.14 * (radio * radio)) * altura)/3);
    double volumenV3 = ((((radio * radio) * altura) * r) / 3 ) ;
    
    System.out.println("--------------------------- "  );
    System.out.println("       DETALLE VOLUMEN CONO\n"  );
    
    System.out.println("RADIO: " + radio );
    System.out.println("ALTURA: " + altura );
    System.out.printf("PI  %.3f \n ", Math.PI); // Mostrando el número PI
    System.out.println("---------------------------\n"  );
    System.out.printf("VOLUMEN CONO OPCION MATH=  %.1f\n" , volumen);
    System.out.printf("VOLUMEN CONO OPCION 3.14=  %.1f\n" , volumenV2); 
    System.out.printf("VOLUMEN CONO OPCION FORMULA DIFERENTE =  %.1f\n" , volumenV3);
    
    
  }
}


