package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;

        System.out.println("==================== CHESS ON JAVA =====================");
        System.out.println("| Hello! This is a console game of chess for 2 players |");
        System.out.println("| that is written on Java. In order to play, you have  |");
        System.out.println("| to type different commands. Let's start by typing    |");
        System.out.println("| 'start' command. If you wanna quit, just type 'exit' |");
        System.out.println("| command any time you want                            |");
        System.out.println("========================================================");

        in = input.nextLine();
        while (!in.equals("start") && !in.equals("exit")) {
            in = input.nextLine();
        }

        if (in.equals("exit")) {
            System.out.println("Good bye! See you later!");
            return;
        }

        System.out.println("Good! Let's start then!");
        Game game = new Game();

        System.out.println(game.getBoard());
        System.out.println("Here is the chessboard. Each player has to type commands in the following format: ");
        System.out.println("a2 a3");

        in = input.nextLine();
        while (!in.equals("quit")) {
            System.out.println(in);
            String[] positions = in.split(" ");

            if (positions.length < 2) {
                System.out.println("Enter the command in the following format: a2 a3");
                in = input.nextLine();
                continue;
            }
            game.move(positions[0], positions[1]);

            System.out.println(game.getBoard());
            if (game.isOver()) {
                System.out.println("Game is over!");
                break;
            }
            in = input.nextLine();
        }

    }
}
