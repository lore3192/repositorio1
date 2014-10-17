/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion_division;

import java.util.Scanner;

public class Multiplicacion_division {

    /**
     * 
     * 


       
        
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          
        int n1, n2, multiplicacion;
        float  respuesta, division;
        
       
        
        
        Scanner p=new Scanner (System.in);
        
       
        
        
        System.out.println("ingrese el n1: ");
        n1=p.nextInt();
        
        System.out.println("ingrese n2: ");
        n2=p.nextInt();
        
        multiplicacion= n1*n2;
        
       System.out.println("la multiplicacion de " + n1 + "*" + n2 + " =" + multiplicacion);
  
       
       respuesta= (float)  n1/n2;
       
System.out.println("la division de " + n1 + "/" + n2  + " = " + respuesta);       

     
    float resultado_divi= Math.round(respuesta);
    
    System.out.println(" el resultado de la division redondeado es" + " = " + respuesta);           
  


        }
    
}
