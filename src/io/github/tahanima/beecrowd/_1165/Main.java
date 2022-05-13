package io.github.tahanima.beecrowd._1165;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param numbers denotes the input numbers
     * @return a string arraylist containing the answer
     */
    public static ArrayList<String> solve(ArrayList<Integer> numbers) {
        // Implement this method

        return new ArrayList<>();
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();

        while (n-- > 0) {
            numbers.add(scanner.nextInt());
        }

        ArrayList<String> answers = solve(numbers);
        StringBuilder stringBuilder = new StringBuilder();

        for (String answer: answers) {
            stringBuilder.append(String.format("%s\n", answer));
        }

        System.out.print(stringBuilder);
    }
}
