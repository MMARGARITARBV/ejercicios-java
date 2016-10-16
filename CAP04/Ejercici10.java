/**
 *Ejercicio 10: Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 *
 *@author Margarita B. V
 */
 
public class Ejercicio10 {
  public static void main (String[] args){
    System.out.print("Introduce tu día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes = (System.console().readLine()).toLowerCase();
    String horoscopo = "";
   
   
   
    
    switch (mes){
      case "enero":
        if (dia >= 1 && dia <= 19){
          horoscopo = "Sagitario";
        }else if (dia > 20 && dia <= 31){
          horoscopo = "Capricornio";
        }else{
          horoscopo = "";
        }
        break;
      case "febrero":
        if (dia >= 1 && dia <= 16){
          horoscopo = "Capricornio";
        }else if (dia >= 17 && dia <= 29){
          horoscopo = "Acuario";
        }else{
          horoscopo = "";
        }
        break;
      case "marzo":
        if (dia >= 1 && dia <= 12){
          horoscopo = "Acuario";
        }else if (dia >= 13 && dia <= 31){
          horoscopo = "Piscis";
        }else{
          horoscopo = "";
        }
        break;
      case "abril":
        if (dia >= 1 && dia <= 19){
          horoscopo = "Piscis";
        }else if (dia >= 20 && dia <= 30){
          horoscopo = "Aries";
        }else{
          horoscopo = "";
        }
        break;
      case "mayo":
        if (dia >= 1 && dia <= 14){
          horoscopo = "Aries";
        }else if (dia >= 15 && dia <= 31){
          horoscopo = "Tauro";
        }else{
          horoscopo = "";
        }
        break;
      case "junio":
        if (dia >= 1 && dia <= 21){
          horoscopo = "Tauro";
        }else if (dia >= 22 && dia <= 30){
          horoscopo = "Géminis";
        }else{
          horoscopo = "";
        }
        break;
      case "julio":
        if (dia >= 1 && dia <= 21){
          horoscopo = "Géminis";
        }else if (dia >= 22 && dia <= 31){
          horoscopo = "Cáncer";
        }else{
          horoscopo = "";
        }
        break;
      case "agosto":
        if (dia >= 1 && dia <= 11){
          horoscopo = "Cáncer";
        }else if (dia >= 12 && dia <= 31){
          horoscopo = "Leo";
        }else{
          horoscopo = "";
        }
        break;
      case "septiembre":
        if (dia >= 1 && dia <= 16){
          horoscopo = "VLeo";
        }else if (dia >= 24 && dia <= 30){
          horoscopo = "Virgo";
        }else{
          horoscopo = "";
        }
        break;
      case "octubre":
        if (dia >= 1 && dia <= 31){
          horoscopo = "Virgo";
        }else{
          horoscopo = "";
        }
        break;
      case "noviembre":
        if (dia >= 1 && dia <= 23){
          horoscopo = "Libra";
        }else if (dia >= 23 && dia <= 29){
          horoscopo = "Escorpio";
        }else if (dia == 30){
          horoscopo = "Ofiuco";
        }else{
          horoscopo = "";
        }
        break;
      case "diciembre":
        if (dia >= 1 && dia <= 18){
          horoscopo = "Ofiuco";
        }else if (dia >= 19 && dia <= 31){
          horoscopo = "Sagitario";
        }else{
          horoscopo = "";
        }
        break;
      default:
        mes = "";
        break;
    }
    if (mes != "" && horoscopo != ""){
      System.out.print("Naciste el día " + dia + " de " + mes);
      System.out.print(". Por lo tanto eres: " + horoscopo);
    }else{
      System.out.print("Fecha introducida incorrecta.");
    }
  }
}

