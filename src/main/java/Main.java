package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board board = new Board();

        String in;
        board.init();

        System.out.println("Here is the chessboard: ");
        System.out.println(board);

        System.out.println("Enter movement in the following format (a2 a3):");
        in = input.nextLine();
        while (!in.equals("q")) {
            System.out.println(in);
            String[] positions = in.split(" ");
            board.move(positions[0], positions[1]);
            System.out.println(board);
            in = input.nextLine();
        }

    }
}
