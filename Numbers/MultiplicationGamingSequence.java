/* Problem Statement:
John and Michael play a multiplication game. The game starts with the number p = 1. 
Players take turns multiplying p by a number according to the following rules:
John always starts first and multiplies p by 1.
Michael then multiplies the result by 2.
John multiplies the result by 3, and so on, using sequential numbers up to 9.
After 9, the sequence restarts from 2 and continues in the same pattern.
The first player to make p greater than or equal to N wins the game.

Create a class that has two functions:
A function to perform the multiplication operation.
The main() function.

Input format :
The input consists of a single integer N representing the target number.

Output format :
The output prints the N value and who won the game, separated by a space.
Refer to the sample output for formatting specifications.

Code constraints :
1 < N < 50000

Sample test cases :
Input 1 :
10
Output 1 :
10 Michael wins

Input 2 :
100
Output 2 :
100 John wins 

Explanation:
The game starts with p = 1. 
John and Michael take turns multiplying p by a number. 
John always starts by multiplying with 1. 
Then Michael multiplies by 2, John by 3, Michael by 4, and so on up to 9. 
After reaching 9, the sequence restarts from 2 and continues: 2, 3, 4, ..., 9, 2, 3, etc. 
The first player to make p greater than or equal to N wins. 
For example, if N = 10, the multiplications are: 
John ×1 = 1, 
Michael ×2 = 2, 
John ×3 = 6, 
Michael ×4 = 24 → p ≥ 10, 
so Michael wins. 

If N = 100, then 
John ×1 = 1, 
Michael ×2 = 2, 
John ×3 = 6, 
Michael ×4 = 24, 
John ×5 = 120 → p ≥ 100, so John wins. 
A turn counter is used to determine the winner: 
if the turn number is even, John played last and wins; if odd, Michael wins. */

import java.util.*;
public class MultiplicationGamingSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = 1, m = 1, t = 0;
        while (p < n) {
            p = p * m;
            if (p >= n)
                break;
            t++;
            m++;
            if (m > 9) {
                m = 2;
            }
        }
        if (t % 2 == 0)
            System.out.println(n + " John wins");
        else
            System.out.println(n + " Michael wins");
        sc.close();
    }
}
