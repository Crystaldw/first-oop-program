package hwJAVA.hwHuman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();

//первый вариант решения
//        List<Human> fathers = list.stream()
//                .map(Human::getFather)
//                .toList();
//        List<Human> mothers = list.stream()
//                .map(Human::getMother)
//                .toList();
//
//        fathers.addAll(mothers);
//        List<Human> allParents = fathers;
//        allParents = allParents.stream()
//                .filter(Objects::nonNull)
//                .toList();

//второй вариант решения

//         List<Human>result = list.stream()
//                .filter(Objects::nonNull)
//                .flatMap(human -> Stream.of(human.getFather(), human.getMother()))
//                .filter(Objects::nonNull)
//                .toList();
//третий метод решения

        List<Human> result = list.stream()
                .filter(Objects::nonNull)
                .map(Human::getParents)
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .toList();


        List<String> secondResult = list.stream()
                .filter(Objects::nonNull)
                .filter(human -> human.getAge() > 25)
                .map(Human::getMother)
                .filter(Objects::nonNull)
                .map(Human::getName)
                .toList();

    }
}