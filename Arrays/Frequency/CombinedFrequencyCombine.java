package Frequency;
public class CombinedFrequencyCombine {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 2, 3, 3, 3};
        String s = "aabbccc";
        // Frequency for numbers
        int numFreq[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numFreq[i] == -1) continue;
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    numFreq[j] = -1; 
                }
            }
            numFreq[i] = count;
        }
        // Frequency for characters
        char chars[] = s.toCharArray();
        int charFreq[] = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; 
                }
            }
            charFreq[i] = count;
        }
        int matchCount = 0;
        System.out.println("Matched Frequencies:");
        for (int i = 0; i < numbers.length; i++) {
            if (numFreq[i] == -1) continue;
            for (int j = 0; j < chars.length; j++) {
                if (charFreq[j] != 0 && numFreq[i] == charFreq[j]) {
                    matchCount++;
                    System.out.println("Number: " + numbers[i] + " -> Character: " + chars[j] + " (Frequency: " + numFreq[i] + ")");
                    charFreq[j] = 0; 
                    break; 
                }
            }
        }
        System.out.println("\nFrequencies with same count: " + matchCount);
    }
}
