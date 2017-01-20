/**
 * Escribe un programa que pida un número por teclado y que luego muestre la versión “complementaria”
 * de ese número de tal forma que:
 * 
 * cada dígito se cambia por su complementario (9 menos el dígito). 
 * 
 * Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * Fecha: 15/11/2016 
 * @author Maria Margarita Benitez Vargas
 */
 
public class Ex05mmbv04 {
  public static void main(String[] args) {
    System.out.println("Programa que nos va a restar 9 de cada digito que introduzcamos dentro de un número.");
       
    System.out.print("Por favor, introduzca un número entero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numeroReves = 0;
    long complementario = 0;
     
       while (numeroIntroducido > 0) { //voltea el número
         numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
         numeroIntroducido /= 10;
       }
       System.out.print("\nEl numero al revés es: " + numeroReves);
       
       while (numeroReves > 0) { //resta los digitos
         complementario = (complementario * 10) + (9 - numeroReves % 10);
         numeroReves /= 10;
       }
       
       System.out.print("\nEl complementario es el: " + complementario);
    }  
  }

