package io.github.tahanima.uva._12250;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param words denotes a string arraylist containing the words to evaluate
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
            String word = scanner.next();

            if (word.equals("#")) {
                break;
            }

            words.add(word);
        }

        ArrayList<String> answer = solve(words);
        int cases = 1;

        for (String language: answer) {
            stringBuilder.append(String.format(
                    "Case %d: %s%n",
                    cases++, language));
        }

        System.out.print(stringBuilder);
    }
}
