/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * Se pregunta el cargo del empleado 
 * (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), 
 * los días que ha estado de viaje visitando clientes durante el mes 
 * y su estado civil (1 - Soltero, 2 - Casado).
 * El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
 * Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
 * Al sueldo neto hay que restarle el IRPF, 
 * que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 *@author Margarita B. V
 */
 
public class Ejer24 {
  public static void main (String[] args){
    
    System.out.print("\nVAMOS A GENERAR TU NÓMINA:\n");
    
    System.out.println("\nEn la empresa existen 3 tipos de cargos");
    System.out.print("\n1. si es Prog. junior \n2. si es Prog. senior \n3. si es Jefe de proyecto.\n ");
    System.out.print("\nINTRODUZCA SU CARGO: ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    String nombreCargo = "";
    double sueldoBase = 0;
    
    switch (cargo){
      case 1:
        nombreCargo = "Prog. junior";
        sueldoBase = 950 ;       
        break;
      case 2:
        nombreCargo = "Prog. senior";
        sueldoBase = 1200 ;       
        break;
      case 3:
        nombreCargo = "Jefe de proyecto";
        sueldoBase = 1600 ;       
        break;
      default: // default son todos los valores que no estan dentro de los case. 
        System.out.print("disculpa pero no has escrito correctamente el número del cargo");
        System.exit(1); // error -- no relación del número con el nombre del cargo
    }
    
    System.out.println("");
    System.out.println("NOTA: Recuerda que el maximo de días de visita a los clientes es de 20 días");
    System.out.print("INTRODUZCA LOS DÍAS QUE HA ESTADO VISITANDO CLIENTES DURANTE EL ÚLTIMO MES : ");
    int diasVisitas = Integer.parseInt(System.console().readLine());
    
    double extraVisitas= 0;
    
    if ((diasVisitas >= 0) && (diasVisitas <= 20)) {
        extraVisitas = diasVisitas * 30;
      } else {
        System.out.println("El número de días de visita no es correcto.");
        System.exit(2); // podemos utilizar tambien el RETURN que me sale para el main. El error es introducir mal el número de días
      }
    
    
    System.out.print("\nCUAL ES SU ESTADO CIVIL, 1 es Soltero y  2 es Casado) ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    String tipoEstadoCivil = "" ;
    String textoPorcentajeIrpf  = "" ;
    double irpfSoltero = 0 ;
    double irpfCasado = 0 ;
    double totalIrpf = 0.0;
    
    switch (estadoCivil){
      case 1:
        tipoEstadoCivil = "Soltero";
        textoPorcentajeIrpf  = "25%";
        totalIrpf = sueldoBase * 0.25;       
        break;
      case 2:
        tipoEstadoCivil = "Casado";
        textoPorcentajeIrpf  = "20%";
        totalIrpf = sueldoBase * 0.20 ;        
        break;
      default: // default son todos los valores que no estan dentro de los case. 
        System.out.print("disculpa pero no has escrito correctamente el número que corresponde al Estado Civil");
        System.exit(3); // error -- no relación del número con el estado civil
    }
    
    // una vez ya hemos realizado los descartes realizamos las operaciones que nos faltan.
    
    double sueldoBruto = sueldoBase + extraVisitas;
    double sueldoNeto = sueldoBruto - totalIrpf; // como sacamos el NETO?
    
   
    System.out.println("\nTU CARGO ES: " + nombreCargo);
    System.out.println("TU ESTADO CIVIL ES: " + tipoEstadoCivil );
    System.out.println("DIAS QUE HAS VISITADO CLIENTES: " + diasVisitas);
    System.out.println("\n****************************\n");
    
    System.out.println("         *SALARIO* ");
    System.out.println("****************************");     
    System.out.println("Sueldo BASE: " + sueldoBase +'€');
    System.out.println("Dietas     : " + extraVisitas +'€');
    System.out.println("****************************");  
    System.out.println("Sueldo BRUTO  " + sueldoBruto + '€');
    System.out.println("Retención IRPF ("+textoPorcentajeIrpf +")"+ totalIrpf + '€');
    System.out.println("****************************");  
    System.out.println("\nSueldo NETO = "+ sueldoNeto + '€'); 
  }
}
