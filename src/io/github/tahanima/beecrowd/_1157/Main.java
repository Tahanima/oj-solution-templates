package io.github.tahanima.beecrowd._1157;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes the number
     * @return an integer arraylist containing the answer
     */
    public static ArrayList<Integer> solve(int n) {
        // Implement this method

        return new ArrayList<>();
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> divisors = solve(scanner.nextInt());

        for (int divisor: divisors) {
            System.out.println(divisor);
        }
    }
}
