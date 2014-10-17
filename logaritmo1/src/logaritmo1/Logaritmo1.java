///////*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logaritmo1;

 import java.util.Scanner;
 public class Logaritmo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Scanner p=new Scanner (System.in);

    int n;
    float logaritmo;
   
System.out.println("ingrese el numero: ");
n=p.nextInt();


 logaritmo=(float) Math.log10(n);

System.out.println("el logaritmo de "+ n + " es igual "+ logaritmo);

}