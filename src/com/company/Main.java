package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        else {
            System.out.println("*------------====================------------*\n" +
                    "*------------- ### - Adios! - ### -------------*\n" +
                    "*------------====================------------*");
        }

    }

    public static void startGame() {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        double pc = random.nextInt(2 + 1) + 1;

        System.out.println("*------------====================------------*\n"
                         + "*----------Rock, Scissors or Paper?----------*\n" +
                           "*----------~~~~~~~~~~~~~~~~~~~~~~~~----------*\n");
        String usr = reader.nextLine();
        boolean game;

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
            game = true;
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
            game = true;
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
            game = true;
        }

        if (!usr.equals("rock") | !usr.equals("Rock") | !usr.equals("scissors") | !usr.equals("Scissors") | !usr.equals("paper") | !usr.equals("Paper")) {
            startGame();
        }

        if (game = true) {
            System.out.print("*---------Do you want to play again?---------*\n"
                           + "*--------------- ____________ ---------------*\n"
                           + "*============== |  Yes / No  | ==============*\n"
                           + "*--------------- ‾‾‾‾‾‾‾‾‾‾‾‾ ---------------*\n");
            String again = reader.nextLine();
            if (again.equals("yes") | again.equals("Yes")) {
                startGame();
            }
            else {
                System.out.println("*------------====================------------*\n" +
                                   "*------------ ### - Adios! - ### ------------*\n" +
                                   "*------------====================------------*");
            }
        }
    }
}