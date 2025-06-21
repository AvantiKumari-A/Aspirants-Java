package Reverse;
public class ReverseNumberOptimized{
    public static void main(String[] args) {
        int n=123;
        String s1=String.valueOf(n); // convert int to string
        StringBuilder s2=new StringBuilder(s1); // fast operation than string for optimized outputs
        String s3=s2.reverse().toString();
        System.out.println(Integer.parseInt(s3)); // convert string to int
    }
}