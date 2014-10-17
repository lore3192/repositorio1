/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senocoseno;

import java.util.Scanner;

public class Senocoseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner p=new Scanner (System.in);
        
        float hipotenusa, cateto_adyacente, cateto_opuesto, seno, coseno;
        
    System.out.println("ingrese el cateto opuesto: ");
    cateto_adyacente=p.nextFloat();
    
    
    System.out.println("ingrese el cateto adyacente: ");
    cateto_opuesto=p.nextFloat();
    
     
    System.out.println("ingrese la hipotenusa: ");
    hipotenusa=p.nextFloat();
    
    seno=(float) Math.sin(cateto_opuesto/hipotenusa);
    coseno=(float) Math.cos(cateto_adyacente/hipotenusa);
    
    System.out.println("seno = " + seno );
    System.out.println("coseno = "+ coseno);
    }
    
}
