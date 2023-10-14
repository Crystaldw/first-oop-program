package homework;

public class HanoiTower {
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Переместите диск 1 с " + from + " на " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Переместите диск " + n + " с " + from + " на " + to);
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3; // Количество дисков
        hanoi(n, 'A', 'C', 'B');
    }
}

