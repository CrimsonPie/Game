package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;

        Scanner reader = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Камень - 1    Ножницы - 2    Бумага - 3");
            startGame(reader.nextInt());
        }
        if (i == 10) {
            finish(i);
        }
    }

    public static int points(int rez) {
        rez += 1;
        return rez;
    }

    public static int startGame(int usr) {
        int rez = points(0);

        Random random = new Random();
        double pc = random.nextInt(2 + 1) + 1;
        if (usr == 1) {
            if (pc == 1) {
                System.out.println("Камень - Ничья!");
            }

            if (pc == 2) {
                System.out.println("Ножницы - Вы выиграли!");
                rez += 1;
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
                rez += 1;
            }
        }

        if (usr == 3) {
            if (pc == 1) {
                System.out.println("Камень - Вы выиграли!");
                rez += 1;
            }

            if (pc == 2) {
                System.out.println("Ножницы - Вы проиграли!");
            }

            if (pc == 3) {
                System.out.println("Бумага - Ничья!");
            }
        }

        points(rez);
        return rez;
    }


    public static void finish(int turns) {
        int rez = 0;
        int x = startGame(rez);
        if (turns == 10) {
            System.out.println("--------------------------------------------------");
            System.out.println("-----------------Ваш результат: " + x + "-----------------");
        }
   }
}

