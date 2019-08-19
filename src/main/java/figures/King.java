package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends AbstractFigure {
    public King(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Kn";
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
            System.out.println("King cannot move here");
            return false;
        }
    }

    @Override
    public List<Position> generatePossibleMovements() {
        List<Position> positions = new ArrayList<>();

        for (int i = -1; i < 2; i++) {
            for (int k = -1; k < 2; k++) {
                if (getRow() + i < 0 || getRow() + i >= 8 || getCol() + k < 0 || getCol() + k >= 8) continue;
                positions.add(new Position(getRow() + i, getCol() + k));
            }
        }

        return positions;
    }
}
