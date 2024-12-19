package org.example;
import java.util.*;
import java.util.stream.*;
public class Zad2 {

    public static void main(String[] args) {
        List<Integer> liczby = Arrays.asList(3, 10, 9, 4);

        List<Integer> wyniki = liczby.stream()
                .map(liczba -> liczba * liczba + 9)
                .filter(wynik -> !String.valueOf(wynik).contains("9"))
                .collect(Collectors.toList());

        System.out.println("Wyniki: " + wyniki);
    }
}
