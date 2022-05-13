package io.github.tahanima.beecrowd._1180;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param numbers denotes the numbers
     * @return a string containing the answer
     */
    public static String solve(ArrayList<Integer> numbers) {
        // Implement this method

        return "";
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int n = scanner.nextInt();

        while (n-- > 0) {
            numbers.add(scanner.nextInt());
        }

        System.out.println(solve(numbers));
    }
}
