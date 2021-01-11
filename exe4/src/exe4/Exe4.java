/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4;
import java.util.Scanner;
/**
 *
 * @author b.nut
 */
public class Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in =new Scanner(System.in);
         System.out.print("Enter weight in pounds: ");
         double weight =in.nextDouble()*0.45359237;
         System.out.print("Enter height in inches: ");
         double height =in.nextDouble()*0.0254;
         double bmi=weight/(height*height);
        /* System.out.println(weight);
         System.out.println(height);*/
         System.out.println(bmi);
         
    }
    
}
