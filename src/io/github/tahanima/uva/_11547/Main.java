package io.github.tahanima.uva._11547;

import java.util.Scanner;

public class Main {

    /**
     * Returns the answers to the skill testing questions.
     *
     * @param number denotes the skill testing questions
     */
    public static int[] solve(int[] number) {
        // Implement this method

        return new int[0];
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();
        int[] number = new int[testCases];

        for (int cases = 0; cases < testCases; cases++)
            number[cases] = scanner.nextInt();

        int[] answer = solve(number);

        for (int n: answer)
            stringBuilder.append(String.format("%d%n", n));

        System.out.print(stringBuilder);
    }
}
