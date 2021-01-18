/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02.day2;

import java.util.Scanner;

/**
 *
 * @author b.nut
 */
public class Lab02Day2 {

    /**
     * @param args the command line arguments
     */
    static final int SUNDAY = 0;
    static final int MON = 1;
    static final int TUES = 2;
    static final int WED = 3;
    static final int THURS = 4;
    static final int FRI = 5;
    static final int SAT = 6;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String todaych = null;
        String futurech = null;

        int first = in.nextInt();
        int second = in.nextInt();

        if (first == SUNDAY) {
            todaych = "Sunday";
        } else if (first == MON) {
            todaych = "Monday";
        } else if (first == TUES) {
            todaych = "Tuesday";
        } else if (first == WED) {
            todaych = "Wednesday";
        } else if (first == THURS) {
            todaych = "Thursday";
        } else if (first == FRI) {
            todaych = "Friday";
        } else if (first == SAT) {
            todaych = "Saturday";
        }

        int future = (first + second) % 7;

        if (future == SUNDAY) {
            futurech = "Sunday";

        } else if (future == MON) {
            futurech = "Monday";

        } else if (future == TUES) {
            futurech = "Tuesday";

        } else if (future == WED) {
            futurech = "Wednesday";

        } else if (future == THURS) {
            futurech = "Thursday";

        } else if (future == FRI) {
            futurech = "WFriday";

        } else if (future == SAT) {
            futurech = "Saturday";

        }
        System.out.println("TODAY is " + todaych + "    Future day is " + futurech);
    }

}
