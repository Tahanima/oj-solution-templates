package io.github.tahanima.uva._11614;

import java.util.Scanner;

public class Main {

    /**
     * @param numberOfWarriors denotes an integer array containing
     *                         the numbers of Etruscan warriors
     * @return a long array containing the answers
     */
    public static long[] solve(int[] numberOfWarriors) {
        // Implement this method

        return new long[0];
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();
        int[] numberOfWarriors = new int[testCases];

        for (int cases = 0; cases < testCases; cases++) {
            numberOfWarriors[cases] = scanner.nextInt();
        }

        long[] answer = solve(numberOfWarriors);

        for (long n: answer) {
            stringBuilder.append(String.format("%d%n", n));
        }

        System.out.print(stringBuilder);
    }
}
