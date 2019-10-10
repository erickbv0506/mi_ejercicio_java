
package operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresLogicos {
    
    
        public static void main(String [] args) {
         
            Scanner input = new Scanner(System.in);
         
         int Sede = 0;
         int DiadeFacturacion = 0;
         double ValorCompra = 0;
         int Edad = 0;
         
         System.out.println("ingrese la sede del almacén: ");   
         Sede = input.nextInt();
         System.out.println("ingrese el dia de la facturtacion: ");            
         DiadeFacturacion = input.nextInt();
         System.out.println("ingrese el valor de compra: ");            
         ValorCompra = input.nextInt();
         System.out.println("ingrese la edad: ");            
         Edad= input.nextInt();
         
         if (Sede !=11001){
             System.out.println("Los descuentos no aplican para esta sede");
         }
         else{
             if((DiadeFacturacion == 15 ||DiadeFacturacion == 30) && ValorCompra >=50000){
             }
                 }


        }
}
