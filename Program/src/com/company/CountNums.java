package com.company;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Which number you want to count: ");
        int counted = in.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == counted) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
