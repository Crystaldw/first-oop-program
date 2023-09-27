package somewhere;

import car.Cabriollet;

import java.util.*;

public class MapMain {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 5);
        map.put("Sidorov", 2);
        map.put("Petrov", 3);
        map.put("Eldjun", 5);
        map.put("Ivanov", 2);


        // Балансировка

        map.remove("Eldjun");

//        System.out.println(map.get("Petrov"));
//        System.out.println(map);
//        System.out.println(map.containsKey("Sidorov"));
//        System.out.println(map.containsKey("Sidor"));
//
//        System.out.println(map.containsValue(5));



        Cabriollet cabriolet = new Cabriollet(3, "byd", "red", 0, false);
//        Cabriollet cabriolet2 = new Cabriollet(3, "byd", "red", 0, false);

//        System.out.println(cabriolet.equals(cabriolet2));

        Set<Cabriollet> set = new HashSet<>();

        set.add(cabriolet); //добавилась
//        set.add(cabriolet2); // не добавилась

        System.out.println(set.contains(cabriolet)); //equals true

        cabriolet.setCurrentSpeed(10);

        System.out.println(set);

        System.out.println(set.contains(cabriolet)); //equals false

        String str = "A";
        String str1 = str.toLowerCase();

        Set<String> strings = new HashSet<>();
        strings.add(str);
        str.toLowerCase();
        strings.add(str);
        System.out.println(strings);

        Map<Cabriollet, String> cabriolletStringMap = new HashMap<>();
        cabriolletStringMap.put(cabriolet, "300_000");
        cabriolet.setCurrentSpeed(100);
        System.out.println(cabriolletStringMap.get(cabriolet));


    }
}
