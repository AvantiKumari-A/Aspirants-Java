/* You are given two integers, S and D, where:
S represents the sum of digits of a number.
D represents the number of digits in the number.
Your task is to find the smallest number that can be formed with exactly D digits 
Such that the sum of its digits is S.
If it is not possible to form such a number, print "Not possible".

Example:
The inputs are 9 and 2. There are many other possible numbers, like 45, 54, 90, etc., 
With the sum of digits of 9 and the number of digits of 2.
The smallest of them is 18.

Input format :
The first line of input consists of integer S representing the sum of digits
The last line of input consists of integer D representing the number of digits.
The input consists of two integers:
S (1 ≤ S ≤ 45): The sum of digits.
D (1 ≤ D ≤ 5): The number of digits.

Output format :
If a number with D digits whose digits sum to S is possible, output the smallest such number.
If it is not possible to form such a number, print "Not possible".
The number should have exactly D digits. If D > 1, 
The number must not start with a zero unless the number is zero itself.
Refer to the sample output for formatting specifications.

Code constraints :
0 ≤ S ≤ 50
2 ≤ D ≤ 9

Sample test cases :
Input 1 :
9
2

Output 1 :
Smallest number is 18

Input 2 :
50
5

Output 2 :
Not possible */

import java.util.Scanner;
public class FindSmallestPossibleNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),d=sc.nextInt();
        if(s>9*d||(s==0&&d>1)){
            System.out.println("Not possible");
            sc.close();
            return;
        }
        int num[]=new int[d];
        for(int i=d-1;i>=0;i--){
            if(s>9){
                num[i]=9;
                s-=9;
            }
            else{
                num[i]=s;
                s=0;
            }
        }
        if(num[0]==0){
            for(int i=1;i<d;i++){
                if(num[i]>0){
                    num[i]--;
                    num[0]=1;
                    break;
                }
            }
        }
        System.out.print("Smallest number is ");
        for(int digit:num)System.out.print(digit);
        sc.close();
    }
}
