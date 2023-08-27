package person;
public class Main {

    public static void main(String[] args) {

        Person a = new Person("Alexei", 43, 185, 85, 344.4);
        Person b = new Person("Oxana", 44, 155, 50, 45);
        Person c = new Person("Diana", 18, 165, 55, 34.4);
        Person d = new Person("Ihor", 27, 175, 75, 100.45);


        a.getInfo();
        b.getInfo();
        c.getInfo();
        d.getInfo();
        a.goWork();
        d.goWork();
        c.goWork();


        double moneyAmount1 = a.getMoney();
        double moneyAmount2 = b.getMoney();
        double moneyAmount3 = c.getMoney();
        double moneyAmount4 = d.getMoney();

//        System.out.println(a.getName() + " имеет " + moneyAmount1 + " денег");
//        System.out.println(b.name + " имеет " + moneyAmount2 + " денег");
//        System.out.println(c.name + " имеет " + moneyAmount3 + " денег");
//        System.out.println(d.name + " имеет " + moneyAmount4 + " денег");


        PensionFund pensionFund = new PensionFund("Pensionka", true, "2023 yoear", 466);
        pensionFund.getNationalFund();
        pensionFund.infoFund();



        Pensioner pensioner = new Pensioner("Dmitrii", 89, 172, 94, 300,350.5);
        pensioner.die();

        Worker worker = new Worker("Olga", 41,159,50,500, 100.5,300.45);
        worker.getMinSolary();
        worker.getMaxSolary();
        worker.die();

    }
}


