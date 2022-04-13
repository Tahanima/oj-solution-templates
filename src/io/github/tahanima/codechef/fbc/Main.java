package io.github.tahanima.codechef.fbc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */

public class Main {

    /**
     * @param k denotes the capacities of buckets
     * @param x denotes the amounts of water already filled up
     * @return an integer arraylist containing the answers
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> k, ArrayList<Integer> x) {
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

        ArrayList<Integer> k = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();

        while (cases-- > 0) {
            k.add(scanner.nextInt());
            x.add(scanner.nextInt());
        }

        ArrayList<Integer> answers = solve(k, x);

        for (int answer: answers) {
            stringBuilder.append(String.format("%s%n", answer));
        }

        System.out.print(stringBuilder);
    }
}
