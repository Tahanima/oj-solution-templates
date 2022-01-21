package io.github.tahanima.uva._11044;

import java.util.Scanner;

public class Main {

    /**
     * @param grid denotes a 2D integer array containing the size of the grid (values for rows and columns)
     * @return an integer array containing the answers
     */
    public static int[] solve(int[][] grid) {
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
        int[][] grid = new int[testCases][2];

        for (int cases = 0; cases < testCases; cases++) {
            grid[cases][0] = scanner.nextInt();
            grid[cases][1] = scanner.nextInt();
        }

        int[] answer = solve(grid);

        for (int n: answer) {
            stringBuilder.append(String.format("%d%n", n));
        }

        System.out.print(stringBuilder);
    }
}
