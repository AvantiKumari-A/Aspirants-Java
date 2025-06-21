/* You are given an array of integers. Your task is to calculate the sum of the elements that are located at non-prime indices of the array.
Understand Array Indexing:
In programming, arrays are zero-indexed.
This means the first element is at index 0, the second at 1, and so on.

Define a Prime Number:
A prime number is a number greater than 1 that has no divisors other than 1 and itself.
Examples: 2, 3, 5, 7, 11, etc.

Non-Prime Indices:
These are the positions in the array where the index is not a prime number.
For example, index positions like 0, 1, 4, 6, 8, 9, etc., are not prime numbers.

Objective:
Traverse the array from index 0 to the end.
For each index, check if the index is a non-prime.
If it is a non-prime, add the value at that index to the sum.

Final Output:
After checking all indices, return or print the total sum of the values at non-prime index positions.

Example:
Input Array: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100], 10
Index values: 0 1 2 3 4 5 6 7 8 9
Prime index: 2, 3, 5, 7
Non-prime index: 0, 1, 4, 6, 8, 9
Values at non-prime index : 10, 20, 50, 70, 90, 100
Sum of non-prime index values: 340
This is the expected result. */

package Prime;
import java.util.Scanner;
public class SumOfNonPrimeIndexValueArray {
   public static int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int result = sumOfNonPrimeIndexValues(input, n);
        System.out.println(result);
        sc.close();
    } 
}
