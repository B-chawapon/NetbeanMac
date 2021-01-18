/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02ex3;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author b.nut
 */
public class Lab02ex3 {

    static final int SUNDAY = 1;
    static final int MON = 2;
    static final int TUES = 3;
    static final int WED = 4;
    static final int THURS = 5;
    static final int FRI = 6;
    static final int SAT = 0;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter year  ");
        int year = in.nextInt();//j k
        
        
        System.out.println("Enter Month  ");
        int month = in.nextInt();
         System.out.println("Enter day of month  ");
        int day = in.nextInt();//q

        if (month == 1) {
            month = 13;
            year -= 1;
        } else if (month==2) {
                month=14;
                year-=1;
        }

       int j= year/100;
        int k= year%100;
        
        int h =(day+((26*(month+1))/10)+k+(k/4)+(j/4)+(5*j))%7;
        String dayh=null;
        if (h == SUNDAY) {
            dayh = "Sunday";
        } else if (h == MON) {
            dayh = "Monday";
        } else if (h == TUES) {
            dayh = "Tuesday";
        } else if (h == WED) {
            dayh= "Wednesday";
        } else if (h == THURS) {
            dayh = "Thursday";
        } else if (h == FRI) {
            dayh = "Friday";
        } else if (h == SAT) {
            dayh = "Saturday";
        }
        System.out.println(dayh);
        

    }

}
