package main.java.figures;

import main.java.Position;

import java.util.ArrayList;
import java.util.List;

public class Rook extends AbstractFigure {
    public Rook(char color, int row, int col) {
        setColor(color);
        setPosition(row, col);
    }

    @Override
    public String toString() {
        return getColor() + "Rk";
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
//                Rook moves along horizontal axis
                if (getCol() < position.getCol()) {
//                    Rook moves to the right
                    for (int i = getCol() + 1; i < position.getCol(); i++) {
                        if (board[getRow()][i] != null) {
                            System.out.println("Rook cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else {
//                    Rook moves to the left
                    for (int i = getCol() - 1; i > position.getCol(); i--) {
                        if (board[getRow()][i] != null) {
                            System.out.println("Rook cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                }
            } else {
//                Rook moves along vertical axis
                if (getRow() < position.getRow()) {
//                    Rook moves upwards
                    for (int i = getRow() + 1; i < position.getRow(); i++) {
                        if (board[i][getCol()] != null) {
                            System.out.println("Rook cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                } else {
//                    Rook moves downwards
                    for (int i = getRow() - 1; i > position.getRow(); i--) {
                        if (board[i][getCol()] != null) {
                            System.out.println("Rook cannot pass through other figures");
                            return false;
                        }
                    }
                    return true;
                }
            }
        } else {
            System.out.println("Rook cannot move here");
            return false;
        }
    }

    private List<Position> generatePossibleMovements() {
        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < 8; i++) positions.add(new Position(getRow(), i));
        for (int i = 0; i < 8; i++) positions.add(new Position(i, getCol()));

        return positions;
    }
}
