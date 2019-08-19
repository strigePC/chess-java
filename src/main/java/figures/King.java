package main.java.figures;

public class King extends AbstractFigure {
    public King(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Kn";
    }
}
