/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise02;
import java.util.Scanner;
/**
 *
 * @author b.nut
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a=3.4;
        double b=50.2;
        double c=2.1;
        double d=0.55;
        double e=44.5;
        double f=5.9;
        
        double x =((e*d-b*f))/((a*d)-(b*c));
        double y =((a*f)-(e*c))/((a*d)-(b*c));
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
