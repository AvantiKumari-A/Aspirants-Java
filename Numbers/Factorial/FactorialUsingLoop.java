package Factorial;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        int x=5;
        int res = fact(x);
        System.out.println("Fact of " + x + " is: " + res);
    }
    public static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
