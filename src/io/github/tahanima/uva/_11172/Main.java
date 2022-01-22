package io.github.tahanima.uva._11172;

import java.util.Scanner;

public class Main {

    /**
     * @param values denotes an integer array containing the numbers to evaluate
     * @return a character array containing the answers
     */
    public static char[] solve(int[][] values) {
        // Implement this method

        return new char[0];
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();
        int[][] values = new int[testCases][2];

        for (int cases = 0; cases < testCases; cases++) {
            values[cases][0] = scanner.nextInt();
            values[cases][1] = scanner.nextInt();
        }

        char[] answer = solve(values);

        for (char ch: answer) {
            stringBuilder.append(String.format("%c%n", ch));
        }

        System.out.print(stringBuilder);
    }
}
