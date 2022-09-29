package com.company;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println("The sum is = " + ans);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number = ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
