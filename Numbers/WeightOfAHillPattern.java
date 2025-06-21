/* Question Explanation:
You are given three inputs:
The total number of levels in a hill pattern (called input1).
The weight of the first level, also called the head level (called input2).
The amount by which the weight increases in each next level (called input3).

In a hill pattern:
The first level has 1 star.
The second level has 2 stars.
The third level has 3 stars.
And so on, until the last level has as many stars as the level number.
Each star in a level has the same weight. The weight of the first level is given, and the weight increases by the given amount in each next level.

To calculate the total weight of the hill pattern:
Multiply the number of stars in a level by the weight of that level.
Add the result to the total.
Increase the weight by the given increment for the next level.
Repeat this for all levels from 1 to the total number of levels.

Example 1:
Given:
Total levels = 5
Weight of the first level = 10
Weight increment per level = 2

Step by step calculation:
Level 1 has 1 star with weight 10 → total = 10
Level 2 has 2 stars, weight increases to 12 → total = 12 + 12 = 24
Level 3 has 3 stars, weight increases to 14 → total = 14 + 14 + 14 = 42
Level 4 has 4 stars, weight increases to 16 → total = 16 + 16 + 16 + 16 = 64
Level 5 has 5 stars, weight increases to 18 → total = 18 + 18 + 18 + 18 + 18 = 90
Add all: 10 + 24 + 42 + 64 + 90 = 230
So the total weight of the hill pattern is 230.

Example 2:
Given:
Total levels = 4
Weight of the first level = 1
Weight increment per level = 5

Step by step calculation:
Level 1 has 1 star with weight 1 → total = 1
Level 2 has 2 stars, weight increases to 6 → total = 6 + 6 = 12
Level 3 has 3 stars, weight increases to 11 → total = 11 + 11 + 11 = 33
Level 4 has 4 stars, weight increases to 16 → total = 16 + 16 + 16 + 16 = 64
Add all: 1 + 12 + 33 + 64 = 110
So the total weight of the hill pattern is 110.

 */

import java.util.Scanner;
public class WeightOfAHillPattern {
    public static int totalHillWeight(int input1, int input2, int input3) {
        int sum = 0;
        for (int i = 1; i <= input1; i++) {
            sum += input2 * i;
            input2 = input2 + input3;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int result = totalHillWeight(input1, input2, input3);
        System.out.println(result);
        sc.close();
    }
}
