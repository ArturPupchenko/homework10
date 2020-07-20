package ua.com.alevel.nix.homework10.steamutil;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task6NumberOfBirthdaysInMonthFromListOfBirthdays {

//    Дан список дней рождения сотрудников фирмы (Collection<LocalDate>). Вернуть
//    количество дней рожденья в каждом месяце (Map<Month, Integer>).

    public static void run() {
        blankspace();
        System.out.println("Задание 6");
        System.out.println("Дан список дней рождения сотрудников фирмы (Collection<LocalDate>):");
        Collection<LocalDate> birthdays = Arrays.asList(LocalDate.of(1990, 02, 06),
                LocalDate.of(1968, 11, 12), LocalDate.of(1999, 02, 27));
        birthdays.forEach(System.out::println);
        Map<Month, Integer> birthdaysEachMonth = new HashMap<>();
        birthdaysEachMonth = birthdays.stream()
                .collect(Collectors.groupingBy(LocalDate::getMonth, Collectors.summingInt(e -> 1)));
        System.out.println("Вернуть количество дней рожденья в каждом месяце (Map<Month, Integer>).");
        System.out.println("Результат:");
        birthdaysEachMonth.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}

