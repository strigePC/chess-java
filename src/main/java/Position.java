package main.java;

public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public boolean equals(Object obj) {
        Position position = (Position) obj;

        return this.col == position.col && this.row == position.row;
    }

    @Override
    public String toString() {
        return "" + ((char) (col + 65)) + (row + 1);
    }
}
