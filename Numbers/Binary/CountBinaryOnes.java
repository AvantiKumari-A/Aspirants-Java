/* Given an array of integers and a number c, 
The task is to count how many numbers in the array have exactly c no of 1s in their binary representation

Input:
5 (size of the array)
2 ( target number of 1s in binary)
2 3 4 5 6 (array elements)
Output:
3 (count of numbers having exactly c 1s in their binary representation) */

package Binary;
import java.util.Scanner;
public class CountBinaryOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int ones = 0;
            // Count 1s in binary
            while (num > 0) {
                int rem = num % 2;
                if (rem == 1)
                    ones++;
                num = num / 2;
            }
            if (ones == c)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}

/* Program Explanation:

1. Read the size of the array n and the value c.
2. Read n integers into the array.
3. Initialize a variable count to 0.
4. Loop through each number in the array.
5. For each number, count the number of 1s in its binary form by dividing by 2 and checking the remainder.
6. If the number of 1s is equal to c, increase the count by 1.
7. After the loop ends, print the value of count. */