package io.github.tahanima.beecrowd._1154;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param ages denotes the age values of the individuals
     * @return a long number containing the answer
     */
    public static String solve(ArrayList<Integer> ages) {
        // Implement this method

        return "";
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (scanner.hasNext()) {
            int age = scanner.nextInt();

            if (age < 0) {
                break;
            }

            ages.add(age);
        }

        System.out.println(solve(ages));
    }
}
