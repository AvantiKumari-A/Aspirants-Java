package Prime;
import java.util.Scanner;
public class PrimeNoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = Prime(n);
        if (count == 2)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
        sc.close();
    }
    public static int Prime(int num){
        int c=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                c++;
        }
        return c;
    }
}
