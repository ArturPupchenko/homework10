package ua.com.alevel.nix.homework10.steamutil;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task5PrimeNumbersFromSequenceOfBigInteger {

//    Сгенерировать бесконечную последовательность простых целых чисел
//    (тип числа - BigInteger). Вернуть список из n первых вероятных простых чисел
//    (точность вычисления простого числа должна быть не менее 1 - 2 -100 ).

    public static void run() {
        blankspace();
        System.out.println("Задание 5");
        System.out.println("Сгенерировать бесконечную последовательность простых целых чисел\n(тип числа - BigInteger).");
        int n = 10;
        System.out.println("Из сгенерированной последоваельности простых целых числел,\n" +
                "возвращаем список из " + n + " первых вероятных простых чисел\n" +
                "(точность вычисления простого числа должна быть не менее 1 - 2 -100 ):");
        Stream<BigInteger> bigIntegerStream = Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .filter(num -> num.isProbablePrime((int) (1 - Math.pow(2, -100))));
        List<BigInteger> resultList = bigIntegerStream.limit(n).collect(Collectors.toList());
        resultList.forEach(x -> System.out.print(x + " "));
    }
}
