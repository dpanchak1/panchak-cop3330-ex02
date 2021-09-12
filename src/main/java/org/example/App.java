/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");

        String inputString = input.nextLine();
        int stringLength= inputString.length();

        System.out.printf("%s has %d characters",inputString, stringLength);
    }
}
