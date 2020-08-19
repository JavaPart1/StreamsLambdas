package be.vdab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        // Input a sentence
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        // Determines & displays unique words in alphabetic order
        // Sentence split in words
        String[] wordsInSentence = sentence.split(" ");

        Set<String> stringSet = Stream.of(wordsInSentence)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(stringSet);

    }
}
