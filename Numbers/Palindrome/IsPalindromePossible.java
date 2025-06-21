/* We sholud check whether the palindrome is possible by rearranging the given number
if number is odd length there exists one digit which is of count 1 & other digits count is of multiple of 2
if number is of even length then the digits count must be multiple of 2

eg1:
i/p: 21251 (odd length)
 2 -> 2 times
 1 -> 2 times
 5 -> 1 time
 Here, 2 and 5 counts are in range of multiple of 2 and there is one digit which is of count = 1
Therefore, palindrome is possible

eg2:
i/p: 211211 (even length)
 2 -> 2
 1 -> 4
 Here, 2 and 4 counts are in range of multiples of 2
Therefore, palindrome is posssible

eg3:
i/p: 2125 (odd length)
 2 -> 2
 1 -> 1
 5 -> 1
 Here, two numbers are not in count of multiple of 2 and two numbers is in count of 1
Therefore, palindrome is not possible */

package Palindrome;
import java.util.Scanner;
public class IsPalindromePossible { // return 2 if palindrome is possible, else return 1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n=sc.nextInt();
        System.out.println(palindrome(n));
        sc.close();
    }
    public static int palindrome(int n){
        int[] a=new int[10]; // int has values from 0 - 9 so array length is given as 10
        while (n!=0) {
            int d=n%10;
            a[d]++;
            n/=10;
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
             count++;
        } 
        if(count==0 || count==1) // 0 for even length 1 for odd length
         return 2;
        return 1;
    }
}
