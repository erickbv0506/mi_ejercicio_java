
package metodos2;

import java.util.Scanner;


public class MetodosConRetornosConParametros {
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    FormatoFechas FechaMes = new FormatoFechas ();
    
    
    int DiaNacimiento = 0;
    int MesNacimiento = 0;
    int AnyoNacimeto = 0;
    String MesEnLetras="";
    
    System.out.println(" Ingrese su Fecha de Nacimento" );
    System.out.println(" Ingrese el Dia: " );
    DiaNacimiento = input.nextInt();
    System.out.println(" Ingrese el mes (utilize solo Enteros) : " );  
    MesNacimiento = input.nextInt();
    System.out.println(" Ingrese el Año: " );
    AnyoNacimeto = input.nextInt();
    
    MesEnLetras = FechaMes.DevolverMesTexto(MesNacimiento);
    
    System.out.println(" Usted nacio en el dia " + DiaNacimiento + " del Mes " + MesEnLetras +  " en el año " + AnyoNacimeto);
    }
    
}
