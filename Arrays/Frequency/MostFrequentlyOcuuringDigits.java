/* Find the Most Frequently Occurring Digit in a series of numbers.
Kamal is a data analyst in a lottery management organization.
One of the tasks assigned to Kamal is to 
Find the Most Frequently Occurring Digit in a series of input numbers.
Below are a couple of examples to illustrate how to find the 
Most Frequently Occurring Digit in a series of input numbers.

Example 1:
If the series of input numbers are \[1237, 262, 666, 140]
We notice that,
0 occurs 1 time
1 occurs 2 times
2 occurs 3 times
3 occurs 1 time
4 occurs 1 time
5 occurs 0 times
6 occurs 4 times
7 occurs 1 time
8 occurs 0 times
9 occurs 0 times
We observe that –
4 is the highest frequency in this series, and,
6 is the digit that occurs 4 times.
Thus, the Most Frequently Occurring Digit in this series is 6.

Example 2:
If the series of input numbers is \[1237, 202, 666, 140]
We notice that,
0 occurs 2 times
1 occurs 2 times
2 occurs 3 times
3 occurs 1 time
4 occurs 1 time
5 occurs 0 times
6 occurs 3 times
7 occurs 1 time
8 occurs 0 times
9 occurs 0 times
We observe that –
3 is the highest frequency in this series, and,
2 and 6 are the digits that occur 3 times.
The larger of the two digits (2 and 6) is 6.
Thus, the Most Frequently Occurring Digit in this series is 6.

NOTE: If more than one digit occurs the most frequent number of times, 
Then the largest of the digits should be chosen as the answer.

Function Signature:
The function takes two inputs
input1 is the array of numbers
input2 is the number of elements in the array input1 */

package Frequency;
public class MostFrequentlyOcuuringDigits {
    public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int arr[] = new int[10];
        int i = 0;
        while (i < input2) {
            freq(input1[i], arr);
            i++;
        }
        int max = 0, val = 0;
        for (int j = 0; j < 10; j++) {
            if (arr[j] > max) {
                max = arr[j];
                val = j;
            } else if (arr[j] == max && j > val) {
                val = j;
            }
        }
        return val;
    }
    public static void freq(int num, int[] arr) {
        while (num > 0) {
            int d = num % 10;
            arr[d]++;
            num /= 10;
        }
    }
    public static void main(String[] args) {
        int[] input1 = {1237, 262, 666, 140};
        int input2 = input1.length;
        System.out.println(mostFrequentlyOccurringDigit(input1, input2));
    }
}
