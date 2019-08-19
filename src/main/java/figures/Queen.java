package main.java.figures;

public class Queen extends AbstractFigure {
    public Queen(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Qn";
    }
}
