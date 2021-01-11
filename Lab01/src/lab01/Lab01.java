/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author b.nut
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long birth = ((365 * 24 * 3600) / 7);
        long death = ((365 * 24 * 3600) / 13);
        long immigrant = ((365 * 24 * 3600) / 45);
        long total = (birth - death + immigrant);
        long pop = 312032486;
        /*System.out.println(+birth);
        System.out.println(death);
        System.out.println(immigrant);
        System.out.println(total);*/

        for (int i = 0; i < 5; i++) {
            pop += total;

            System.out.println(pop);
        }

    }

}
