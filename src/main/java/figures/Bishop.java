package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends AbstractFigure {
    public Bishop(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Bs";
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
            if (position.getCol() > getCol() && position.getRow() > getRow()) {
//                Bishop moves up-right
                for (int i = 1; i < position.getCol() - getCol(); i++) {
                    if (board[getRow() + i][getCol() + i] != null) {
                        System.out.println("Bishop cannot pass through other figures");
                        return false;
                    }
                }
                return true;
            } else if (position.getCol() > getCol() && position.getRow() < getRow()) {
//                Bishop moves down-right
                for (int i = 1; i < position.getCol() - getCol(); i++) {
                    if (board[getRow() - i][getCol() + i] != null) {
                        System.out.println("Bishop cannot pass through other figures");
                        return false;
                    }
                }
                return true;
            } else if (position.getCol() < getCol() && position.getRow() < getRow()) {
//                Bishop moves down-left
                for (int i = 1; i < getCol() - position.getCol(); i++) {
                    if (board[getRow() - i][getCol() - i] != null) {
                        System.out.println("Bishop cannot pass through other figures");
                        return false;
                    }
                }
                return true;
            } else {
//                Bishop moves up-left
                for (int i = 1; i < getCol() - position.getCol(); i++) {
                    if (board[getRow() + i][getCol() - i] != null) {
                        System.out.println("Bishop cannot pass through other figures");
                        return false;
                    }
                }
                return true;
            }
        } else {
            System.out.println("Bishop cannot move here");
            return false;
        }
    }

    @Override
    public List<Position> generatePossibleMovements() {
        List<Position> positions = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            if (getRow() - i < 0 || getCol() - i < 0) break;
            positions.add(new Position(getRow() - i, getCol() - i));
        }
        for (int i = 1; i < 8; i++) {
            if (getRow() - i < 0 || getCol() + i >= 8) break;
            positions.add(new Position(getRow() - i, getCol() + i));
        }
        for (int i = 1; i < 8; i++) {
            if (getRow() + i >= 8 || getCol() - i < 0) break;
            positions.add(new Position(getRow() + i, getCol() - i));
        }
        for (int i = 1; i < 8; i++) {
            if (getRow() + i >= 8 || getCol() + i >= 8) break;
            positions.add(new Position(getRow() + i, getCol() + i));
        }

        return positions;
    }
}
