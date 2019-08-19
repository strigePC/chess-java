package main.java.figures;

import main.java.Position;

import java.util.List;

public abstract class AbstractFigure {
    private char color;
    private Position position;

    AbstractFigure() {
    }

    public abstract boolean canMove(AbstractFigure[][] board, Position position);

    public abstract List<Position> generatePossibleMovements();

    public int getRow() {
        return this.position.getRow();
    }

    public int getCol() {
        return this.position.getCol();
    }

    public void setRow(int row) {
        this.position.setRow(row);
    }

    public void setPosition(int row, int col) {
        this.position = new Position(row, col);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isWhite() {
        return getColor() == 'w';
    }

    public boolean isBlack() {
        return getColor() == 'b';
    }
}
