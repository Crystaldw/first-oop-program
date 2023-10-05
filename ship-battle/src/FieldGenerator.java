import java.util.Random;

public class FieldGenerator {

    private final static int ROW = 10;
    private final static int COLUMN = 10;
    private final static int SHIP = 5;
    Random random = new Random();
    public Field generateField() {
        Cell[][] cells = new Cell[ROW][COLUMN];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                int number = random.nextInt(ROW * COLUMN);
                boolean isShip = (number < SHIP);
                cells[i][j] = new Cell(isShip);
            }
        }
        Field field = new Field(cells);
        return field;
    }
}
