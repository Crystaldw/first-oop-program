import java.util.StringJoiner;

public class Cell {

    private boolean isShip;

    public Cell(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "isShip=" + isShip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return isShip == cell.isShip;
    }

    @Override
    public int hashCode() {
        return (isShip ? 1 : 0);
    }
}