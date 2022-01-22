package io.github.tahanima.uva._1124;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param equations denotes a string arraylist containing equations
     * @return a string arraylist containing the answers
     */
    public static ArrayList<String> solve(ArrayList<String> equations) {
        // Implement this method

        return new ArrayList<>();
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> equations = new ArrayList<>();

        while (scanner.hasNextLine()) {
            equations.add(scanner.nextLine());
        }

        ArrayList<String> answers = solve(equations);

        for (String answer: answers) {
            stringBuilder.append(String.format("%s%n", answer));
        }

        System.out.print(stringBuilder);
    }
}
