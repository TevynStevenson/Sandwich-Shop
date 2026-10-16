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
        if (sandwich == 1) {
            System.out.println("Price is $5.45");
        } else if (sandwich == 2) {
            System.out.println(("Price is $8.95"));
        }else{
            System.out.println("Try again");
        }

    }


        //







    }

