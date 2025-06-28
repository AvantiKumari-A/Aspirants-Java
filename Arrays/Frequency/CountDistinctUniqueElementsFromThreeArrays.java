/* 86. Given three arrays A1, A2, A3. 
Find the count of the distinct values: A1 values should not present in both A2 and A3. 
Similarly for A2 and A3 
Input:[1, 2, 3, 4] [3, 4, 5, 6] [6, 7, 8] 
Output: 5 */

package Frequency;
public class CountDistinctUniqueElementsFromThreeArrays {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4}, a2[] = {3, 4, 5, 6}, a3[] = {6, 7, 8},c=0;
        int max = findMax(a1, a2, a3); // Find the maximum value
        int freq[] = new int[max + 1]; // Frequency array
        // Count frequency from all arrays
        for (int i = 0; i < a1.length; i++) {
            freq[a1[i]]++;
        }
        for (int j = 0; j < a2.length; j++) {
            freq[a2[j]]++;
        }
        for (int k = 0; k < a3.length; k++) {
            freq[a3[k]]++;
        }
        // Count values that appear exactly once
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1)
                c++;
        }
        System.out.println(c);  // Output: 5
    }
    // Helper method to find the maximum value among all three arrays
    public static int findMax(int[] a1, int[] a2, int[] a3) {
        int max = Integer.MIN_VALUE;
        for (int i : a1) if (i > max) max = i;
        for (int i : a2) if (i > max) max = i;
        for (int i : a3) if (i > max) max = i;
        return max;
    }
}