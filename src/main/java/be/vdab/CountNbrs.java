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

    }

}
