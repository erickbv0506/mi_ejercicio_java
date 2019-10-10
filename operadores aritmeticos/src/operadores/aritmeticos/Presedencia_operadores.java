/*
Autor Jose Elkin Vargas
 */
package operadores.aritmeticos;


public class Presedencia_operadores {
public static void main(String[] args) {
    
    System.out.println("=operadores=");
    
    //Aqui se le das un valor diferente a  las variables 
    
    int NotaEstudiante1=4;
    int NotaEstudiante2=4;
    int NotaEstudiante3=4;
    
    //Con la variable resultado hacemos la presedencia para ejeuctar la operacion 
    
    double Resultado=(NotaEstudiante1+NotaEstudiante2+NotaEstudiante3)/3;
    // Imprimimos el resultado para ejecutarlo
    
   // System.out.println("el promedio es: "+ Resultado);//
    
    int cole1=56;
    int cole2=40;
    int cole3=30;
    int totalboletas=(cole1+cole2+cole3)*3;
    
    System.out.println("el total de las boletas a imprimir es: "+ totalboletas);
    
    
    
    
}
}
