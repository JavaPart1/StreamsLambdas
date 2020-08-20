package be.vdab;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AnalyzeNumbersUsingStreams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nAnalyze Numbers Using Streams");
        System.out.print("\nEnter the number of items ? ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }

        double average = DoubleStream.of(numbers).average().getAsDouble();
        System.out.println("Average : "+ average);
        System.out.println("Number of elements above average: "
                + DoubleStream.of(numbers).filter(e->e>average).count());

    }
}
