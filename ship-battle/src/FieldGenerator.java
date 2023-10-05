import java.util.Random;

public class FieldGenerator {
    private static final int ROW = 10;
    private static final int COLUMN = 10;
    private static final int SHIP = 5;
    Random random = new Random();

    public FieldGenerator() {
    }

    public Field generateField() {
        Cell[][] cells = new Cell[10][10];

        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                int number = this.random.nextInt(100);
                boolean isShip = number < 5;
                cells[i][j] = new Cell(isShip);
            }
        }

        Field field = new Field(cells);
        return field;
    }
}
