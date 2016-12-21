/**
 *Ejercicio 16: Realiza un programa que nos diga si hay probabilidad de que 
 *nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que
 *el usuario contestará con verdadero o falso. Cada pregunta contestada como 
 *verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman
 *puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas y 
 *las conclusiones del programa.
 *
 *@author Margarita B. V
 * 
 * Sentencia Condicional (if y switch)
 * 
 */
 
public class Ejer16 {
  public static void main (String[] args){
    System.out.println("Text de infidelidad");
    System.out.println("-------------------");
    System.out.println("Responda a las preguntas con verdadero o falso");
    
    int puntos = 0;
    
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin");
    System.out.println(" ningún motivo aparente.");
    String respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por");
    System.out.println(" ti");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es ");
    System.out.print("hombre) o ahora se arregla el pelo y se asea con más ");
    System.out.println("frecuencia (si es mujer)");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar ");
    System.out.println("cuando estás tú delante");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o ");
    System.out.println("estar bronceado/a");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque ");
    System.out.println("dice tener mucho más trabajo");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde");
    System.out.println(" no ha ido contigo");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("verdadero")){
      puntos += 3;
    }
    
    if ((puntos >= 0) && (puntos <= 10)){
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }else if ((puntos >= 11) && (puntos <= 22)){
      System.out.print("Quizás exista el peligro de otra persona en su vida o");
      System.out.print(" en su mente, aunque seguramente será algo sin ");
      System.out.print("importancia. No bajes la guardia.");
    }else if ((puntos >= 23) && (puntos <= 30)){
      System.out.print("Tu pareja tiene todos los ingredientes para estar ");
      System.out.print("viviendo un romance con otra persona. Te aconsejamos ");
      System.out.print("que indagues un poco más y averigües que es lo que ");
      System.out.print("está pasando por su cabeza.");
    }
  }
}
