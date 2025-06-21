/* Problem Statement:
You are given 5 numbers as input (not as an array). Each number is considered a "password". For each password, determine whether it is stable or unstable.
What is a Stable Password?
A number (password) is called stable if each digit in the number appears the same number of times.

Example:
Input: 1221
Digits: 1 → 2 times, 2 → 2 times
Since the frequencies are equal, the number is stable.

Input: 1234
Digits: 1 → 1 time, 2 → 1 time, 3 → 1 time, 4 → 1 time
All digits appear the same number of times (1), so it is also stable.

Input: 1122
Digits: 1 → 2 times, 2 → 2 times
It is stable.

Input: 1122334
Digits: 1 → 2 times, 2 → 2 times, 3 → 2 times, 4 → 1 time
Frequencies are not all equal, so it is unstable.

Input Format:
You are given 5 integers as individual variables. For example:
int inp1, inp2, inp3, inp4, inp5;
Each of these represents a password.

What You Need to Do:
 For each of the 5 inputs:
 Check if the number is stable or unstable.
 Keep a running total of:
  The sum of stable passwords.
  The sum of unstable passwords.
  At the end, subtract the sum of unstable passwords from the sum of stable passwords.

Output:
Print the result of:
sum of stable passwords - sum of unstable passwords */

import java.util.Scanner;

public class PasswordStableUnstable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inp1 = sc.nextInt();
        int inp2 = sc.nextInt();
        int inp3 = sc.nextInt();
        int inp4 = sc.nextInt();
        int inp5 = sc.nextInt();

        int result = processNumbers(inp1, inp2, inp3, inp4, inp5);
        System.out.println(result);
        sc.close();
    }
    public static int processNumbers(int n1, int n2, int n3, int n4, int n5) {
        int sumStable = 0, sumUnstable = 0;

        if (isStable(n1)) sumStable += n1; else sumUnstable += n1;
        if (isStable(n2)) sumStable += n2; else sumUnstable += n2;
        if (isStable(n3)) sumStable += n3; else sumUnstable += n3;
        if (isStable(n4)) sumStable += n4; else sumUnstable += n4;
        if (isStable(n5)) sumStable += n5; else sumUnstable += n5;

        return sumStable - sumUnstable;
    }

    public static boolean isStable(int num) {
        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        int expectedFreq = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                if (expectedFreq == 0) {
                    expectedFreq = freq[i];
                } else if (freq[i] != expectedFreq) {
                    return false;
                }
            }
        }
        return true;
    }
}
