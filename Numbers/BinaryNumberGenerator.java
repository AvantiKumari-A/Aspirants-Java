/* Sneha, a programming enthusiast, has developed a keen interest in binary numbers and their intriguing patterns. She wants to visually explore the progression of binary numbers as they evolve from 1 up to a given integer n. 
To satisfy her curiosity, Sneha asks you to write a program that can generate these binary numbers efficiently. You need to design a program that utilizes a queue to generate the binary representations of numbers from 1 to n. 
This will allow her to observe the sequential development of binary numbers, giving her a deeper understanding of how these patterns form.

Input format :
The input is a single integer n, which represents the upper limit for generating binary numbers.

Output format :
The first line of output should print "Binary numbers from 1 to n are: "
Each binary number from 1 to n should be printed on a new line.
Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:
1 ≤ n ≤ 20

Sample test cases :
Input 1 :
3
Output 1 :
Binary numbers from 1 to 3 are:
1
10
11

Input 2 :
5
Output 2 :
Binary numbers from 1 to 5 are:
1
10
11
100
101 */

import java.util.Scanner;
public class BinaryNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Binary numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(toBinary(i));
        }
        sc.close();
    }
    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        return binary;
    }
}

/* Explanation:
Input: 3
Output:
Binary numbers from 1 to 3 are:

Iteration 1: i = 1 → toBinary(1)
Start: binary = "", num = 1
num % 2 = 1 → binary = "1", num = 0
Return "1"
Print: 1

Iteration 2: i = 2 → toBinary(2)
Start: binary = "", num = 2
num % 2 = 0 → binary = "0", num = 1
num % 2 = 1 → binary = "1" + "0" = "10", num = 0
Return "10"
Print: 10

Iteration 3: i = 3 → toBinary(3)
Start: binary = "", num = 3
num % 2 = 1 → binary = "1", num = 1
num % 2 = 1 → binary = "1" + "1" = "11", num = 0
Return "11"
Print: 11

Final Output:
Binary numbers from 1 to 3 are:
1
10
11 */