package org.example;
import java.util.*;
import java.util.stream.*;
public class Zad1 {

    public static void main(String[] args) {
        List<Integer> liczby = Arrays.asList(45, 39, 17, 25, 10, 4);

        double srednia = liczby.stream()
                .filter(liczba -> !(liczba % 10 == 9 || liczba % 10 == 7))
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Średnia: " + srednia);
    }
}
