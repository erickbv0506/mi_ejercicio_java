/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

public class Metodos {

   
    public static void main(String[] args) {
        int operacion;
        Scanner input= new Scanner (System.in);
        
        SinRetornoSinParametros Saludo = new  SinRetornoSinParametros();
        SinRetornoConParametros NombreUsuario = new  SinRetornoConParametros();
        
        String Nombre = "hola";
        
        Saludo.MostrarSaludo ();
        
        System.out.println("Por favor ingrese su nombre: ");
        Nombre = input. nextLine();
        
        NombreUsuario.Nombre (Nombre);
        
        
        
        ConRetornoSinParametros objecto3= new ConRetornoSinParametros();
        
        String retorno = "";
        
        retorno = objecto3.Mensaje();
        
        System.out.println(retorno);  
        
        ConRetornoConParametros objecto4 = new ConRetornoConParametros();
        int cc =0;
        int num1=0;
        int num2=0;
        
        System.out.println("ingrese el nuemro 1 :"  );
        num1= input.nextInt();
  
        System.out.println("ingrese el numero 2 ");
        num2= input.nextInt();
       
         
        System.out.println("elige lsa opéracion 1)suma 2)resta 3)multiplicacion 4)division" );
        operacion= input.nextInt();
       
        System.out.println("el reusltado es "+objecto4.calcuar(num1, num2, operacion));
    }
    
}
