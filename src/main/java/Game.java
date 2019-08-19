package main.java;

public class Game {
    private char turn;
    private Board board;
    private boolean isOver;

    public Game() {
        this.board = new Board();
        this.board.init();
        this.turn = 'w';
    }

    public void move(String src, String dst) {
        if (this.board.move(src, dst, this.turn)) {
            if (this.turn == 'b') this.turn = 'w';
            else this.turn = 'b';

            this.isOver = this.board.isOver();
        }
    }

    public char getTurn() {
        return turn;
    }

    public void setTurn(char turn) {
        this.turn = turn;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }
}
