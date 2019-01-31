package com.company;
import java.util.Scanner;
public class Home {
    public static void main (String [] args){
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Employee number");
        int employeenumber =Keyboard.nextInt();

        System.out.println("Pay rate");
        int payrate = Keyboard.nextInt();

        System.out.println("Hours worked");
        int hoursworked = Keyboard.nextInt();
        // hi employee
        if (payrate > 25) {
            System.out.println("exceed amount");
            System.exit(0);
            // employee cant get high
        } else if (hoursworked > 60){
            System.out.println("exceed hours");
            System.exit (0);
            // employee cant get paid
        } else if (hoursworked >=35 && hoursworked  <= 60) {

            int OvertimeHours = hoursworked - 35;
            double Overtimepay = (OvertimeHours) * (payrate * 1.5);
            double Weeklopay = (Overtimepay) + (35 * payrate);

            System.out.println("Employee number" + employeenumber + "weekpa" + Weeklopay);
        } else if (hoursworked <= 35) {
                int Weeklypay = (hoursworked) * (payrate);
                System.out.println("Employee number" + employeenumber + "weekpa"+  Weeklypay);
            }
        }



    }

