/**
 * Escribe un programa que diga cuántos números capicúa ha introducido un usuario.
 *  
 * A priori, el programa no sabe cuántos números se introducirán. El usuario 
 * indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * 
 * Fecha: 15/11/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
 import java.util.*;
 
public class Ex05mmbv01 {
  public static void main (String[] args){
    System.out.println("** Vamos a saber cuantos números capicúa ha introducido un usuario **\n");
    System.out.println("NOTA: El programa dejará de ejecutarse cuando introduzcas un número negativo\n");
    
    int n = 0;
    int contador = 0;
    int cantidad = 0;
    int ncapicua = 0;
    
    ArrayList<Integer> arrayCapicuas = new ArrayList<Integer> (); // array dinámico para guardar los datos introducidos
    
    
    while(n >= 0){
    
      System.out.print(" Introduce un número: "); // pedimos lo números por teclado
      n = Integer.parseInt(System.console().readLine());
        
      if (n >= 0) {
        cantidad++;// se detiene cuando introducimos un número negativo.
           
        if (n < 10) {
          ncapicua = n;
          contador++;
        }
         
        else if ((n >= 10) && (n < 100)) {
          if ((n / 10) == (n % 10)) {
            ncapicua = n;
            contador++;
          }
        }

        else if ((n >= 100) && (n < 1000)) {
          if ((n / 100) == (n % 10)) {
            ncapicua = n;
            contador++;
          } 
        }

        else if ((n >= 1000) && (n < 10000)) {
          if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
            ncapicua = n;
            contador++;
          }
        }
          
        else {
          if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
            ncapicua = n;
            contador++;
            
          }
        }
            
        if (n == ncapicua){           
          System.out.println("El número " + n + " es capicua.");
          arrayCapicuas.add(ncapicua); // solo guardamos dentro del array los que son capicua
            
        } 
        else {            
            System.out.println("El número " + n + " no es capicua.");
        }
      }
      else {         
        System.out.println("La cantidad de números capicua introducidos es: " + contador);
      }
      
    }
    
    //for(int i = 0; i < arrayCapicuas.size(); i++)
    
    for(int i=0 ; i< arrayCapicuas.size() ; i++) { // Array dimanico donde se guardan todas los numeros capicua introducidos
           System.out.println(arrayCapicuas.get(i));
           //System.out.println("HOLA");
           
        }
      
      //arrayCapicuas.add(ncapicua);
      //System.out.println(ncapicua +" ");
  }
}


