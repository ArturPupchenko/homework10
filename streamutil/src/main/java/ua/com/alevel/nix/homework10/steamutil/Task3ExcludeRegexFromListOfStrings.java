package ua.com.alevel.nix.homework10.steamutil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task3ExcludeRegexFromListOfStrings {

//    Дан список строк. Вырезать из каждой строки участки, удовлетворяющие
//    регулярному выражению.

    public static void run() {
        blankspace();
        System.out.println("Задание 3");
        System.out.println("Дан список строк:");
        List<String> strings = Arrays.asList("accs", "faaccs", "gfrccss", "fsascsccss");
        strings.forEach(System.out::println);
        System.out.println("Вырезать из каждой строки участки, удовлетворяющие\n" +
                "регулярному выражению.");
        String regex = "ccs";
        System.out.println("Регулярное выражение - \"" + regex + "\"");
        List<String> resultStrings = strings.stream().map(x -> x.replaceAll(regex, "")).collect(Collectors.toList());
        System.out.println("Отредактированные строки:");
        resultStrings.forEach(System.out::println);
    }
}
