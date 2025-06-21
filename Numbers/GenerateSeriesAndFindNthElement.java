/* Generate series and find Nth element:  
Given three numbers, a, b and c, such that either a < b < c or a > b > c and a, b, and c can be positive, negative or zero.  
Form the series such that the gap between c and its next element (say d) should be the same as the gap between a and b. 
Similarly, the gap between c's next element (d) and d's next element (say e) should be  the same as the gap between b and c.  
Find and return the Nth element.  

Example1- If the three numbers are a = 1 b = 3 c = 6 and N = 17  

The series will be formed as below -  
1, 3, 6, 8, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 36, 38, 41
O/p: 17th number in the series is 41

Example1 Explanation:
a = 1, b = 3, c = 6, N = 7

Steps:
Start the series:
→ 1, 3, 6

Find the gaps:
→ d1 = b - a = 3 - 1 = 2
→ d2 = c - b = 6 - 3 = 3

Now build the rest using alternating pattern:
Term 4 = 6 + d1 = 6 + 2 = 8
Term 5 = 8 + d2 = 8 + 3 = 11
Term 6 = 11 + d1 = 11 + 2 = 13
Term 7 = 13 + d2 = 13 + 3 = 16

Final Answer:
7th term = 16

Example2- If the three numbers are a = 5 b = - 2 c = - 4 and N = 14 

The series will be formed as belows
5, -2, -4, -11, -13, -20, -22, -29, -31, -38, -40, -47, -49, -56
14th number in the series is -56

The function prototype should be as below -
int seriesN(int a, int b, int c, int N); 

Explanation: 

You're given three numbers: a, b, and c. These numbers form the beginning of a series.
You're also given a number N, and your task is to find the Nth term of the series.

The rule for the series is:
 Start the series with a, b, and c.
 After these three, build the remaining series using a pattern of alternating differences:
 First, calculate d1 = b - a (the gap between the first and second numbers)
 Then, calculate d2 = c - b (the gap between the second and third numbers)
 From the 4th term onwards, you:
 Add d1 to the previous term if i (next element in series) is even
 Else add d2 to the result if i is odd
 This alternating addition continues until you reach the Nth term. */

public class GenerateSeriesAndFindNthElement {
    public static int seriesN(int a, int b, int c, int N) {
        int d1 = b - a;
        int d2 = c - b;
        int current = c, res = 0;

        for (int i = 4; i <= N; i++) {
            if (i % 2 == 0)
                res = current + d1;
            else
                res = current + d2;
            current = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(seriesN(1, 3, 6, 17)); // Output: 41
        System.out.println(seriesN(5, -2, -4, 14)); // Output: -56
    }
}
