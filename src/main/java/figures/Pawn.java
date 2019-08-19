package main.java.figures;

public class Pawn extends AbstractFigure {
    public Pawn(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Pn";
    }
}
