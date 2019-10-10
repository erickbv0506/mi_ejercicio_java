
package practica;

import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
     
        int ROCK;
        int REGGUETON;
        int METAL;
        int VALLENATO;
        int POP;
        int RAP;
        int genero = 0;
        String contraseña = "1234";
        String PassIngresada = "";
        String Usuario= "Erick";
        
        System.out.println("ingrese su usuario");
        
        Usuario = input.nextLine();
        
        System.out.println("ingrese Contraseña");
        
       PassIngresada=input.nextLine();
       
       
       if( PassIngresada.equals(contraseña)){
        
        System.out.println("Hola,Bienvenido a tu MUSIC: " + Usuario); 
                  System.out.println("que musica quieres escuchar");
       
           System.out.println(" 1.ROCK");
           System.out.println("2.REGGUETON");
           System.out.println("3.METAL");
           System.out.println("4.VALLENATO");
           System.out.println("5.POP");
           System.out.println("6.RAP");
        
            genero= input.nextInt();
         
         if(genero==1){
              System.out.println("haz seleccionado ROCK");
            }
          
        if(genero==2){
              System.out.println("haz seleccionado REGGUETON");
            }
        if(genero==3){
              System.out.println("haz seleccionado METAL");
            }
        if(genero==4){
              System.out.println("haz seleccionado VALLENATO");
            }
        if(genero==5){
              System.out.println("haz seleccionado POP");
            }
        if(genero==6){
              System.out.println("haz seleccionado RAP");
            }
       
     System.out.println("Disfruta tu musica");
        
        
       }
       
       else{
       System.out.println("Contraseña Incorrecta");
       
       }
       

    }
    
}
