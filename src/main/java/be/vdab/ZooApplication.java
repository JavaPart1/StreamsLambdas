package be.vdab;

import be.vdab.domain.Bear;
import be.vdab.domain.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ZooApplication {
    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;


    public static void main(String[] args) {
        System.out.println("Opening Zoo...");
        new ZooApplication().start();
    }

    /* Start 1
    private void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }

        List<Integer> collect = numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        }).collect(Collectors.toList());


    }*/

    /* Start 2
    private void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }

        List<Integer> filteredList = numbers.stream().filter(integer -> integer < 5).collect(Collectors.toList());

        filteredList.stream().forEach(number -> System.out.println(number));

    }*/

    /* Start 3
    private void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }

        List<Integer> filteredList = numbers.stream().filter(number -> number <= 5 && number >= 1).collect(Collectors.toList());

        filteredList.stream().forEach(System.out::println);

        System.out.println("------");

        filteredList.stream().sorted().forEach(System.out::println);


        List<Bear> bears = new ArrayList<>();

        Bear bear = new Bear("Baloe");
        Bear bear1 = new Bear("Elias");
        Bear bear2 = new Bear("Timo");

        bears = Arrays.asList(bear, bear1, bear2);

        List<Person> people = bears.stream().map(bearElement -> new Person(bearElement.getName())).collect(Collectors.toList());

        people.stream().forEach(System.out::println);

        Optional<Person> person1 = people.stream().filter(person -> person.getName().equals("Elias")).findFirst();

        person1.ifPresent(person -> System.out.println(person));


    }*/


    private void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }

        List<Integer> filteredList = numbers.stream().filter(number -> number <= 5 && number >= 1).collect(Collectors.toList());

        filteredList.stream().forEach(System.out::println);

        System.out.println("---sorted---");

        filteredList.stream().sorted().forEach(System.out::println);

        System.out.println("---avg---");

        System.out.println(filteredList.stream().mapToInt(value -> value).average().getAsDouble());

        System.out.println("---Bears---");

        List<Bear> bears = new ArrayList<>();

        Bear bear = new Bear("Baloe");
        Bear bear1 = new Bear("Elias");
        Bear bearDub = new Bear("Elias");
        Bear bear2 = new Bear("Timo");

        bears = Arrays.asList(bear, bear1, bear2,bearDub);

        List<Person> people = bears.stream().map(bearElement -> new Person(bearElement.getName())).collect(Collectors.toList());

        people.stream().forEach(System.out::println);
        System.out.println("------");
        System.out.println("---- person -----");
        people.stream().forEach(Person::print);
        System.out.println("------");

        Optional<Person> person1 = people.stream().filter(person -> person.getName().equals("Elias")).findFirst();

        person1.ifPresent(person -> System.out.println(person));

        System.out.println("------");


    }



}
