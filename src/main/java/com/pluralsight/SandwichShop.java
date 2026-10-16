package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //Import scanner
        //Assign scanner

        Scanner sandwichShop = new Scanner(System.in);

        //Set value for Int1 = Sandwich 1 Int2 = Sandwich 2
        char regular = '1';
        char large = '2';

        // Get user to input size for their sandwich
        System.out.println("Which size sandwich would you like");
        int sandwich = sandwichShop.nextInt();

        //Add if statement
        double price = 5.45;
        double price2 = 8.95;

        if (sandwich == 1) {
            price = 5.45;
            System.out.printf("Price is $%.2f\n", price);
        } else if (sandwich == 2) {
            price2 = 8.95;
            System.out.printf(("Price is $%.2f\n" ), price2);
        }else{
            System.out.println("Try again");

        }

        // import new scanner
        // Ask the customer for their age
        System.out.println("How old are you?");
        int age = sandwichShop.nextInt();


    }


        //







    }

