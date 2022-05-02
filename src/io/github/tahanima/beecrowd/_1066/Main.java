package io.github.tahanima.beecrowd._1066;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param n denotes an arraylist containing 5 numbers
     * @return a string containing the answer
     */
    public static String solve(ArrayList<Integer> n) {
        // Implement this method

        return "";
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            n.add(scanner.nextInt());
        }

        System.out.println(solve(n));
    }
}
