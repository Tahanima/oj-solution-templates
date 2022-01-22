package io.github.tahanima.uva._11727;

import java.util.Scanner;

public class Main {

    /**
     * @param salaries denotes an integer array containing the salaries to evaluate
     * @return an integer array containing the answers
     */
    public static int[] solve(int[][] salaries) {
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
        int[][] salaries = new int[testCases][3];

        for (int cases = 0; cases < testCases; cases++) {
            salaries[cases][0] = scanner.nextInt();
            salaries[cases][1] = scanner.nextInt();
            salaries[cases][2] = scanner.nextInt();
        }

        int[] answer = solve(salaries);
        int cases = 1;

        for (int salary: answer) {
            stringBuilder.append(String.format("Case %d: %d%n", cases++, salary));
        }

        System.out.print(stringBuilder);
    }
}
