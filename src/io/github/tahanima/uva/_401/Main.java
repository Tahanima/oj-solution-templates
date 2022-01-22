package io.github.tahanima.uva._401;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param words denotes a string arraylist containing the strings to evaluate
     * @return a string arraylist containing the answers
     */
    public static ArrayList<String> solve(ArrayList<String> words) {
        // Implement this method

        return new ArrayList<>();
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        ArrayList<String> answer = solve(words);

        for (String s: answer) {
            stringBuilder.append(String.format("%s%n%n", s));
        }

        System.out.print(stringBuilder);
    }
}
