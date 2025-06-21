package Factorial;

public class FactorialUsingRecursion{
    public static void main(String[] args) {
        int x=5; //dynamic initialization in java
        int res = fact(x); //calling function
        System.out.println("Fact of " + x + " is: " + res);
    }
    public static int fact(int n){ //called function
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
}
