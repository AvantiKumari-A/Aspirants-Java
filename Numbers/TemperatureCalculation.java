/*Ramanan is an aspiring meteorologist who is working on a weather application. 
He needs your help to create a program that converts temperatures from Fahrenheit to Celsius.
Write a program to assist Ramanan in this task.

Formula:
°C = (°F - 32) × 5/9

Input format :
The input consists of a double value, representing the temperature in Fahrenheit.

Output format :
The output prints "Equivalent temperature in Celsius: " followed by a double value, representing the equivalent temperature in Celsius, rounded off to exactly two decimal places.

Refer to the sample output for formatting specifications.
Code constraints :
32.0 ≤ fahrenheit ≤ 273.0

Sample test cases :
Input 1 :
98.6
Output 1 :
Equivalent temperature in Celsius: 37.00

Input 2 :
32.0
Output 2 :
Equivalent temperature in Celsius: 0.00 */

import java.util.Scanner;
public class TemperatureCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();
        double c=(f-32)*(5.0/9.0);
        System.out.printf("Equivalent temperature in Celsius: %.2f", c); // to use %.2f printf is used
        sc.close();
    }
}
