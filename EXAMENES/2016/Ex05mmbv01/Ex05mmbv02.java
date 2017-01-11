/**
 * Realiza un programa que calcule el precio de un desayuno. 
 * El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo.
 * La palmera vale 1’40 y el donut 1 euro.
 * En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; 
 * el primero vale 1’20 y el segundo 1’80. 
 * Por último se pregunta por la bebida: zumo o café a 1’50 y 1’25 respectivamente. 
 * Se pueden omitir las tildes (por ej. cafe en lugar de café) para evitar posibles
 * problemas en la codificación de caracteres.
 * 
 * Fecha: 15/11/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
public class Ex05mmbv02 {
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula el precio de un desayuno.");
    System.out.println("¿Que ha tomado para comer? ");
    System.out.println("Indique si es palmera, donut o un pifuto");
    String comidaSinEspecialidad = System.console().readLine();
        
    double precio = 0;
    double bebida = 0;
    
   
    switch (comidaSinEspecialidad) {
      case "palmera":
      precio = 1.40;
      break;
      case "donut":
      precio = 1;
      break;
      case "pitufo":
      System.out.println("¿El pitufo tiene aceite o tortilla?");
      String menuPitufo = System.console().readLine();
      
        switch (menuPitufo){
          case "aceite":
          precio = 1.20;
          break;
          case "tortilla":
          precio = 1.80;
          break;
          default:
          System.out.println("los datos introducidos no son correctos");
          break;
        } 
      }
          
    System.out.println("Introduzca lo que desea tomar, solo tenemos zumo o cafe");
    String menuBebida = System.console().readLine();
    
      switch (menuBebida) {
        case "zumo":
        bebida = 1.50;
        break;
        case "cafe":
        bebida = 1.25;
        break;
        default:
        System.out.println("La bebida no está bien escrita");
        break;
      }
    System.out.printf("la comida sale por un total de : %.2f Euros",(precio +  bebida));
  }
}
