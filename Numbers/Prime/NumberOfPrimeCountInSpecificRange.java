/* If given range is 2 to 20 it should return 8 
Since from 2 to 20 there are 8 prime number : 2,3,5,7,11,13,17,19 */

package Prime;
import java.util.Scanner;
public class NumberOfPrimeCountInSpecificRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the end value: ");
        int n2 = sc.nextInt();
        int res = nthprime(n1, n2);
        System.out.println(res);
        sc.close();
    }

    public static int nthprime(int n1, int n2) {
        int count = 0;
        while (n1 < n2) {
            if (prime(n1))
                count++;
            n1++;
        }
        return count;
    }

    public static boolean prime(int n1) {
        if (n1 <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0)
                return false;
        }
        return true;
    }
}