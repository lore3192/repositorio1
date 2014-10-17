/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numelevado;

import java.util.Scanner;

public class Numelevado {
    
   
    
    
    
    
    public static void main(String[] args) {
      
        Scanner p=new Scanner(System.in);
        
        
        int base, n; 
      
       
        System.out.println("ingrese la base : ");
        base=p.nextInt();
      
       
         
        System.out.println("ingrese el exponente : ");
        n=p.nextInt();
        
        int resultado = (int) Math.pow(base, n);
        
        System.out.println( base + " elevado a la " + n + " es igual a " + resultado );
    }
    }
    
    

