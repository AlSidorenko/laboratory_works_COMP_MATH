package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int variant_number = (16 - 1) % 10 + 1;
        int k = ((3-1) % 10) + 1;
        int a = (16 - ((16 - 1) % 10) - 1) / 10;

        System.out.printf("Variant Number: %s\n", variant_number);
        System.out.printf("K = %s\n", k);
        System.out.printf("A = %s", a);
    }
}
