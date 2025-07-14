package BulidInFunction;
import java.util.Scanner;
public class ReplaceAllUses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Example Input: Hello @123   World_#!
        String input = sc.nextLine();
        // 1. Replace multiple spaces with a single space
        String singleSpace = input.replaceAll("\\s+", " ");
        System.out.println("1. Single spaced: " + singleSpace);
        // Output: Hello @123 World_#!

        // 2. Remove all digits
        String noDigits = input.replaceAll("[0-9]", "");
        System.out.println("2. No digits: " + noDigits);
        // Output: Hello @   World_#!

        // 3. Remove all non-alphabetic characters
        String onlyLetters = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("3. Only letters: " + onlyLetters);
        // Output: HelloWorld

        // 4. Remove all digits using \d
        String noDigitsAlt = input.replaceAll("\\d", "");
        System.out.println("4. No digits (\\d): " + noDigitsAlt);
        // Output: Hello @   World_#!

        // 5. Keep only word characters (letters, digits, underscore)
        String onlyWords = input.replaceAll("\\W", "");
        System.out.println("5. Only word characters: " + onlyWords);
        // Output: Hello123World_
        sc.close();
    }
}
