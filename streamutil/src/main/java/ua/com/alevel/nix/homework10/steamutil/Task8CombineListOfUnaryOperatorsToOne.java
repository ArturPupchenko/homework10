package ua.com.alevel.nix.homework10.steamutil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task8CombineListOfUnaryOperatorsToOne {

//    Дан список унарных операторов UnaryOperator<T>. Объединить их в один
//    унарный оператор, который применяет их все.

    public static void run() {
        blankspace();
        System.out.println("Задание 8");
        System.out.println("Дан список унарных операторов UnaryOperator<Integer>");
        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(x -> x * x);
        unaryOperators.add(x -> x + 10);
        unaryOperators.add(x -> x - 7);
        System.out.println("x -> x * x");
        System.out.println("x -> x + 10");
        System.out.println("x -> x - 7");
        System.out.println("Объединить их в один унарный оператор, который применяет их все.");
        UnaryOperator<Integer> combinedUnaryOperator = unaryOperators.stream()
                .reduce(x -> x, (a, b) -> x -> b.apply(a.apply(x)));
        System.out.println("Результат для 2:" + "\n" + combinedUnaryOperator.apply(2));
    }
}
