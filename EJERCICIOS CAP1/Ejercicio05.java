/**
 * @author Margarita Benitez
 */

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
   
    String r = "\033[31m";
    String v = "\033[32m";
    String n = "\033[33m";
    String a = "\033[34m";
    String m = "\033[35m";
    String b = "\033[37m";
    String celeste = "\033[36m";
   
   
    System.out.println(celeste +"Lunes:    \t" + b +"FOL\t"  +"FOL\t" +"FOL\t" + r + "PROG\t"+ v +"ED\t"+"ED\t");
    System.out.println(celeste +"Martes:   \t" + r +"PROG\t" +"PROG\t"+"PROG\t"+ n + "BBDD\t"+"BBDD\t"+"BBDD\t");
    System.out.println(celeste +"Miércoles:\t" + a +"SIN\t"  +"SIN\t" +"SIN\t" +"SIN\t"+  m  + "LM\t"+"LM\t");
    System.out.println(celeste +"Jueves:   \t" + r +"PROG\t" +"PROG\t"+"PROG\t"+ v + "ED\t"  + m +"LM\t"+"LM\t");
    System.out.println(celeste +"Viernes:  \t" + n +"BBDD\t" +"BBDD\t"+"BBDD\t"+ r +"PROG\t" + a +"SIN\t"+"SIN\t");
  }
}
