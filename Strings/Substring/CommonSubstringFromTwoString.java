/* Print common substring in 2 given strings
Ex: s1 = abcd and s2 = bcda 
Contains common substring "bcd" 
O/P: bcd */

package Substring;
public class CommonSubstringFromTwoString {
    public static void main(String[] args) {
        String s1 = "abcd",s2 = "bcda";
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            String temp = "";
            for (int j = i; j < s1.length(); j++) {
                temp += s1.charAt(j);
                if (s2.contains(temp) && temp.length() > result.length()) {
                    result = temp;
                }
            }
        }
        System.out.println("Common Substring In Two Strings: " + result);
    }
}

/* Using Two Pointer:
public class CommonSubstringFromTwoString {
    public static void main(String[] args) {
        String s1 = "abcd",s2 = "bcda";
        String longest = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                int p1 = i;
                int p2 = j;
                String temp = "";
                while (p1 < s1.length() && p2 < s2.length() && s1.charAt(p1) == s2.charAt(p2)) {
                    temp = temp + s1.charAt(p1);  // Append char to temp string
                    p1++;
                    p2++;
                }
                if (temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }
        System.out.println("Longest common substring: " + longest);
    }
}
*/