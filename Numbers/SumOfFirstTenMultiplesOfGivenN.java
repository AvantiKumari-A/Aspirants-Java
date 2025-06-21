/* Given an integer N
Your task is to calculate the sum of the first 10 Multiples of N and print the result. 
Input1:10 Output:550  */
import java.util.Scanner;
public class SumOfFirstTenMultiplesOfGivenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += N * i;
        }
        System.out.println("First 10 multiple of " + N + " is: " + sum);
        sc.close();
    }
}
