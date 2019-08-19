package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class Knight extends AbstractFigure {
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
        List<Position> possibleMovements = generatePossibleMovements();
        if (this.getPosition() == position) {
            System.out.println("Figure cannot move to the same position");
            return false;
        } else if (board[position.getRow()][position.getCol()] != null &&
                board[position.getRow()][position.getCol()].getColor() == getColor()) {
            System.out.println("This position is already taken by your other figure");
            return false;
        } else if (possibleMovements.contains(position)) {
            return true;
        } else {
            System.out.println("Knight cannot move here");
            return false;
        }
    }

    @Override
    public List<Position> generatePossibleMovements() {
        List<Position> positions = new ArrayList<>();

        if (getRow() - 2 > 0 && getCol() - 1 > 0) positions.add(new Position(getRow() - 2, getCol() - 1));
        if (getRow() - 2 > 0 && getCol() + 1 > 0) positions.add(new Position(getRow() - 2, getCol() + 1));
        if (getRow() - 1 > 0 && getCol() + 2 > 0) positions.add(new Position(getRow() - 1, getCol() + 2));
        if (getRow() - 1 > 0 && getCol() - 2 > 0) positions.add(new Position(getRow() - 1, getCol() - 2));
        if (getRow() + 1 > 0 && getCol() - 2 > 0) positions.add(new Position(getRow() + 1, getCol() - 2));
        if (getRow() + 1 > 0 && getCol() + 2 > 0) positions.add(new Position(getRow() + 1, getCol() + 2));
        if (getRow() + 2 > 0 && getCol() - 1 > 0) positions.add(new Position(getRow() + 2, getCol() - 1));
        if (getRow() + 2 > 0 && getCol() + 1 > 0) positions.add(new Position(getRow() + 2, getCol() + 1));

        return positions;
    }
}
