/* You are given a string. 
Your task is to find the longest substring that is a palindrome. 
A palindrome is a sequence that reads the same forward and backward, like "madam" or "racecar". 
A substring is a continuous part of the string. 
For example, in the string "babad", "bab" and "aba" are substrings and also palindromes. 
You need to find such substrings that are palindromes and return the longest one. 
In "babad", both "bab" and "aba" are valid answers 
Because they are the longest palindromic substrings with length 3. 
In "cbbd", the answer is "bb" because that is the longest substring that is a palindrome. 
The goal is to check all possible centers of palindromes in the string 
And expand around them to find the longest matching palindrome. 
The result should be the longest one you can find. */

package Substring; // Using Two Pointer Method
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babad",res="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub=s.substring(i, j);
                if(isPalindrome(sub) && sub.length()>res.length())
                 res=sub;
            }
        }
        System.out.println("Longest Palindrome Substring: "+res);
    }
    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        if(left<=right){
            if(s.charAt(left)!=s.charAt(right))
             return false;
            left++;
            right--;
        }
        return true;
    }
}
