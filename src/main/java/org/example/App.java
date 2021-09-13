/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print( "What is the password? " );
        String Password = scan.nextLine();

        // If statement for if Password equals the password
        if (Password.equals("abc$123"))
        {
            System.out.print( "Welcome!");
        }

        // Else print
        else
        {
            System.out.print( "I don't know you.");
        }
    }
}
