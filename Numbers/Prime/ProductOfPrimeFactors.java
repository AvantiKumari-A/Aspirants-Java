/* Question Explanation: You are given an integer n. 
Your task is to find the product of all distinct prime factors of the number n. 
A prime factor is a prime number that divides n exactly (without remainder). 
Distinct means that if a prime factor appears more than once, you still count it only once in the multiplication. 
The program should return the product of all such unique prime numbers that divide n.

Example 1: Input: 28
Step-by-step: Factors of 28: 1, 2, 4, 7, 14, 28
Prime factors: 2 and 7
Ignore repeated factors
Product = 2 × 7 = 14
Output: 14

Example 2: Input: 9
Step-by-step: Factors: 1, 3, 9
Prime factor: 3
3 appears twice in 3×3 but we take it only once
Product = 3
Output: 3

How the Program Works (Java Version): The program contains two main parts: 
1. isPrime(int num) – A function to check if a number is prime. 
2. productOfPrimeFactors(int n) – A function to find the product of all distinct prime factors.
Main Loop in productOfPrimeFactors: The loop runs from i = 2 to n. For each i, it checks: 
 if i divides n (i.e., n % i == 0) and if i is a prime number. 
 If both are true, it multiplies product by i and removes all instances of i from n using 
   while (n % i == 0) n /= i; 
 This ensures that the same prime is not counted again. Finally, it returns the product.
How the Loops Work: The outer for loop checks numbers from 2 to n. 
 If i divides n and is prime, we multiply the result and divide n by i repeatedly to remove it. 
 This skips repeated primes and avoids counting the same prime again. 
 The final value returned is the product of all distinct prime factors.

 */

package Prime;
import java.util.Scanner;
public class ProductOfPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(productOfPrimeFactors(n));
        sc.close();
    }
     public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static int productOfPrimeFactors(int n) {
        int product = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                product *= i;
                while (n % i == 0)
                    n /= i;
            }
        }
        return product;
    }
}
