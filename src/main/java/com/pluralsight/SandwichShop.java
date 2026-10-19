package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner sandwichShop = new Scanner(System.in);

        // Ask user for their name
        // Set prices
        // regular = 5.45;
        // large = 8.95;


        System.out.println("""
                What size sandwich?
                1 - $5.45
                2 - $8.95""");
        // Ask user for their selection
        System.out.println("Input size");
        int size = sandwichShop.nextInt();
        sandwichShop.nextLine();

        //Ask user if they would like their sandwich loaded
        //Import new scanner

        System.out.println("""
                Would you like your sandwich loaded?If so there is additional cost of $1.00
                Yes
                No""");
        String choice = sandwichShop.nextLine();


        // Ask user for their age
        // Import new scanner

        System.out.println("""
                How old are you?
                <=17 gets a 10% discount
                >=65 gets a 25% discount""");
        int age = sandwichShop.nextInt();

        //Inputting sandwich price
        // Set variables


        double discount = 0.0;
        double total = 0.0;
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double regularPrice1 = 6.45;
        double largePrice1 = 9.95;

        if(size == 1 && choice.equals("Yes")){
            total = regularPrice1;
        } else if (size == 1 && choice.equals("No")){
            total = regularPrice;
        }
             else if (size == 2 && choice.equals("Yes")) {
            total = largePrice1;
        }
                if (size == 2 && choice.equals("No")){
                    total = largePrice;
                }

        //Calculate total
        if(age <= 17){
            discount = .10;
        }else if (age >= 65){
            discount = .25;
        }

        //Total
        total = total - (total * discount);
        System.out.printf("Total: $%.2f%n", total);





    }}