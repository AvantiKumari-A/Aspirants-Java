package Swapping;

public class SwapUsingTemp {
    public static void main(String[] args) {
        int a=12, b=5, temp;
        System.out.println("Before Swapping: a = " + a + " b = " + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }
}