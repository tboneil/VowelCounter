package org.nextdaylabs;

import java.util.Scanner;

/**
 * Author: Tyler O'Neil
 * Created: 7/20/2025
 * Title: VowelCounter
 * Description: Simple vowel counter created to understand the basics of Java. Takes input from Keyboard into the console, prints out each vowel found on a new line.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = {'a','e','i','o','u'};
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (char vowel : vowels) {
                if (input.toLowerCase().charAt(i) == vowel) {
                    System.out.println("Vowel Found: " + vowel);
                }
            }
        }
    }
}