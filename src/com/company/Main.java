package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Камень - 1    Ножницы - 2    Бумага - 3");
            startGame(reader.nextInt());
        }
    }

    public static void startGame(int usr) {
            Random random = new Random();
            double pc = random.nextInt(2 + 1) + 1;
            if (usr == 1) {
                if (pc == 1) {
                    System.out.println("Камень - Ничья!");
                }

                if (pc == 2) {
                    System.out.println("Ножницы - Вы выиграли!");
                }

                if (pc == 3) {
                    System.out.println("Бумага - Вы проиграли!");
                }
            }

            if (usr == 2) {
                if (pc == 1) {
                    System.out.println("Камень - Вы проиграли!");
                }

                if (pc == 2) {
                    System.out.println("Ножницы - Ничья!");
                }

                if (pc == 3) {
                    System.out.println("Бумага - Вы выиграли!");
                }
            }

            if (usr == 3) {
                if (pc == 1) {
                    System.out.println("Камень - Вы выиграли!");
                }

                if (pc == 2) {
                    System.out.println("Ножницы - Вы проиграли!");
                }

                if (pc == 3) {
                    System.out.println("Бумага - Ничья!");
                }
            }
        }
    }
