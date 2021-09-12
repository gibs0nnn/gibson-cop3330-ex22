package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Collect Input
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();
        int largest = 0;

        //Checks if all numbers are different
        if(first != second && second != third && third != first) {

            //Algorithm for finding largest integer
            if(first > second) {
                if(first > third) {
                    largest = first;
                } else if(third > second) {
                    largest = third;
                }
            } else if(second > third) {
                largest = second;
            } else {
                largest = third;
            }

            //Output if all numbers different
            System.out.println("The largest number is " + largest + ".");
        } else {
            System.out.println("Not all numbers were different");
            System.exit(0);
        }
    }
}
