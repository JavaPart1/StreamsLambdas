package be.vdab;

import be.vdab.domain.Bear;
import be.vdab.domain.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CountNbrs {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Opening ...");
        new CountNbrs().start();

    }

    private void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int inputNbr = 0;

        System.out.println("\nEnter numbers (to stop enter 0) :");

        do {
            inputNbr = scanner.nextInt();
            numbers.add(inputNbr);

        } while (inputNbr != 0);

        for (int i: numbers) {
            Collections.frequency(numbers,i);

        }

        numbers.stream().forEach(i -> System.out.println(Collections.frequency(numbers,i)));

        /*
        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        collect.forEach((integer, aLong) -> System.out.println(integer + " :" + aLong));

        collect.entrySet().stream().distinct().forEach(System.out::println);

        collect.entrySet().stream().distinct().forEach(integerLongEntry -> System.out.println(integerLongEntry.getKey() +" komt " + integerLongEntry.getValue() + " voor"));


         */
        /*
        numbers.stream().mapToInt(value -> value)



                List<Integer> filteredList = numbers.stream().filter(number -> number <= 5 && number >= 1).collect(Collectors.toList());

        filteredList.stream().forEach(System.out::println);

        System.out.println("---sorted---");

        filteredList.stream().sorted().forEach(System.out::println);

        System.out.println("---avg---");

        System.out.println(filteredList.stream().mapToInt(value -> value).average().getAsDouble());

         */


    }

}
