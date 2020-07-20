package ua.com.alevel.nix.homework10.steamutil;


import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.DoubleSummaryStatistics;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task1MinMaxSumOfDoubleArray {

//    Дан массив double[]. Найти максимальное число, минимальное число, среднее
//    арифметическое и сумму. (рекомендация - создайте только один стрим для
//    решения задачи)

    public static void run() {
        blankspace();
        System.out.println("Задание 1");
        System.out.println("Дан массив double[]:");
        double[] array = {0.0, 5.0, 10.0, 15.0, 20.0};
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Найти максимальное число, минимальное число, среднее\n" + "арифметическое и сумму.");
        DoubleStream stream = DoubleStream.of(array);
        DoubleSummaryStatistics doubleSummaryStatistics = stream.summaryStatistics();
        System.out.println("Минимальный элемент " + doubleSummaryStatistics.getMin());
        System.out.println("Максимальный элемент " + doubleSummaryStatistics.getMax());
        System.out.println("Среднее арифметическое " + doubleSummaryStatistics.getAverage());
        System.out.println("Сумма элементов " + doubleSummaryStatistics.getSum());
    }
}
