package BulidInFunction;
import java.util.Arrays;
public class SplitExamples {
    public static void main(String[] args) {
        // 1. Split by space
        String str1 = "Java is fun";
        String[] words1 = str1.split(" ");
        System.out.println("1. Split by space: " + Arrays.toString(words1));
        // Output: [Java, is, fun]

        // 2. Split by comma
        String str2 = "apple,banana,grape";
        String[] fruits = str2.split(",");
        System.out.println("2. Split by comma: " + Arrays.toString(fruits));
        // Output: [apple, banana, grape]

        // 3. Split by multiple spaces using \\s+
        String str3 = "Java     is   awesome";
        String[] words2 = str3.split("\\s+");
        System.out.println("3. Split by multiple spaces: " + Arrays.toString(words2));
        // Output: [Java, is, awesome]

        // 4. Split by every character
        String str4 = "ABC";
        String[] chars = str4.split("");
        System.out.println("4. Split by each character: " + Arrays.toString(chars));
        // Output: [, A, B, C] → First element is "" (before first char)

        // 5. Split by colon :
        String str5 = "key:value:123";
        String[] parts = str5.split(":");
        System.out.println("5. Split by colon: " + Arrays.toString(parts));
        // Output: [key, value, 123]
    }
}
