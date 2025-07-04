/* You are given an array of integers arr and an integer k. 
Your task is to find and print the maximum number in each contiguous window of size k.
Input: Arr=[1,3,-1,-3,5,3,6,7] and K=3 (Window Size k is given as 3)
Output: [3,3,5,5,6,7] */

public class ContiguousWindow {
    public static void main(String[] args) {
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7},k = 3;
        int b[] = new int[a.length-k+1]; // 8-3 => 6
        for (int i = 0; i <= a.length - k; i++) {
            int max = a[i];
            for (int j = i + 1; j < i + k; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            b[i] = max;
        }
        for (int i = 0; i < b.length; i++) {
             System.out.print(b[i] + " ");
        }
    }
}

/* Explanation:

Iteration 1: i = 0, window = [1, 3, -1], initial max = 1
j = 1: a[1] = 3 → max = 3
j = 2: a[2] = -1 → no change
Final max = 3, b[0] = 3

Iteration 2: i = 1, window = [3, -1, -3], initial max = 3
j = 2: a[2] = -1 → no change
j = 3: a[3] = -3 → no change
Final max = 3, b[1] = 3

Iteration 3: i = 2, window = [-1, -3, 5], initial max = -1
j = 3: a[3] = -3 → no change
j = 4: a[4] = 5 → max = 5
Final max = 5, b[2] = 5

Iteration 4: i = 3, window = [-3, 5, 3], initial max = -3
j = 4: a[4] = 5 → max = 5
j = 5: a[5] = 3 → no change
Final max = 5, b[3] = 5

Iteration 5: i = 4, window = [5, 3, 6], initial max = 5
j = 5: a[5] = 3 → no change
j = 6: a[6] = 6 → max = 6
Final max = 6, b[4] = 6

Iteration 6: i = 5, window = [3, 6, 7], initial max = 3
j = 6: a[6] = 6 → max = 6
j = 7: a[7] = 7 → max = 7
Final max = 7, b[5] = 7

Final output: b = [3, 3, 5, 5, 6, 7] */