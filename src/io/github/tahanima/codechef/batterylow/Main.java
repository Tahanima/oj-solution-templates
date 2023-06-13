package io.github.tahanima.codechef.batterylow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param x denotes the battery level of phones
     * @return a string list containing the answers
     */
    public static List<String> solve(List<Integer> x) {
        // Implement this method

        return new ArrayList<>();
    }

    /** Takes care of the problem's input and output. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();

        while (cases-- > 0) {
            x.add(scanner.nextInt());
        }

        List<String> answers = solve(x);

        answers.forEach(e -> stringBuilder.append(String.format("%s%n", e)));

        System.out.print(stringBuilder);
    }
}
