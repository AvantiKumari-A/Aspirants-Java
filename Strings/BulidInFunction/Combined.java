package BulidInFunction;
import java.util.Arrays;
public class Combined {
    public static void main(String[] args) {
        String s = "  Java Programming 123  ";
        // 1. length()
        // Gets the number of characters (including spaces)
        System.out.println("1. Length: " + s.length());
        // Input: "  Java Programming 123  "
        // Output: 25

        // 2. trim()
        // Removes leading and trailing spaces
        System.out.println("2. Trimmed: '" + s.trim() + "'");
        // Output: "Java Programming 123"

        // 3. charAt(index)
        // Gets the character at index 5 (0-based)
        System.out.println("3. Char at index 5: " + s.charAt(5));
        // Output: 'P'

        // 4. toUpperCase() and toLowerCase()
        System.out.println("4. Uppercase: " + s.toUpperCase());
        System.out.println("   Lowercase: " + s.toLowerCase());
        // Output: "  JAVA PROGRAMMING 123  "
        //         "  java programming 123  "

        // 5. equals() and equalsIgnoreCase()
        System.out.println("5. Equals 'Java programming': " + s.trim().equals("Java programming")); // false
        System.out.println("   EqualsIgnoreCase: " + s.trim().equalsIgnoreCase("Java programming")); // true

        // 6. compareTo()
        System.out.println("6. CompareTo 'Java': " + "Java".compareTo("Kava")); // < 0 (J < K)

        // 7. indexOf() and lastIndexOf()
        System.out.println("7. First index of 'a': " + s.indexOf('a'));     // Output: 3
        System.out.println("   Last index of 'a': " + s.lastIndexOf('a')); // Output: 17

        // 8. contains()
        System.out.println("8. Contains 'gram': " + s.contains("gram")); // true

        // 9. startsWith() and endsWith()
        System.out.println("9. Starts with '  Ja': " + s.startsWith("  Ja")); // true
        System.out.println("   Ends with '123  ': " + s.endsWith("123  "));   // true

        // 10. substring()
        System.out.println("10. Substring (2 to 6): '" + s.substring(2, 6) + "'");
        // Output: "Java"

        // 11. replace()
        System.out.println("11. Replace 'a' with '@': " + s.replace('a', '@'));
        // Output: "  J@v@ Progr@mming 123  "

        // 12. replaceAll() – remove digits
        System.out.println("12. Remove digits: " + s.replaceAll("[0-9]", ""));
        // Output: "  Java Programming   "

        // 13. split() – by space
        String[] words = s.trim().split(" ");
        System.out.println("13. Split by space: " + Arrays.toString(words));
        // Output: [Java, Programming, 123]

        // 14. join()
        System.out.println("14. Join with '-': " + String.join("-", words));
        // Output: "Java-Programming-123"

        // 15. valueOf() – convert number to string
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("15. valueOf: " + numStr);
        // Output: "100"

        // 16. parseInt() – convert string to int
        int parsed = Integer.parseInt("123");
        System.out.println("16. parseInt: " + parsed);
        // Output: 123

        // 17. Character class – check letter, digit, case
        char c = 'A';
        System.out.println("17. isLetter: " + Character.isLetter(c));       // true
        System.out.println("    isDigit: " + Character.isDigit(c));        // false
        System.out.println("    isUpperCase: " + Character.isUpperCase(c));// true
        System.out.println("    isLowerCase: " + Character.isLowerCase(c));// false
    }
}

/* Input:
String s = "  Java Programming 123  ";

Sample Output:
1. Length: 25
2. Trimmed: 'Java Programming 123'
3. Char at index 5: P
4. Uppercase:   JAVA PROGRAMMING 123  
   Lowercase:   java programming 123  
5. Equals 'Java programming': false
   EqualsIgnoreCase: true
6. CompareTo 'Java': -1
7. First index of 'a': 3
   Last index of 'a': 17
8. Contains 'gram': true
9. Starts with '  Ja': true
   Ends with '123  ': true
10. Substring (2 to 6): 'Java'
11. Replace 'a' with '@':   J@v@ Progr@mming 123  
12. Remove digits:   Java Programming   
13. Split by space: [Java, Programming, 123]
14. Join with '-': Java-Programming-123
15. valueOf: 100
16. parseInt: 123
17. isLetter: true
    isDigit: false
    isUpperCase: true
    isLowerCase: false */