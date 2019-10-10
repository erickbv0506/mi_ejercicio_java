/*
 Autor Elkin Vargas
 */
package iterativas;

import java.util.Scanner;


public class FOR2 {
    
 public static void main(String[] args){
     
       Scanner input = new Scanner(System.in);
       
       int bicicleta= 200000;
       int billetera= 30000;
       int cuaderno= 2000;
       int lapiz = 800;
       int total = 0;
       int codigo = 0;
       int cantidad = 0;
       int totalacum= 0;
       String Respuesta="";
               
       System.out.println("Seleccione el tipo de producto que desea comprar");
       System.out.println("1.....bicicleta");
       System.out.println("2.....billetara");
       System.out.println("3......cuaderno");
       System.out.println("4.......lapiz");
       System.out.println("deseas seguir comprando otro producto: si/no ");
       Respuesta= input.next();
     
       
       while(Respuesta.equals("si"))
       {
        System.out.println("ingrese el codigo de la compra");
       codigo=input.nextInt();
    
       System.out.println("ingrese la cantidad");
       cantidad= input.nextInt();
        switch(codigo){
            case 1:
             total = bicicleta * cantidad;
             totalacum  += total;
             break;    
                
            case 2:
             total = billetera * cantidad;
             totalacum  += total;
             break;  
                
            case 3:
             total = cuaderno * cantidad;
             totalacum  += total;
             break; 
                
            case 4:
             total = lapiz * cantidad;
             totalacum  += total;
             break;
             
            default:
            System.out.println("deseas seguir comprando otro producto: si/no ");
            Respuesta= input.next();
                       
                
}
        System.out.println("el total de los productos comprados es: " + totalacum);
}
}
}