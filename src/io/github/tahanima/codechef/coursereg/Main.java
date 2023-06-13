package io.github.tahanima.codechef.coursereg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes the sizes of the friend groups
     * @param m denotes the capacities of the courses
     * @param k denotes the number of students already registered
     * @return a string list containing the answers
     */
    public static List<String> solve(List<Integer> n, List<Integer> m, List<Integer> k) {
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
        ArrayList<Integer> k = new ArrayList<>();

        while (cases-- > 0) {
            n.add(scanner.nextInt());
            m.add(scanner.nextInt());
            k.add(scanner.nextInt());
        }

        List<String> answers = solve(n, m, k);

        answers.forEach(e -> stringBuilder.append(String.format("%s%n", e)));

        System.out.print(stringBuilder);
    }
}
