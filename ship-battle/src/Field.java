import java.util.Arrays;

public class Field {

    private Cell[][] cells;

    public Field(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean checkCell(int row, int column) {
        Cell targetCell = cells[row][column];
        return targetCell.isShip();

    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cells=" + Arrays.deepToString(cells) +
                '}';
    }

}
