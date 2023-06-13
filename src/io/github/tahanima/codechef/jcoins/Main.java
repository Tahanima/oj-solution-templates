package io.github.tahanima.codechef.jcoins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param x denotes the coins of 10 rupees
     * @param y denotes the coins of 5 rupees
     * @return an integer list containing the answers
     */
    public static List<Integer> solve(List<Integer> x, List<Integer> y) {
        // Implement this method

        return new ArrayList<>();
    }

    /** Takes care of the problem's input and output. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        while (cases-- > 0) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }

        List<Integer> answers = solve(x, y);

        answers.forEach(e -> stringBuilder.append(String.format("%d%n", e)));

        System.out.print(stringBuilder);
    }
}
