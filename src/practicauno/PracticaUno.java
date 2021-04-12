/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class PracticaUno {
static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static int tabla (int a , int b ){ 
        int c=0;
      if(b==0)
          return 0;
      if(b==1){
           return a; 
      } if(b>1){ 
           c=tabla(a,b-1)+a;
           System.out.println(a+"X"+b+"="+c);
      }
       return c; 
       }
        
  
    public static void main(String[] args) {
        // TODO code application logic here
        int a; 
        System.out.println("Ingrese el numero a multiplicar");
        a=entrada.nextInt(); 
        tabla(a,10);
    }
    
}
