package io.github.tahanima.codechef.jcoins;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param x denotes the coins of 10 rupees
     * @param y denotes the coins of 5 rupees
     * @return an integer arraylist containing the answers
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> x, ArrayList<Integer> y) {
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

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        while (cases-- > 0) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }

        ArrayList<Integer> answers = solve(x, y);

        for (int answer: answers) {
            stringBuilder.append(String.format("%d%n", answer));
        }

        System.out.print(stringBuilder);
    }
}
