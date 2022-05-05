package io.github.tahanima.beecrowd._1149;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param a denotes the first number
     * @param n denotes the second number
     * @return an integer containing the answer
     */
    public static int solve(int a, int n) {
        // Implement this method

        return 0;
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        while (n <= 0) {
            n = scanner.nextInt();
        }

        System.out.println(solve(a, n));
    }
}
