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

        // Ask user for their name
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

        if(size == 1){
            total = regularPrice;
        } else if (size == 2) {
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