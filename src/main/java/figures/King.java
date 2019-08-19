package main.java.figures;

import main.java.Position;

public class King extends AbstractFigure {
    public King(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Kn";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        return true;
    }
}
