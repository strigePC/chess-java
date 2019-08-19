package main.java.figures;

import main.java.Position;

public class Knight extends AbstractFigure{
    public Knight(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Kt";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        return true;
    }
}
