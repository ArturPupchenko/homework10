package ua.com.alevel.nix.homework10.steamutil;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task7FromIntArrayGetEvenAndOddSortedInReverseOrder {

//    Дан массив целых чисел. Разбить его на четные и нечетные,
//    отсортировать и те, и другие по убыванию.

    public static void run() {
        blankspace();
        System.out.println("Задание 7");
        System.out.println("Дан массив целых чисел:");
        int length = 10;
        int[] ints = IntStream.generate(() -> (int) (Math.random() * 10)).limit(length).toArray();
        Arrays.stream(ints).forEach(x -> System.out.print(x + " "));
        System.out.println("\nРазбить его на четные и нечетные,\n" +
                "отсортировать и те, и другие по убыванию.");
        System.out.println("Результат:");
        int[] sortedEven = Arrays.stream(ints).filter(x -> x % 2 == 0)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int[] sortedOdd = Arrays.stream(ints).filter(x -> x % 2 == 1)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Отсортированный по убыванию массив четных чисел:");
        Arrays.stream(sortedEven).forEach(x -> System.out.print(x + " "));
        System.out.println("\nОтсортированный по убыванию массив нечетных чисел:");
        Arrays.stream(sortedOdd).forEach(x -> System.out.print(x + " "));
    }
}
