package be.vdab;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurenceOfLettersInAString {
    private static int count = 0;

    public static void main(String[] args) {
        String s = "dshkj gdfg gdfkgdsfhgsdf hdsflmkjhpo'zora   vjdgvd;f";

        System.out.println("\nThe occurence of each letter is : ");
        Stream.of(toCharacterArray(s.toCharArray()))
                .filter(ch->Character.isLetter(ch))
                .map(ch->Character.toUpperCase(ch))
                .collect(Collectors.groupingBy(e->e, HashMap::new,Collectors.counting()))
                .forEach((k,v)->{
                    System.out.println(k+" "+v+(++count % 10 == 0 ? "\n" : " "));
                });
    }

    public static Character[] toCharacterArray(char[] list) {
        Character[] result = new Character[list.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = list[i];

        }
        return result;
    }
}
