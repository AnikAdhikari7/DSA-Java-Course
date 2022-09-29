package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type any fruit name: ");
        String fruit = in.next();

//        switch (fruit) {
//            case "Apple":
//                System.out.println("A sweet fruit!");
//                break;
//            case "Mango":
//                System.out.println("King of fruits!");
//                break;
//            case "Grapes":
//                System.out.println("Shashi's ball size fruit!");
//                break;
//            case "Orange":
//                System.out.println("Orange colour fruit!");
//                break;
//            default:
//                System.out.println("Type a valid fruit name...");
//        }

        // better way:
        switch (fruit) {
            case "Apple" -> System.out.println("A sweet fruit!");
            case "Mango" -> System.out.println("King of fruits!");
            case "Grapes" -> System.out.println("Soham's ball size fruit!");
            case "Orange" -> System.out.println("Orange colour fruit!");
            default -> System.out.println("Type a valid fruit name...");
        }


    }
}
