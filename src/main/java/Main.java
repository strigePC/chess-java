package main.java;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.init();
        System.out.println(board);

        board.move("A2", "A3");
    }
}
