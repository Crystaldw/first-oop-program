import java.util.Arrays;

public class Field {
    private Cell[][] cells;

    public Field(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean checkCell(int row, int column) {
        Cell targetCell = this.cells[row][column];
        return targetCell.isShip();
    }

    public Cell[][] getCells() {
        return this.cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public String toString() {
        return "Field{cells=" + Arrays.deepToString(this.cells) + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Field field = (Field)o;
            return Arrays.deepEquals(this.cells, field.cells);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.cells);
    }
}
