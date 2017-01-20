/**
Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. 

El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. 

La tarta de manzana vale 18 euros y la de fresa 16. 

En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco;
la primera opción vale 14 euros y la segunda 15. 

Por último se pregunta si se añade nata y si se personaliza con un nombre; 
la nata suma 2’50 y la escritura del nombre 2’75.


Ejemplo 1:
Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14
Con nata: 2’50
Total: 16’50
Ejemplo 2:
Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18
Con nombre: 2’75
Total: 20’75
*/
/**
Autor: Margarita Benitez Vargas

 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.println(" \n programa que hace presupuestos de tartas\n "  );

    System.out.print("De qué sabor es la tarta: manzana, fresa o chocolate: ");
    String saborTarta = System.console().readLine();
   
    double precio = 0;
    switch (saborTarta) {
      case "manzana":
      precio = 18;
      break;
      case "fresa":
      precio = 16;
      break;
      case "chocolate":
      System.out.print("¿el chocolate es negro o blanco? : ");
      String menuChocolate = System.console().readLine();
      
        switch (menuChocolate){
          case "negro":
          precio = 14;
          break;
          case "blanco":
          precio = 15;
          break;
          default:
          System.out.print("los datos introducidos no son correctos");
          break;
        } 
        System.out.print("¿Quiere nata? : ");
    
    String opcionNata = System.console().readLine();

    double nata = 0;

    switch (opcionNata) {
        case "si":
        nata =2.50;
        break;
        case "no":
        nata = 0;
        break;
        default:
        System.out.print("La proxima vez escribe correctamente 'si' o 'no'");
        break;
      }
    
    System.out.print("desea personalizar con un nombre? : ");
    String opcionPersonalizar = System.console().readLine();
    
    double personalizar = 0;
      switch (opcionPersonalizar) {
        case "si":
        personalizar = 2.75;
        break;
        case "no":
        personalizar = 0;
        break;
        default:
        System.out.print("La proxima vez escribe correctamente 'si' o 'no'");
        break;
		}
		
		System.out.printf("la tarta tiene un importe de: %.2f Euros",(precio +  nata + personalizar));
	 
		}
	}
}
