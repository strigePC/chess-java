package main.java.figures;

import main.java.Position;

public class Queen extends AbstractFigure {
    public Queen(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Qn";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        return true;
    }
}
