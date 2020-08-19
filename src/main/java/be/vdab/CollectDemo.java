package be.vdab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen","George", "Alan", "Stacy", "Michelle", "john"};

        int lengteSB = Stream.of(names).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                .length();
        System.out.println("\nNumber of characters for names : " + lengteSB);

        List<String> stringList =
                Stream.of(names).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println("\n " + stringList);

        stringList = Stream.of(names).collect(Collectors.toList());
        System.out.println(stringList);


    }
}
