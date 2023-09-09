import java.util.Random;

public class FieldGenerator {

    public Field generateField() {
        Random random = new Random();

        Cell[][] cells = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int number = random.nextInt(100); //0-99
                boolean isShip = (number < 5);// true, если будет значение от 0 до 9
                cells[i][j] = new Cell(isShip);
            }
        }
        Field field = new Field(cells);

        return field;
    }

}
