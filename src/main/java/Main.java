package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        System.out.println("   1  2  3  4  5  6  7  8");
        for (char r = 'A'; r <= 'H'; r++) {
            System.out.print(r + "| ");

            for (int c = 0; c < 8; c++) {
                System.out.print("_");
                System.out.print("  ");
            }

            System.out.println("|" + r);
        }
        System.out.println("   1  2  3  4  5  6  7  8");
    }
}
