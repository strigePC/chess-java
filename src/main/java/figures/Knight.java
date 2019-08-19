package main.java.figures;

public class Knight extends AbstractFigure{
    public Knight(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Kt";
    }
}
