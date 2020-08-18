package be.vdab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LowerCaseLambda {
    public static void main(String[] args) {
        String sentence = "The lazy Cat runs after the lazy Fox";
        List<Character> sentLC = new ArrayList<>();
        String sentUC;

        String text = "SUPERCALIFR AGILISTicEXPIALIDOCIOUS";
        System.out.println(text
                .chars()// geeft een stream vn characters
                .filter(Character::isLowerCase) // filtert en geeft terug een stream
                .count() // telt het aantal in de stream
        );

        final long count = sentence.chars().filter(Character::isLowerCase).count();
        System.out.println(count);


    }
}

