package Reverse;
public class NumberReverse {
    public static void main(String[] args){
        int n=123,rev=0,d,t=n;
        while (n>0){
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("The reverse of " + t + " is: " + rev);
    }
}
