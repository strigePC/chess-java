package main.java.figures;

public class Bishop extends AbstractFigure {
    public Bishop(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Bs";
    }
}
