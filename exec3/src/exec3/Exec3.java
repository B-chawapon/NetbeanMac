/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec3;
import java.util.Scanner;
/**
 *
 * @author b.nut
 */
public class Exec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number=in.nextInt();
        int d1=number%10;
        int d2=(number/10)%10;
        int d3=number/100;
        int sum=d1+d2+d3;
        /*System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);*/
        System.out.print("The sum of digits ");
        System.out.println(sum);
    }
    
}
