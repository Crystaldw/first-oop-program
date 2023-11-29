import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        GeneratorFunds generatorFunds = new GeneratorFunds();
        List<PensionFund> pensionFunds = generatorFunds.generatePensionFund();
        /*
        а) Найдите фонд, где больше всего вложенцев
б) Найдите имя человека, у которого самая большая пенсия
в) Найдите людей, которые стали жертвами "не государственных фондов"
г) Найдите среднюю пенсию по фондам
д) Найдите среднюю пенсию по людям
е) Найдите наибольшую пенсию среди людей до 25
ё) Найдите самого молодого человека среди вложенцев гос. фондов
… Кому скучно - дополнять можно бесконечно
         */

//        а) Найдите фонд, где больше всего вложенцев

        PensionFund mostPopulrFund = pensionFunds.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(fund -> fund.getPersons().size()))
                .orElse(null);
        System.out.println(mostPopulrFund);

//        б) Найдите имя человека, у которого самая большая пенсия

        Worker nameOfBigestPensioner = pensionFunds.stream()
                .filter(Objects::nonNull)
                .map(fund -> fund.getPersons())
                .flatMap(workers -> workers.stream())
                .max(Comparator.comparingDouble(worker -> worker.calculatePension()))
                .orElse(null);
        System.out.println(nameOfBigestPensioner.getName());

//        в) Найдите людей, которые стали жертвами "не государственных фондов"

        List<Worker> lozers = pensionFunds.stream()
                .filter(Objects::nonNull)
                .filter(fund -> !fund.isState())
                .flatMap(fund -> fund.getPersons().stream())
                .toList();
        System.out.println(lozers.size());

//        г) Найдите среднюю пенсию по фондам
        //        д) Найдите среднюю пенсию по людям

        List<Double> pensionList = pensionFunds.stream()
                .filter(Objects::nonNull)
                .flatMap(fund -> fund.getPersons().stream())
                .map(worker -> worker.calculatePension())
                .toList();

        pensionFunds.forEach(pensionFund -> {
            System.out.println(pensionFund.getName() + " Ср. пенсия = " + pensionFund.calculateMedianPension());
        });

        System.out.printf("%.1f%n", pensionList.stream().reduce(Double::sum).get() / pensionList.size());

//        е) Найдите наибольшую пенсию среди людей до 25

        List<Double> findlargestPensionTwentyFiveYearsOfAge = pensionFunds.stream()
                .filter(Objects::nonNull)
                .flatMap(fund -> fund.getPersons().stream())
                .filter(worker -> worker.getAge() < 25)
                .map(worker -> worker.calculatePension())
                .toList();
        System.out.println(Collections.max(findlargestPensionTwentyFiveYearsOfAge));

//        ё) Найдите самого молодого человека среди вложенцев гос. фондов

        Worker junger = pensionFunds.stream()
                .filter(Objects::nonNull)
                .flatMap(fund ->fund.getPersons().stream())
                .min(Comparator.comparingInt(worker -> worker.getAge()))
                .orElse(null);
        System.out.println(junger);
    }
}