/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores.aritmeticos;

import java.util.Scanner;

public class Operadoresrelacionales {
public static void main(String[] args) {
    
     Scanner input= new Scanner(System.in);
     
     int numero1=0;
     int numero2=0;
     
     System.out.println("ingrese el primer numero: ");
     numero1= input.nextInt();
    
     System.out.println("ingrese el segundo numero: ");
     numero2= input.nextInt();
     
     if(numero1 != numero2){
      
         if(numero1 > numero2){
             System.out.println("el primer numero es mayor: "+ numero1);
         }
           else{
          System.out.println("el segundo numero es mayor: "+ numero2);
         }
        
     
     }
      else {
         System.out.println("los dos numeros son iguales"
         );
     }
    
     
     }
     
}
