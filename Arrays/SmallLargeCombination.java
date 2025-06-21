/*
Re-arranged array by small – largest combination 
Input: [1, 3, 5, 2, 8, 7, 4] 
Output:[1, 8, 2, 7, 3, 5, 4]
 */
package Arrays;

import java.util.Arrays;

public class SmallLargeCombination {
     public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 8, 7, 4};
        int b[] = new int[a.length];
        Arrays.sort(a);
        int i = 0, j = a.length - 1;
        for (int k = 0; k < b.length; k += 2) {
            b[k] = a[i];
            if (k + 1 < b.length) {
                b[k + 1] = a[j];
            }
            i++;
            j--;
        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
