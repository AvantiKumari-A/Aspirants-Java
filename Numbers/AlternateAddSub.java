/* Find result after alternate add sub on N:
Given a number N (1<=N<=10000), and an option opt=1 or 2, find the result as per below rules, 

If opt=1,
Result = N-(N-1)+(N-2)-(N-3)+(N-4)... till 1

If opt=2, till 1 
Result N + (N-1)-(N-2)+(N-3) - (N-4)... till 1

Example1: If N = 6, and opt=1 Result 6-5-4-3-2-1 = 3

Example2: If N = 6, and opt=2 Result = 6+5-4-3-2+1 = 9

The function prototype should be as below -int AddSub(int N, int opt); */

public class AlternateAddSub {
    public static int AddSub(int input1, int input2) {
        int sum = input1;
        for (int i = input1 - 1; i >= 1; i--) {
            if (input2 == 1) {
                // opt = 1: N - (N-1) + (N-2) - (N-3) + ...
                if ((input1 - i) % 2 == 1)
                    sum -= i;
                else
                    sum += i;
            }
            if (input2 == 2) {
                // opt = 2: N + (N-1) - (N-2) + (N-3) - ...
                if ((input1 - i) % 2 == 1)
                    sum += i;
                else
                    sum -= i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println("N = 6, opt = 1 : " + AddSub(6, 1)); // Output: 3
        System.out.println("N = 6, opt = 2 : " + AddSub(6, 2)); // Output: 9
        System.out.println("N = 1, opt = 1 : " + AddSub(1, 1)); // Output: 1
        System.out.println("N = 5, opt = 2 : " + AddSub(5, 2)); // Output: 7
    }
}
