package main.java.figures;

import main.java.Position;

public class Bishop extends AbstractFigure {
    public Bishop(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Bs";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        return true;
    }
}
