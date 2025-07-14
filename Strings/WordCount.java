public class WordCount {
    public static void main(String[] args) {
        String s = "   i  am   raja   "; // Input with leading, trailing, and extra middle spaces
        // Step 1: Replace multiple spaces with single space and trim ends
        String s2 = s.replaceAll("\\s+", " ").trim(); //s.trim() from leading space (front and last space)
        // Step 2: Split by space to get words
        String[] s1 = s2.split(" ");
        // Step 3: Count words
        int wcount = s1.length;
        // Output
        System.out.println(wcount); // Output: 3
    }
}