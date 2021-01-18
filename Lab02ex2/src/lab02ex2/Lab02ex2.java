/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02ex2;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author b.nut
 */
public class Lab02ex2 {

    /**
     * @param args the command line arguments
     */
    
    static final int SCI = 0;
    static final int ROCK = 1;
    static final int PAPER = 2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int player=in.nextInt();
        String youPlay=find(player);
        System.out.println("Player   "+youPlay);
        
        String comPlay =null;
        int rand = (int)(Math.random()*3);
        comPlay=find(rand);
        System.out.println("COM   "+comPlay);
        
        if(player ==rand)
        {
            System.out.println("Draw");
        }
        else if(player==0)
        {
            if(rand==1)
            {
                System.out.println("LOSE");
                
            }
            else if(rand==2)
            {
                System.out.println("WON");
            }
        }
        else if(player ==1)
        {
            if(rand==0)
            {
                System.out.println("WON");
                
            }
            else if(rand==2)
            {
                System.out.println("LOSE");
            }
        }
        else if(player ==2)
        {
            if(rand==0)
            {
                System.out.println("LOSE");
                
            }
            else if(rand==1)
            {
                System.out.println("WON");
            }
        }
    }
    
    
    
    static String find(int a)
    {
        if(a==0)
        {
            return "scissor";
        }
        else if(a==1)
        {
            return "rock";
        }
        else{
            return "paper";
        }
    }
}
