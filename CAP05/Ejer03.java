/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
 * 
 *@author Margarita B. V
 */

public class Ejer03 {
  public static void main(String[] args) {
    
    System.out.println(" \nMUESTRE LOS NÚMEROS MÚLTIPLOS DE 5 DEL 0 A 100\n "  );
    System.out.println("");
    
    int numero = 0;
    
    do {
      System.out.println(numero);
      numero = (numero + 5);
    } while (numero <= 100); 
    
        
    /* MUESTRA LOS NÚMEROS CON EL WHILE
    int numero = 0; 
       
    while (numero <= 100) { // mientras número menor o igual que 100
      //numero = (numero + 5); // si incremento la variable antes de mostrarla me muestra hasta  105. Para que no me diera error tendría que incializarla a -5
      System.out.println(numero); //sentencia
      numero = (numero + 5); // si la incremento después de mostrarla me incrementa solo hasta el 100
      //numero++; // muestra infinitas veces el número inicializado en la variable numero
    }
    MUESTRA LOS NÚMEROS CON EL FOR
        
    for (int numero = 0; numero <= 100; numero = (numero + 5)) { // hace lo mismo pero con el for
      System.out.println(numero);
    }*/
  }
}


