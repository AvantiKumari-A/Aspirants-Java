/* Problem Statement: (Leetcode Problem: 316)
Give a string, remove duplicate letters from the string s such that each letter appears just once using Stack. 
The lexicographical order of your result must be the least of all feasible outcomes.
Input format :
The input consists of a string.

Output format :
The output displays the string in the lexicographical order with unique characters.

Refer to the sample output for the formatting specifications.
Code constraints :
The string consists of lowercase English letters.
The maximum number of characters in the string is 26.

Sample test cases :
Input 1 :
bcabc

Output 1 :
abc

Input 2 :
cbacdcbc

Output 2 :
acdb */

import java.util.Scanner;
public class RemoveDulplicatesInLexicographicalOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length(),lastIndex[]=new int[26],len=0;
        boolean seen[]=new boolean[26];
        char res[]=new char[26];
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(seen[idx])
             continue;
            while(len>0&&res[len-1]>ch&&lastIndex[res[len-1]-'a']>i){
                seen[res[len-1]-'a']=false;
                len--;
            }
            res[len]=ch;
            len++;
            seen[idx]=true;
        }
        for(int i=0;i<len;i++){
            System.out.print(res[i]);
        }
        sc.close();
    }
}