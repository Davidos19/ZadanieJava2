package org.example;
import java.util.*;
import java.util.stream.*;
public class Zad3 {
    public static void main(String[] args) {
        List<String> stringi = Arrays.asList("aa", "cy", "b", "yycd", "c");

        List<String> wyniki = stringi.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());

        System.out.println("Wyniki: " + wyniki);
    }
}

