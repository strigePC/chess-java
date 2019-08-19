package main.java.figures;

public class Rook extends AbstractFigure {
    public Rook(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Rk";
    }
}
