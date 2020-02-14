package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ask();
    }

    public static void ask() {
        Scanner reader = new Scanner(System.in);
        System.out.println(
                          "*--------------------------------------------*\n"
                        + "*----------------Let's Start!----------------*\n"
                        + "*--------------- ____________ ---------------*\n"
                        + "*============== |  Yes / No  | ==============*\n"
                        + "*--------------- ‾‾‾‾‾‾‾‾‾‾‾‾ ---------------*");
        String start = reader.nextLine();
        if (start.equals("Yes") | start.equals("yes")) {
            System.out.println("*------------====================------------*\n" +
                               "*------------- ### - GLHF - ### -------------*");
            startGame();
        }

        if (start.equals("No") | start.equals("no")) {
            System.out.println("*------------====================------------*\n" +
                               "*------------- ### - Adios! - ### -------------*\n" +
                               "*------------====================------------*");
        } else if (!start.equals("no") | !start.equals("No") | !start.equals("Yes") | !start.equals("yes")) {
            System.out.println("*-------- ### - Can't understand - ### --------*");
            ask();
        }
    }

    public static void startGame() {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        double pc = random.nextInt(2 + 1) + 1;

        System.out.println("*------------====================------------*\n"
                         + "*----------Rock, Scissors or Paper?----------*\n" +
                           "*----------~~~~~~~~~~~~~~~~~~~~~~~~----------*");

        String usr = reader.nextLine();

        if (usr.equals("rock") | usr.equals("Rock")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*");
            }
        }

        if (usr.equals("scissors") | usr.equals("Scissors")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*");
            }
        }

        if (usr.equals("paper") | usr.equals("Paper")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*");
            }
        }

        if (usr.equals("Stop") | usr.equals("stop")) {
            System.out.println("*------------====================------------*\n" +
                    "*------------ ### - Adios! - ### ------------*\n" +
                    "*------------====================------------*");
        }


       else {
           startGame();
       }
    }
}