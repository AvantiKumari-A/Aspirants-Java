package Fibonacci;
import java.util.Scanner;
public class FibonacciUsingFunction {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(fibonacci(n)+ " ");
    sc.close();
 }  
 public static int fibonacci(int n){
    int a=0,b=1,c;
    for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return a;
 } 
}
