package somewhere;

import car.Cabriollet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {

        Cabriollet firstCabriolet = new Cabriollet(1, "bmw", "red", 0, false);
        Cabriollet secondCabriolet = new Cabriollet(2, "volvo", "red", 0, false);
        Cabriollet thirdCabriolet = new Cabriollet(3, "audi", "red", 0, false);
        Cabriollet cabriollet = new Cabriollet(4, "byd", "red", 0, false);

        Set<Cabriollet> myOwnCabriolets = new TreeSet<>();
        myOwnCabriolets.add(firstCabriolet);
        myOwnCabriolets.add(secondCabriolet);
        myOwnCabriolets.add(thirdCabriolet);
        myOwnCabriolets.add(cabriollet);


        System.out.println(myOwnCabriolets);

        Set<Integer> numberrs =new TreeSet<>();
        numberrs.add(1);
        numberrs.add(10_000);
        numberrs.add(500_000_000);
        numberrs.add(0);

        System.out.println(numberrs);

        //TreeSet

    }
}
