/* You are given the cost of 2-coin packets (a), 4-coin packets (b), and a minimum number of coins (c). 
You can use any number of 2 and 4-coin packets, either alone or in combination, to collect at least c coins. 
The total number of coins collected can exceed c but not be less than c. 
Your task is to find the minimum cost required to collect at least c coins. 
Input: a = 5 (cost of 2 packet), b = 9 (cost of 4 packet), c = 20 (total packets want) 
Output: 45 (min cost)

Step by step iteration explanation: 
Iteration 1 (coins = 20): four = 0, rem = 20, two = 10, cost = 50
Iteration 1 (coins = 20): four = 1, rem = 16, two = 8, cost = 49
Iteration 1 (coins = 20): four = 2, rem = 12, two = 6, cost = 48
Iteration 1 (coins = 20): four = 3, rem = 8, two = 4, cost = 47
Iteration 1 (coins = 20): four = 4, rem = 4, two = 2, cost = 46
Iteration 1 (coins = 20): four = 5, rem = 0, two = 0, cost = 45
Iteration 2 (coins = 22): best cost found = 50
Iteration 3 (coins = 24): best cost found = 54
No better cost found in further iterations (So, Output: Minimum cost = 45)
Using 0 two-coin packets and 5 four-coin packets to get 20 coins.*/

import java.util.Scanner;
public class MinCostCoinPackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Cost of 2-coin packet
        int b = sc.nextInt(); // Cost of 4-coin packet
        int c = sc.nextInt(); // Minimum required coins
        int minCost = Integer.MAX_VALUE;
        for (int i = c; i <= c + 10; i += 2) {
            for (int j = 0; j <= i / 4; j++) {
                int rem = i - (j * 4);
                if (rem % 2 == 0) {
                    int two = rem / 2;
                    int cost = (two * a) + (j * b);
                    if (cost < minCost) 
                        minCost = cost;
                }
            }
        }
        System.out.println(minCost);
        sc.close();
    }
}
