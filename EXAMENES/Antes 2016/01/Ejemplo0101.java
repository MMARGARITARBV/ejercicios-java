/*
 * 0101.java
 * 
 * Realiza un programa que calcule el consumo calórico ideal diario de una persona según sus características
 * físicas y su actividad. 
 * 
 * El primer paso es calcular el RMB (ritmo metabólico basal) que da un número en Kcal/día según la siguiente fórmula:
 * 
 * Hombres = 66,473 + (13,752 x peso en kg) + (5,0033 x altura en cm) - (6,755 x edad)
 * Mujeres = 655,0955 + (9,463 x peso en kg) + (1,8496 x altura en cm) - (4,6756 x edad)
 * 
 * A continuación, para obtener el consumo calórico ideal diario, 
 * hay que multiplicar el RMB por un número según la actividad física:
 * 
 *  1 para una persona inactiva, 
 * 1.2 para una persona con actividad física ligera, 
 * 1.4 para una persona con actividad media, 
 * 1.6 para una persona muy activa y 
 * 1.8 para una persona de actividad extrema
 * 
 */


public class Ejemplo0101 {
 
 public static void main (String args[]){
   
    System.out.println("Este programa calcula el consumo calórico diario ideal de una persona.");
    System.out.print("¿Es usted hombre o mujer?: ");
    String sexo = System.console().readLine();
    
    System.out.print("Indique su peso en KG: ");
    double peso = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indique su altura en CM: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indique su edad: ");
    int edad = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nTipos de actividades físicas: ");
    System.out.println("1. inactiva");
    System.out.println("2. ligera");
    System.out.println("3. media");
    System.out.println("4. activa");
    System.out.println("5. extrema \n");
    
    System.out.print("Con cual de las actividades físicas se siente más identificado: ");
    String actividad = System.console().readLine();
    
    double rbm = 0;
    double actividadinicial = 0;
    
    switch (actividad) {
      case "inactiva":
      actividadinicial = 1.0;
      break;
      case "ligera":
      actividadinicial = 1.2;
      break;
      case "media":
      actividadinicial = 1.4;
      break;
      case "activa":
      actividadinicial = 1.6;
      break;
      case "extrema":
      actividadinicial = 1.8;
      break;
      default:
      System.out.println("La actividad introducida no es correcta. Recuerde poner: inactiva, ligera, \nmedia, activa o extrema");
      break;
    } switch (sexo) {
        case "mujer":
        rbm = 655.0955 + (9.463 * peso) + (1.8496 * altura) - (4.6756 * (double)edad);
        break;
        case "hombre":
        rbm = 66.473 + (13.752 * peso) + (5.0033 * altura) - (6.755 * (double)edad);
        
        default:
        System.out.println("El sexo introducido no es correcto. Recuerde poner: mujer o hombre");
        break;
      }
      
    System.out.printf("\nRESPUESTA: \nSu consumo calórico ideal diario es: %.3f Kal/día.", (rbm * actividadinicial) );
    
    /*if (actividadinicial > 0) {
        if (sexo.equals("hombre")) {
          rbm = 66.473 + (13.752 * peso) + (5.0033 * altura) - (6.755 * (double)edad);
        }
        if (sexo.equals("mujer")) {
          rbm = 655.0955 + (9.463 * peso) + (1.8496 * altura) - (4.6756 * (double)edad);
        }
      System.out.printf("Su consumo calórico ideal diario es: %.3f", (rbm * actividadinicial), "Kal/día.");
    }*/
  }
}

