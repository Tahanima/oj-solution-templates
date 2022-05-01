package io.github.tahanima.beecrowd._1010;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Main {

    /**
     * @param p1 denotes the first product
     * @param p2 denotes the second product
     * @return a string containing the answer
     */
    public static String solve(Product p1, Product p2) {
        // Implement this method

        return "";
    }

    /**
     * Keeps product information: code, number of units and unit price.
     */
    public static class Product {
        int code;
        int numberOfUnits;
        double unitPrice;

        public Product(int code, int numberOfUnits, double unitPrice) {
            this.code = code;
            this.numberOfUnits = numberOfUnits;
            this.unitPrice = unitPrice;
        }
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(solve(
                new Product(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble()),
                new Product(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble())));
    }
}
