package ArmstrongNumber;

public class ArmstrongUsingFunc {
    public static void main(String[] args) {
        int num = 123;
        int res = Armstrong(num);
        if (res == num)
            System.out.println(num + " is a armstrong number");
        else
            System.out.println(num + " is not a armstrong number");
    }

    public static int Armstrong(int n) {
        int d, c, sum = 0;
        while (n > 0) {
            d = n % 10;
            c = d * d * d;
            sum += c;
            n = n / 10;
        }
        return sum;
    }
}
