package main.java.figures;

import main.java.Position;

public class Rook extends AbstractFigure {
    public Rook(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Rk";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        return true;
    }
}
