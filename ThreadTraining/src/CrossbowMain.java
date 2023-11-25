public class CrossbowMain {
    public static void main(String[] args) {

        Crossbow crossbow = new Crossbow(10);

        Thread fireThread = new Thread(() -> crossbow.fire());
        Thread reloadThread = new Thread(() -> crossbow.reload());

        fireThread.start();
        reloadThread.start();

    }
}
