package main.java.figures;

public abstract class AbstractFigure {
    private char color;
    private int row;
    private int col;

    AbstractFigure() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }
}
