/* Question Explanation:
You are given a number. You need to check if by removing only one digit, the number can become a palindrome. A palindrome is a number that reads the same forward and backward.
If it is already a palindrome, return -1.
If not, return the one digit that should be removed to make it a palindrome.

Example 1:
Input: 12332
Check: Remove 1 → becomes 2332 → is a palindrome
Output: 1

Example 2:
Input: 251532
Check: Remove 3 → becomes 25152 → is a palindrome
Output: 3

Example 3:
Input: 10101
It is already a palindrome
Output: -1

Code Explanation:
1. Convert the number to a string
2. Set two pointers: l (left at start), r (right at end)
3. While l < r:
     If characters at l and r match, move both pointers inward
     If mismatch:
     a. Check if substring from l+1 to r is a palindrome → if true, return digit at l
     b. Else check if substring from l to r-1 is a palindrome → if true, return digit at r
     c. If neither is a palindrome, return -1
4. If loop completes with no mismatch, return -1 (already a palindrome)

Output:
Return the digit to be removed to make the number a palindrome
Return -1 if it is already a palindrome */

package Palindrome;
import java.util.Scanner;
public class RemoveOneDigitForPalindrome {
    public static int digitRemove_Palin(int input1) {
        String s = input1 + "";
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                if (isPalindrome(s, l + 1, r)) {
                    return s.charAt(l) - '0';
                }
                if (isPalindrome(s, l, r - 1)) {
                    return s.charAt(r) - '0';
                }
                return -1;
            }
        }
        return -1;
    }
    public static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = digitRemove_Palin(input);
        System.out.println(result);
        sc.close();
    }
}
