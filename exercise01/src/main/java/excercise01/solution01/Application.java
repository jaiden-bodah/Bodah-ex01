/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package excercise01.solution01;

/*Create a program that prompts for your name and prints a greeting using your name.*/

import java.util.Scanner;

public class Application {
    /*
    create a program that reads in an input
    store the input
    then use that input as part of a generated statement
     */
    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String Name;

        Name = myObj.nextLine();
        System.out.println("Hello, nice to meet you " + Name);
    }
}
