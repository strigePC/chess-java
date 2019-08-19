package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractFigure {
    public Pawn(char color, int row, int col) {
        this.setColor(color);
        this.setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Pn";
    }

    @Override
    public boolean canMove(AbstractFigure[][] board, Position position) {
        List<Position> possibleMovements = generatePossibleMovements();

        if (this.getPosition() == position) {
            System.out.println("Figure cannot move to the same position");
            return false;
        } else if (possibleMovements.contains(position)) {
            if (position.getCol() != getCol()) {
                if (board[position.getRow()][position.getCol()] == null ||
                        board[position.getRow()][position.getCol()].getColor() == getColor()) {
                    System.out.println("Pawn cannot move here wow");
                    return false;
                } else
                    return true;
            } else {
                if (board[position.getRow()][position.getCol()] != null) {
                    System.out.println("This position is blocked");
                    return false;
                }
                return true;
            }
        } else {
            System.out.println("Pawn cannot move here");
            return false;
        }
    }

    private List<Position> generatePossibleMovements() {
        List<Position> positions = new ArrayList<>();
        if (isFirstMovement()) {
            if (isWhite()) {
                for (int i = getRow() + 1; i < Math.min(getRow() + 3, 8); i++) {
                    for (int k = Math.max(getCol() - 1, 0); k < Math.min(getCol() + 2, 8); k++) {
                        positions.add(new Position(i, k));
                    }
                }
            } else {
                for (int i = getRow() - 1; i >= Math.max(getRow() - 2, 0); i--) {
                    for (int k = Math.max(getCol() - 1, 0); k < Math.min(getCol() + 2, 8); k++) {
                        positions.add(new Position(i, k));
                    }
                }
            }
        } else {
            if (isWhite()) {
                for (int i = Math.max(getCol() - 1, 0); i < Math.min(getCol() + 2, 8); i++) {
                    positions.add(new Position(Math.min(getRow() + 1, 8), i));
                }
            } else {
                for (int i = Math.max(getCol() - 1, 0); i < Math.min(getCol() + 2, 8); i++) {
                    positions.add(new Position(Math.max(getRow() - 1, 0), i));
                }
            }
        }

        System.out.println(positions);
        return positions;
    }

    private boolean isFirstMovement() {
        return (getRow() == 1 && getColor() == 'w') || (getRow() == 6 && getColor() == 'b');
    }
}
