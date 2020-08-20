package be.vdab;

import java.util.*;
import java.util.stream.Collectors;

public class CountingOccurencesOfNumbers {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new CountingOccurencesOfNumbers().start();
    }

    private void start() {
        List<Integer> integers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            integers.add(number);
            if (number == 0) {
                break;
            }
        }

        Map<Integer, Long> collectMap = integers
                .stream()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        collectMap.forEach((integer, aLong) -> System.out.println(integer + " :" + aLong));



        collectMap.entrySet()
                .stream()
                .distinct()
                .forEach(integerLongEntry -> {
                    System.out.println(integerLongEntry.getKey() + " komt " + integerLongEntry.getValue() + " voor");
                });

        System.out.println("------");

        String[] names = {"john", "peter", "peter" , "Ann"};

        Map<String, Long> collect1 = Arrays.stream(names).map(String::toUpperCase).sorted(String::compareTo)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect1);
    }
}
