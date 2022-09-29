package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

//        int max = num1;
//        if (num2 > max)
//        {
//            max = num2;
//        }
//        if (num3 > max)
//        {
//            max = num3;
//        }
//
//        System.out.println("The largest number is " + max);

/*
        //another method
        int max = 0;
        if (num1 > num2){
            max = num1;
        }
        else{
            max = num2;
        }

        if (num3 > max){
            max = num3;
        }
        System.out.println("The largest number is " + max);


 */

        int max = Math.max(num3, Math.max(num1, num2));

        System.out.println("The largest number is " + max);
    }
}
