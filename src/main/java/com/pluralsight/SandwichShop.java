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
                Regular - $5.45
                Large - $8.95""");
        // Ask user for their selection
        System.out.println("Input size");
        String name = sandwichShop.nextLine();

        // Ask user for their name
        // Import new scanner

        System.out.println("""
                How old are you?
                <=17 gets a 10% discount
                >=65 gets a 25% discount""");
        int age = sandwichShop.nextInt();

        //Inputting sandwich price


        // Set variables
        int userAge ;
        double discount = 0.0;
        double total = 0.0;
        double regularPrice = 5.45;
        double largePrice = 8.95;

        if(name.equals("Regular")){
            total = regularPrice;
        } else if (name.equals("Large")) {
            total = largePrice;
        }



    }}