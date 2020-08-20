package be.vdab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RainFall {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Input rainfall for 12 months
        List<Integer> rainfall;
        rainfall = Arrays.asList(33,23,13,10,15,8,5,10,4,14,35,37);

        System.out.println("\nRainfall 2020");

        System.out.println("---total---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).sum());

        System.out.println("---avg---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).average().getAsDouble());

        System.out.println("---most---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).max().getAsDouble());

        System.out.println("---least---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).min().getAsDouble());

    }
}
