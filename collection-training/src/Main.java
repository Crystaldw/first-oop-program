import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("Привет");
        first.add("Oleksii");
        first.add(" ");

        System.out.println(first);

        String answer = first.get(1);
        System.out.println(answer);

        first.remove(0);
        first.remove(0);
        first.remove(0);
        System.out.println(first);
        //copacity = 10;
        //size = 0;

        first.add("Привет");
        first.add("Oleksii");
        first.add(" ");
        first.add(1, "Урок");
        System.out.println(first);

        first.set(1, "Уроки");
        System.out.println(first);

        System.out.println(first.contains("1"));
        System.out.println(first.contains("Oleksii"));

//        first.clear();
//        System.out.println(first);

        int index = first.indexOf("Oleksii");
        System.out.println(index);

        System.out.println(first.isEmpty());
        first.trimToSize(); //copacity

        System.out.println(first);
        System.out.println("________________________");

        ArrayList<Integer> second = new ArrayList<>();
        second.add(97);
        second.add(65);
        second.add(43);
        second.add(102);
        second.add(11);

//        second.remove(3);

        int index1 = second.indexOf(102);
        second.remove(index1);
        System.out.println(second);

        int sum = 0;
        for (Integer integer : second){
            sum += integer;
            System.out.println(sum / second.size());
        }



    }
}