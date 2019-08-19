package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Press any key to start the game:");
        String in = input.nextLine();
        board.init();

        System.out.println("Here is the chessboard: ");
        System.out.println(board);

        System.out.println("Enter movement in the following format (a2 a3):");
        in = input.nextLine();
        while (!in.equals("q\n")) {
            System.out.println(in);
            String[] positions = in.split(" ");
            board.move(positions[0], positions[1]);
            System.out.println(board);
            in = input.nextLine();
        }

    }
}
