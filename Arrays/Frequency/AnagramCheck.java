/* An anagram check is the process of verifying whether two given strings 
Contain exactly the same characters with the same frequency but possibly in a different order.
For example, "listen" and "silent" are anagrams 
Because both contain the letters l, i, s, t, e, n exactly once.

To perform an anagram check:
First, compare the lengths of the two strings. If they are not equal, they cannot be anagrams.
Count the frequency of each character in both strings separately.
Compare the frequency counts of both strings. 
If all characters have the same frequency in both strings, They are anagrams.
If any character's frequency does not match, they are not anagrams.

Example:
s1 = "abaac"
s2 = "aabca"

Step 1: Check lengths. Both have length 5. Continue.
Step 2: Frequency of s1 = a:3, b:1, c:1
Frequency of s2 = a:3, b:1, c:1
Step 3: Frequencies match.
Output: Anagram => true

If frequencies did not match, 
Output would be: Not Anagram. => false */

package Frequency;
public class AnagramCheck {
    public static void main(String[] args) {
        String s1="abaac",s2="aabca";
        int f1[]=new int[26],f2[]=new int[26];
        boolean res=true;
        if(s1.length()!=s2.length()||s1.isEmpty()||s2.isEmpty())
         System.out.println("Invalid Input");
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
               f1[s1.charAt(i)-'a']++;
               f2[s2.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(f1[i]!=f2[i])
                 res=false;
            }
        }
        System.out.println(res);
    }
}
