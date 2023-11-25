package lesson3.Homework3.Game.Hero;

public class Elf {



    private int id;
    private int id1;
    private int id2;
    private int id3;
    private int id4;
    private int id5;

//    Конструктор класса
    public Elf(int id, int id1, int id2, int id3, int id4, int id5){
        this.id = id;
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
        this.id5 = id5;
    }
//    Getter и Setter для поля id
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

//    Аналогично создается Getter, Setter для остальных полей


    public int getId1() {
        return this.id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return this.id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return this.id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getId4() {
        return this.id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }

    public int getId5() {
        return this.id5;
    }

    public void setId5(int id5) {
        this.id5 = id5;
    }

}
