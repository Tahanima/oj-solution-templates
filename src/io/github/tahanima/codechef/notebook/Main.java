package io.github.tahanima.codechef.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes kgs of pulps
     * @return an integer list containing the answers
     */
    public static List<Integer> solve(List<Integer> n) {
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

        List<Integer> answers = solve(n);

        answers.forEach(e -> stringBuilder.append(String.format("%d%n", e)));

        System.out.print(stringBuilder);
    }
}
