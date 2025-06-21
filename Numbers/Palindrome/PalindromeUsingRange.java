package Palindrome;

public class PalindromeUsingRange {
    public static void main(String[] args) {
        System.out.println("The palindrome numbers from 1 to 20 is: ");
        for(int i=1;i<=20;i++){
            if(i<10)
                System.out.println(i);
            else {
                int res = reverse(i);
                if(res==i)
                    System.out.println(i);
            }
        }
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        return rev;
    }
}

/*
This shortcut logic works only till 2 digit numbers
if the quotient and remainder is same then the number is a palindrome number

Program:
public class PalindromeShortcut {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            if(i<10||i/10==i%10)
                System.out.println(i);
        }
    }
}
*/