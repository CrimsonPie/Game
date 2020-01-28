package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String start = reader.nextLine();
        System.out.println("----------------------------------------------\n"
                + "----------Welcome to the club, dude!----------\n"
                + "----------------------------------------------\n"
                + "-----------------Let's Start!-----------------\n"
                + "---------------- ____________ ----------------\n"
                + "=============== |  Yes / No  | ===============\n"
                + "---------------- ‾‾‾‾‾‾‾‾‾‾‾‾ ----------------");
        if (start.equals("Yes") | start.equals("yes")) {
            System.out.println("-------------====================-------------\n" +
                    "-------------- ### - GLHF - ### --------------\n" +
                    "-------------====================-------------");
            startGame();
        }

    }

    public static void startGame() {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        double pc = random.nextInt(2 + 1) + 1;
        String usr = reader.nextLine();

        if (usr.equals("rock") | usr.equals("Rock")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*\n" +
                        "*--------------------------------------------*");
            }
        }

        if (usr.equals("scissors") | usr.equals("Scissors")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*\n" +
                        "*--------------------------------------------*");

            }
        }

        if (usr.equals("paper") | usr.equals("Paper")) {
            if (pc == 1) {
                System.out.println("*-------------PC chose the Rock--------------*\n" +
                        "*------------- ~~~ YOU WON! ~~~ -------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 2) {
                System.out.println("*-----------PC chose the Scissors------------*\n" +
                        "*------------ ~~~ YOU LOST! ~~~ -------------*\n" +
                        "*--------------------------------------------*");
            }

            if (pc == 3) {
                System.out.println("*-------------PC chose the Paper-------------*\n" +
                        "*-------------- ~~~ DRAW! ~~~ ---------------*\n" +
                        "*--------------------------------------------*");
            }
        }

    }
}



