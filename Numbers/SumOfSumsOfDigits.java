/* Sum of Sums of Digits in Cyclic order: Alex has been asked by his teacher to do an assignment on sums of digits of a number. 
The assignment requires Alex to find the sum of sums of digits of a given number, as per the method mentioned below.
If the given number is 582109
The Sum of Sums of Digits will be calculated as 
 = (5+8+2+1+0+9)+(8+2+1+0+9)+(2+1+0+9)+(1 +0+9)+(0+9)+(9)
 =  25+20+12+10+9+9
 = 85

Alex contacts you to help him write a program for finding the Sum of Sums of Digits for any given number, using the above method. 
Help Alex by completing the logic in the given function sumOfSumsOfDigits which takes as input an integer input1 representing the given number.
The function is expected to return the "Sum of Sums of Digits" of input1.
Assumptions: For this assignment, let us assume that the given number will always contain more than 1 digit, i.e. the given number will always be >9. */

public class SumOfSumsOfDigits {
    public static int sumOfSumsOfDigits(int input1) {
        int sum = 0;
        String s = input1 + "";
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int input = 582109;
        int result = sumOfSumsOfDigits(input);
        System.out.println("Sum of Sums of Digits: " + result);
    }
}