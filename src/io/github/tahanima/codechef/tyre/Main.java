package io.github.tahanima.codechef.tyre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes the number of bikes
     * @param m denotes the number of cars
     * @return an integer list containing the answers
     */
    public static List<Integer> solve(List<Integer> n, List<Integer> m) {
        // Implement this method

        return new ArrayList<>();
    }

    /** Takes care of the problem's input and output. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();

        while (cases-- > 0) {
            n.add(scanner.nextInt());
            m.add(scanner.nextInt());
        }

        List<Integer> answers = solve(n, m);

        answers.forEach(e -> stringBuilder.append(String.format("%d%n", e)));

        System.out.print(stringBuilder);
    }
}
