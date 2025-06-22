/* Problem Statement
Jack and Jill are playing a string game. 
Jack has given Jill two strings A and B. 
Jill has to derive a string C from A, by deleting elements from string A, 
Such that string C does not contain any element of string B.
 Jill needs help to do this task. She wants a program to do this as she is lazy.
Given strings A and B as input, give string C as Output.

Example:
Input:
tiger
ti

Output:
ger

Explanation:
After removing “t” and “i” from “tiger”, we are left with “ger”. So the answer is “ger”.

Input format:
The first line consists of the string, representing the string A.
The second line consists of the string, representing the string B.

Output format:
The output displays a string C, which is the result of the string B taken out from A as per the logic.

Code constraints:
0 < length of A < 100
0 < length of B < length of A
A and B contain only lowercase letters

Sample test cases:
Input 1:
tiger
ti
Output 1:
ger */

import java.util.Scanner;
public class RemoveCharactersOfOneStringFromAnother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String res="";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            boolean found=false;
            for(int j=0;j<b.length();j++){
                if(ch==b.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found)
             res+=ch;
        }
        System.out.println(res);
        sc.close();
    }
}
