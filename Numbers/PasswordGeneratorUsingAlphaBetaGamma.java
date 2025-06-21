/* You are given three 3-digit numbers, named Alpha, Beta, and Gamma.
Your task is to generate a 4-digit password using specific digits from these three numbers based on the following rules:

Take the unit digits (rightmost digits) of Alpha, Beta, and Gamma.
From these three unit digits, find the minimum digit.
This digit will become the last (rightmost) digit of the password.

Take the tens digits (middle digits) of Alpha, Beta, and Gamma.
From these three tens digits, find the minimum digit.
This digit will become the third digit (from the left) in the password.

Take the hundreds digits (leftmost digits) of Alpha, Beta, and Gamma.
From these three hundreds digits, find the minimum digit.
This digit will become the second digit (from the left) in the password.

Collect all 9 digits from Alpha, Beta, and Gamma (that is, all their hundreds, tens, and unit digits).
From these 9 digits, find the maximum digit.
This digit will become the first (leftmost) digit of the password.

After collecting all these digits as per the above steps, combine them in the order:

[max digit][min hundreds digit][min tens digit][min units digit]
This gives the final 4-digit password.

Example:
Let
Alpha = 352
Beta = 149
Gamma = 768

Step-by-step:
Unit digits: 2 (from 352), 9 (from 149), 8 (from 768) → min = 2
Tens digits: 5 (from 352), 4 (from 149), 6 (from 768) → min = 4
Hundreds digits: 3 (from 352), 1 (from 149), 7 (from 768) → min = 1
All digits: 3,5,2,1,4,9,7,6,8 → max = 9
So the password = 9142 */

import java.util.Scanner;
public class PasswordGeneratorUsingAlphaBetaGamma {
    public static int calculateNumber(int input1, int input2, int input3) {
        int u1 = input1 % 10;
        int u2 = input2 % 10;
        int u3 = input3 % 10;
        int minu = u1 < u2 ? (u1 < u3 ? u1 : u3) : (u2 < u3 ? u2 : u3);
        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        int t1 = input1 % 10;
        int t2 = input2 % 10;
        int t3 = input3 % 10;
        int mint = t1 < t2 ? (t1 < t3 ? t1 : t3) : (t2 < t3 ? t2 : t3);
        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        int h1 = input1 % 10;
        int h2 = input2 % 10;
        int h3 = input3 % 10;
        int minh = h1 < h2 ? (h1 < h3 ? h1 : h3) : (h2 < h3 ? h2 : h3);
        int maxDigit = u1;
        if (u2 > maxDigit)
            maxDigit = u2;
        if (u3 > maxDigit)
            maxDigit = u3;
        if (t1 > maxDigit)
            maxDigit = t1;
        if (t2 > maxDigit)
            maxDigit = t2;
        if (t3 > maxDigit)
            maxDigit = t3;
        if (h1 > maxDigit)
            maxDigit = h1;
        if (h2 > maxDigit)
            maxDigit = h2;
        if (h3 > maxDigit)
            maxDigit = h3;
        return maxDigit * 1000 + minh * 100 + mint * 10 + minu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = calculateNumber(a, b, c);
        System.out.println("Result: " + result);
        sc.close();
    }
}
