package testStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bingos = new ArrayList<>(75);
        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = 1; i < (start + 15); i++) {
                bingos.add("" + c + i);
            }
            start += 15;
        }
        Collections.shuffle(bingos);
        List<String> first15Elements = bingos.subList(1, 15);

        System.out.println(first15Elements);
        System.out.println("------------------------------");
        first15Elements.stream().limit(15).filter(e -> e.startsWith("G") || e.startsWith("O"))
                .map(e -> e.charAt(0) + "-" + e.substring(1)).forEach(e -> System.out.print(e + " "));
        System.out.println("\n----------------------------");
        System.out.println(first15Elements);
    }
}