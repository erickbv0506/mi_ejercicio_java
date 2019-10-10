
package metodos;


public class ConRetornoConParametros {
          
          public double calcuar(int n1,int n2,int op){
              double resultado=0;
              switch(op){
                  case 1:
                      resultado =n1+n2;
                      
                      break;
                  case 2:
                      
                      resultado =n1-n2;
                      break;
                  case 3:
                      resultado = n1*n2;
                      break;
                  case 4:
                      resultado = n1/n2;
                      
              
              }
              
              return resultado;
                      
          
          }
}
   
     

