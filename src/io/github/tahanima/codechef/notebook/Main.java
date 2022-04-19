package io.github.tahanima.codechef.notebook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes kgs of pulps
     * @return an integer arraylist containing the answers
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> n) {
        // Implement this method

        return new ArrayList<>();
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        ArrayList<Integer> n = new ArrayList<>();

        while (cases-- > 0) {
            n.add(scanner.nextInt());
        }

        ArrayList<Integer> answers = solve(n);

        for (int answer: answers) {
            stringBuilder.append(String.format("%d%n", answer));
        }

        System.out.print(stringBuilder);
    }
}
