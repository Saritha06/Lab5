//Lab 5 ---Dice rolling

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Grand Circus Casino!"); // Heading

        Scanner scan = new Scanner(System.in); //creating scanner
        Random randGen = new Random(); // new random no. generator
        String doAgain;
        do {

            System.out.println("Enter the number of sides for a pair of dice?: "); // Asking user input
            int userInput = scan.nextInt(); //getting userInput

            String userAns;
            System.out.println("Ready to roll the dice?(R): "); //asking Q to user
            userAns = scan.next();
            userAns.equalsIgnoreCase("R"); // set to ignore case

            System.out.println(randGen.nextInt(userInput) + 1); // 2 n-sided dice so 2 prompt
            System.out.println(randGen.nextInt(userInput) + 1);

            System.out.println("Do you want to roll again?(y/n): ");
            doAgain = scan.next();
            //return;


        } while (doAgain.equalsIgnoreCase("y"));

    }
}
