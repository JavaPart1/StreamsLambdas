package be.vdab;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen","George", "Alan", "Stacy", "Michelle", "john"};

        Stream.of(names).limit(4).sorted().forEach(System.out::println);
        System.out.println("--------");

        Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(System.out::println);
        System.out.println("--------");

        String srName = Stream.of(names).
                filter(e -> e.length() > 4).
                max((e1,e2) -> e1.compareTo(e2)).get();
        System.out.println(srName);
        System.out.println("--------");

        boolean stacy = Stream.of(names).
                filter(e -> e.length() > 4).
                anyMatch(e -> e.equals("Stacy"));
        System.out.println(stacy);
        System.out.println("--------");

        boolean capital = Stream.of(names)
                .allMatch(e -> Character.isUpperCase(e.charAt(0)));
        System.out.println(capital);
        System.out.println("--------");

        boolean startko = Stream.of(names)
                .noneMatch(e -> e.startsWith("SU"));
        System.out.println(startko);
        System.out.println("--------");

        Object[] namesInLC = Stream.of(names).map(e -> e.toLowerCase()).toArray();
        Arrays.stream(namesInLC).sorted().forEach(System.out::println);

    }
}
