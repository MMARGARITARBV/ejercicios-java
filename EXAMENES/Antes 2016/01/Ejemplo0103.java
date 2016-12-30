/*
 * Ejemplo0103.java
 * 
 * Copyright 2016 FPMARGA <fpmarga@fpmarga>
 * 
 * Realiza una programa que calcule los segundos transcurridos entre dos horas de un día.
 * 
 * Para cada hora del día se introduce la hora y los minutos. 
 * Se da por hecho que el usuario introduce los datos correctamente 
 * y que la segunda hora es posterior a la primera.
 * 
 * Ejemplo:
 * Primera hora
 * Hora: 19
 * Minuto: 10
 * Segunda hora.
 * Hora: 20
 * Minuto: 15
 * 
 * Entre las 19:10h y las 20:15 hay 4500 segundos.
 * 
 * 
 */


public class Ejemplo0103 {
 
 public static void main (String args[]) {
  
  System.out.println("Este programa calcula los segundos trasncurridos entre dos horas de un día.");
  System.out.println("-----------------------------------------------------------------------------");
  
  System.out.print("\nIntroduzca la primera hora: ");
  int primeraHora = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca los minuto: ");
  int primerosMinutos = Integer.parseInt(System.console().readLine());
  
  System.out.println("");
  
  System.out.print("Introduzca la segunda hora: ");
  int segundaHora = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca los minutos: ");
  int segundosMinutos = Integer.parseInt(System.console().readLine());
  
  System.out.print("\nPrimera hora \nHora: " + primeraHora + "\nMinuto: " + primerosMinutos);
  System.out.print("\nSegunda hora \nHora: " + segundaHora + "\nMinuto: " + segundosMinutos);
  
  int segundosTranscurridos = 0;
  int horasDefinitivas = 0;
  int minutosDefinitivos = 0 ;
  
  int primeraHoraEnSegundos = primeraHora * 3600;
  int primerosMinutosEnSegundos = primerosMinutos * 60;
  int totalPrimeraHora = primeraHoraEnSegundos + primerosMinutosEnSegundos;
  
  int segundaHoraEnSegundos = segundaHora * 3600;
  int segundosMinutosEnSegundos = segundosMinutos * 60;
  int totalSegundaHora = segundaHoraEnSegundos + segundosMinutosEnSegundos;
  
  
  
  
  if (totalSegundaHora >= totalPrimeraHora) {
    segundosTranscurridos  = totalSegundaHora - totalPrimeraHora;
    } else {
      System.out.println("la hora introducida no es correcta");
    }
        
  System.out.println("\n");
  
  System.out.printf("Entre las %d:%d y las %d:%d hay %d segundos ", primeraHora, primerosMinutos, segundaHora, segundosMinutos, segundosTranscurridos);
 }
}

