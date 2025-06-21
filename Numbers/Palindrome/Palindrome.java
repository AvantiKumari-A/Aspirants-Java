package Palindrome;

public class Palindrome {
    public static void main(String[] args){
        int n=121,rev=0,d,t=n;
        while (n>0){
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        if(rev==t)
            System.out.println(t + " is a palindrome");
        else
            System.out.println(t + " is not a palindrome");
    }
}
