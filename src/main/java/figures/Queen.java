package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class Queen extends AbstractFigure {
    public Queen(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Qn";
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
            if (getRow() == position.getRow()) {
//                Queen moves along horizontal axis
                if (getCol() < position.getCol()) {
//                    Rook moves to the right
                    for (int i = getCol() + 1; i < position.getCol(); i++) {
                        if (board[getRow()][i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else {
//                    Queen moves to the left
                    for (int i = getCol() - 1; i > position.getCol(); i--) {
                        if (board[getRow()][i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                }
            } else if (getCol() == position.getCol()) {
//                Queen moves along vertical axis
                if (getRow() < position.getRow()) {
//                    Queen moves upwards
                    for (int i = getRow() + 1; i < position.getRow(); i++) {
                        if (board[i][getCol()] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else {
//                    Queen moves downwards
                    for (int i = getRow() - 1; i > position.getRow(); i--) {
                        if (board[i][getCol()] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                }
            } else {
                if (position.getCol() > getCol() && position.getRow() > getRow()) {
//                Queen moves up-right
                    for (int i = 1; i < position.getCol() - getCol(); i++) {
                        if (board[getRow() + i][getCol() + i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else if (position.getCol() > getCol() && position.getRow() < getRow()) {
//                Queen moves down-right
                    for (int i = 1; i < position.getCol() - getCol(); i++) {
                        if (board[getRow() - i][getCol() + i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else if (position.getCol() < getCol() && position.getRow() < getRow()) {
//                Queen moves down-left
                    for (int i = 1; i < getCol() - position.getCol(); i++) {
                        if (board[getRow() - i][getCol() - i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else {
//                Queen moves up-left
                    for (int i = 1; i < getCol() - position.getCol(); i++) {
                        if (board[getRow() + i][getCol() - i] != null) {
                            System.out.println("Queen cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                }
            }
        } else {
            System.out.println("Queen cannot move here");
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
        for (int i = 0; i < 8; i++) positions.add(new Position(getRow(), i));
        for (int i = 0; i < 8; i++) positions.add(new Position(i, getCol()));

        return positions;
    }
}
