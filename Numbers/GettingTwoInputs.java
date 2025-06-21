/*Problem Statement
Design a program for Sasha and Brenda's game that takes the number of rounds 't' as input. For each round, input the scores 'x' for Sasha and 'y' for Brenda. 
The winner of each round is determined as follows:

If Sasha's score ('x') is greater than Brenda's score ('y'), Sasha wins.
If 'x' is equal to 'y', it's a tie.
Otherwise, Brenda wins. 

Display the winner's name for each round.
Input format :
The first line contains an integer t representing the number of rounds.
For each of the next t lines, the input consists of two space-separated integers x and y, representing the scores of Sasha and Brenda, respectively, for a particular round.

Output format :
For each test case, the output prints the result of that round.
If x is greater than y, the output prints "Sasha".
If x is equal to y, the output prints "Tie".
Otherwise, the output prints "Brenda"

Refer to the sample output for the formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
1 ≤ t ≤ 10
1 ≤ x, y ≤ 100

Sample test cases :
Input 1 :
10
17 17
30 65
90 50
46 46
25 14
31 31
25 78 
97 64
100 15
65 67

Output 1 :
Tie
Brenda
Sasha
Tie
Sasha
Tie
Brenda
Sasha
Sasha
Brenda

Input 2 :
4
20 30
40 30
50 70
80 20

Output 2 :
Brenda
Sasha
Brenda
Sasha

Input 3 :
1
14 69

Output 3 :
Brenda */

import java.util.Scanner;
public class GettingTwoInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y)
             System.out.println("Sasha");
            else if(x==y)
             System.out.println("Tie");
            else
             System.out.println("Brenda");
        }
        sc.close();
    }
}
