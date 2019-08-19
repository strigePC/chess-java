package main.java;

import main.java.figures.*;

import java.util.List;

public class Board {
    private List<AbstractFigure> figures;
    private AbstractFigure[][] board;

    Board() {
        this.board = new AbstractFigure[8][8];
    }

    public void init() {
        for (int i = 0; i < 8; i++) {
            this.board[1][i] = new Pawn('w', 1, i);
            this.board[6][i] = new Pawn('b', 6, i);
        }
        this.board[0][0] = new Rook('w', 0, 0);
        this.board[0][1] = new Knight('w',0, 1);
        this.board[0][2] = new Bishop('w',0, 2);
        this.board[0][3] = new Queen('w', 0, 3);
        this.board[0][4] = new King('w', 0, 4);
        this.board[0][5] = new Bishop('w', 0, 5);
        this.board[0][6] = new Knight('w', 0, 6);
        this.board[0][7] = new Rook('w', 0, 7);

        this.board[7][0] = new Rook('b', 7, 0);
        this.board[7][1] = new Knight('b', 7, 1);
        this.board[7][2] = new Bishop('b', 7, 2);
        this.board[7][3] = new Queen('b', 7, 3);
        this.board[7][4] = new King('b', 7, 4);
        this.board[7][5] = new Bishop('b', 7, 5);
        this.board[7][6] = new Knight('b', 7, 6);
        this.board[7][7] = new Rook('b', 7, 7);
    }

    public void move(String src, String dst) {
        int srcRow = src.toUpperCase().charAt(0);
    }

    public AbstractFigure[][] getBoard() {
        return board;
    }

    public void setBoard(AbstractFigure[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("    A    B    C    D    E    F    G    H\n");
        for (int r = 7; r >= 0; r--) {
            result.append(r + 1).append("| ");

            for (int c = 0; c < 8; c++) {

                if (this.board[r][c] == null) result.append(" _ ");
                else result.append(this.board[r][c]);

                result.append("  ");
            }

            result.append("|").append(r + 1).append("\n");
        }
        result.append("    A    B    C    D    E    F    G    H\n");

        return result.toString();
    }
}
