package be.vdab;

import java.util.ArrayList;
import java.util.Scanner;

public class RainFall {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Input rainfall for 12 months
        ArrayList<Double> rainfall = new ArrayList<Double>();
        rainfall.add((double) 33);
        rainfall.add((double) 23);
        rainfall.add((double) 13);
        rainfall.add((double) 10);
        rainfall.add((double) 15);
        rainfall.add((double) 8);
        rainfall.add((double) 5);
        rainfall.add((double) 10);
        rainfall.add((double) 4);
        rainfall.add((double) 14);
        rainfall.add((double) 35);
        rainfall.add((double) 37);


        System.out.println("---avg---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).average().getAsDouble());

        System.out.println("---most---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).max().getAsDouble());

        System.out.println("---least---");
        System.out.println(rainfall.stream().mapToDouble(value -> value).min().getAsDouble());

    }
}
