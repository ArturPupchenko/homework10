package ua.com.alevel.nix.homework10.steamutil;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ua.com.alevel.nix.homework10.steamutil.ConsoleViewUtil.blankspace;

public class Task4ListOfPalindromWordsFromStringsOfWordsWithWhiteSpaces {

//    Дан список строк со словами, разделенными одним или более пробелами.
//    Вернуть список слов-палиндромов.

    public static void run() {
        blankspace();
        System.out.println("Задание 4");
        System.out.println("Дан список строк, разделенными одним или более пробелами");
        List<String> strings = Arrays.asList("дед  казак   отаман", "гора   потоп", "заказ    батон");
        strings.forEach(System.out::println);
        System.out.println("Список слов-палиндромов:");
        List<String> resultStrings = strings.stream()
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(s -> isPalindrome(s))
                .collect(Collectors.toList());
        resultStrings.forEach(System.out::println);
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());

    }
}

