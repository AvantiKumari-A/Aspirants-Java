/* 81. Find common elements between two arrays*
Given two integer arrays, find and print the common elements between them. 
If an element appears multiple times in both arrays
Include it in the output as many times as it is commonly present. 
Elements should be printed in the order they appear in the first array. 
Each match in the second array should be used only once.
Example
Input:
a[] = {1, 2, 1, 3, 1}
b[] = {3, 1, 3, 4, 1}
Output:
{1, 3, 1}
Explanation
1 appears 3 times in array a and 2 times in array b → include 1 two times.
3 appears once in both arrays → include 3 once.
Final common elements: 1, 3, 1. */

public class FindCommonElementsBetweenTwoArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 1}, b[] = {3, 1, 3, 4, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    b[j] = -1; // mark as used
                    break;
                }
            }
        }
    }
}
