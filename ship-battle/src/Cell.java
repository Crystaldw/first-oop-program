public class Cell {
    private boolean isShip;

    public Cell(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean isShip() {
        return this.isShip;
    }

    public void setShip(boolean ship) {
        this.isShip = ship;
    }

    public String toString() {
        return "Cell{isShip=" + this.isShip + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Cell cell = (Cell)o;
            return this.isShip == cell.isShip;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.isShip ? 1 : 0;
    }
}
