package ua.com.alevel.nix.homework10.steamutil;

import java.time.Year;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;


public class Task2SortedListOfLeapYearsFromCollectionOfYears {

    //    Дана коллекция лет (java.time.Year). Вернуть високосные годы в виде списка,
    //    отсортированного по возрастанию.

    public static void run() {
        blankspace();
        System.out.println("Задание 2");
        Collection<Year> years = Arrays.asList(Year.of(1554), Year.of(1677), Year.of(1966), Year.of(1984), Year.of(2000), Year.of(2020));
        System.out.println("Дана коллекция лет (java.time.Year):");
        years.forEach(x -> System.out.println(x.getValue()));
        List<Year> resultList = years.stream()
                .distinct()
                .filter(Year::isLeap)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Вернуть високосные годы в виде списка,\n" +
                "отсортированного по возрастанию.");
        System.out.println("Результат:");
        resultList.forEach(x -> System.out.println(x.getValue()));
    }
}
