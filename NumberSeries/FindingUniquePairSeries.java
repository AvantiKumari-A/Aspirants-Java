/* Imagine you are organizing a company event where each attendee is required to team up with another attendee to complete a series of activities. 
You want to calculate how many unique pairs of attendees can be formed to ensure everyone is paired up.

Given the total number of attendees at the event, write a program to calculate how many unique pairs of attendees can be formed. 
Each pair consists of two different attendees.
Input format :
The input contains an integer n, representing the number of attendees at the event.

Output format :
The output displays an integer representing the total number of unique pairs of attendees that can be formed.

Refer to the sample output for the formatting specifications.
Code constraints :
In the given scenario, the test cases fall under the following constraints:
1 ≤ n ≤ 100

Sample test cases :
Input 1 :
1
Output 1 :
0

Input 2 :
15
Output 2 :
105

Input 3 :
100
Output 3 :
4950 */

import java.util.Scanner;
public class FindingUniquePairSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=(n*(n-1))/2;
        System.out.println(res);
        sc.close();
    }
}

/*
Logic Explanation:

Each pair consists of 2 different attendees. 
So, we are looking for the number of ways to choose 2 people from n.
This is a standard combination problem:

Number of unique pairs Formula:
Number of unique pairs=(n/2) => (n * (n-1))/2
 
n is the total number of people
n - 1 is how many people each person can pair with
Divide by 2 because pairing A with B is the same as pairing B with A (i.e., order doesn't matter)

Examples:
Input: 1
You can’t form any pair with one person → Output: 0

Input: 15
Pairs = 15 × 14 / 2 = 105 → Output: 105

Input: 100
Pairs = 100 × 99 / 2 = 4950 → Output: 4950
 */