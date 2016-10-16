/**
 *Ejercicio 12: Realiza un minicuestionario con 10 preguntas tipo test sobre las
 *asignaturas que se imparten en el curso. Cada pregunta acertada sumará un 
 *punto. El programa mostrará al final la calificación obtenida. Pásale el 
 *minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 *andan de conocimientos en las diferentes asignaturas del curso.
 *
 *@author Margarita B. V
 */
 
public class Ejer12 {
  public static void main (String[] args){
    System.out.println("Vámos a hacer el cuestionario de DAW!!!");
    System.out.println("---------------------------------------");
    System.out.println("\nEscribe la respuesta correcta, 'a', 'b' o 'c'\n");
    
    int puntos = 0;
    String respuesta = "";
    
    System.out.println("1ª PREGUNTA: ¿En que ciudad recibimos clase?");
    System.out.println("a. Málaga");
    System.out.println("b. Paris");
    System.out.println("c. Miami");
    System.out.print("Escribe la respuesta correcta: ");    
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("a")){
      puntos += 1;
    }
    
    System.out.println("2ª PREGUNTA: ¿Cual es el profesor de BBDD?");
    System.out.println("a. Jesús");
    System.out.println("b. Luis");
    System.out.println("c. Juan Carlos");
    System.out.print("Escribe la respuesta correcta: ");    
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("a")){
      puntos += 1;
    }
        
    System.out.println("3ª PREGUNTA: ¿Cuantas chicas hay en el curso?");
    System.out.println("a. 3");
    System.out.println("b. 2");
    System.out.println("c. 1");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("b")){
      puntos += 1;
    }
    
    
    System.out.println("4ª PREGUNTA: ¿Cual es un lenguaje de marcas?");
    System.out.println("a. java");
    System.out.println("b. PHP");
    System.out.println("c. HTML");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("c")){
      puntos += 1;
    }
    
    System.out.println("5ª PREGUNTA: ¿Cuantas asignaturas vemos en el curso de DAW");
    System.out.println("a. 5");
    System.out.println("b. 4");
    System.out.println("c. 6");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("c")){
      puntos += 1;
    }
    
     System.out.println("6ª PREGUNTA: ¿Cómo se llama la estructura que sirve para ejecutar una acción cuando se cumple una condición y otra cuando no se cumple la condición?");
    System.out.println("a. Selectiva");
    System.out.println("b. Repetitiva");
    System.out.println("c. Secuencial");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("a")){
      puntos += 1;
    }
    
     System.out.println("7ª PREGUNTA: ¿¿Cómo puedo elevar un número a una potencia?");
    System.out.println("a. Operador **");
    System.out.println("b. Math.pow");
    System.out.println("c. Operador ^");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("b")){
      puntos += 1;
    }
    
     System.out.println("8ª PREGUNTA:¿Cuál de los siguientes tipos no es primitivo?");
    System.out.println("a. int");
    System.out.println("b. float");
    System.out.println("c. integer");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("c")){
      puntos += 1;
    }
       
    System.out.println("9ª PREGUNTA: ¿Qué modificador de acceso hace que una clase sea pública en Java?");
    System.out.println("a. private");
    System.out.println("b. protected");
    System.out.println("c. public");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("c")){
      puntos += 1;
    }
    
    System.out.println("10ª PREGUNTA: ¿El lenguaje ensamblador se sitúa?");
    System.out.println("a. Más cerca del lenguaje máquina que de los lenguajes de alto nivel ");
    System.out.println("b. Más cerca de los lenguajes de alto nivel que del lenguaje máquina ");
    System.out.println("c. Las anteriores respuestas no son correctas");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("a")){
      puntos += 1;
    }
       
    System.out.print("Has conseguido " + puntos + " puntos.");
  }
}
