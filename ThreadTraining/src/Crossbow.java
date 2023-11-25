public class Crossbow {
    private int amo;
    public Crossbow(int amo){
        this.amo = amo;
    }

    public synchronized void  fire() {
        while (amo > 0) {
            amo--;
            System.out.println("Выстрел. Болтов осталось = " + amo);
        }
        try {
            this.wait();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        };
        System.out.println("Дождался перезарядки");
    }
    public synchronized void reload(){
        System.out.println("Перезарядка");
        amo = 10;
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        this.notify();
    }
}
