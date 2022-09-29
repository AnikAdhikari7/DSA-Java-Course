package com.company;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number (between 1-7): ");
        int num = in.nextInt();

        switch (num) {
            case 1,2,3,4,5 -> System.out.println("It is a weekday!!");
            case 6,7 -> System.out.println("It is a weekend!!");
            default -> System.out.println("Type a valid number...");
        }
    }

    public static class Function {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int ans = sum();
            System.out.println("The sum is = " + ans);
        }

        static int sum() {
            System.out.print("Enter the first number = ");
            int num1 = in.nextInt();
            System.out.print("Enter the second number = ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;
        }



        //    static void reverse(int num1, int num2) {
    //        temp = num1;
    //        num1 = num2;
    //        num2 = temp;
    //    }
    }

    public static class Largest_1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = in.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = in.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("The largest number is " + num1);
            }
            else if (num2 > num1 && num2 > num3) {
                System.out.println("The largest number is " + num2);
            }
            else {
                System.out.println("The largest number is " + num3);
            }
        }
    }
}
