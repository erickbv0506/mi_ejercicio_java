/*
 Autor Jose Elkin Vargas Alacon
 */
package iterativas;

import java.util.Scanner;

public class FOR {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
     
         System.out.println("=Productos=");
         
         String NombreProducto1="Bicicletas";
         int valor1=200000;
         String NombreProducto2="Audifonos";
         int valor2=40000;
         String NombreProducto3="Mochila";
         int valor3=50000;
         String NombreProducto4="Tablet";
         int valor4$=200000;
         String NombreProducto5="Celular";
         int valor5=800000;
         double compra=0;
         double descuento=0;
         int totalpagar=0;
         int tipoproducto=0;
         int tipocliente = 0;
         
         
         
         
         
         System.out.println("seleccione el tipo de producto");
         System.out.println("1.  bicicleta ....200000");
         System.out.println("2.  audifonos.....40000");
         System.out.println("3.  mochila....50000");
         System.out.println("4.  Tablet...20000");
         System.out.println("5. Celular....800000");
         tipoproducto= input.nextInt();
        
         
       
       
         for( tipocliente=1; tipocliente<=5; tipocliente++){
          
               while(tipocliente==1){
               }
               
               System.out.println("ingrese el valor de la compra: ");
              
               compra=input.nextInt();
               
               descuento = compra * 0.2;
               totalpagar= (int) (descuento - compra);
              
               
               System.out.println("su descuento es de: " + descuento);
               System.out.println("el total a pagar es: " + totalpagar);
               
            }
               while (tipocliente==2){
               System.out.println("cliente numero 2...");
               System.out.println("ingrese el valor de la compra: ");
               tipocliente=input.nextInt();
               compra=input.nextInt();
               
               descuento = compra * 0.15;
               totalpagar= (int) (descuento - compra);
              
               
               System.out.println("su descuento es de: " + descuento);
               System.out.println("el total a pagar es: " + totalpagar);
                 
          }   
}
         
}
     
