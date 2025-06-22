/* Write a program that takes user income and a series of expenses, then calculates: 
1)Total income 
2)Total expenses 
3)Total savings 
4) Break down of expense by category 
  ex: Income:1000 
Type of expense: food Price of food/transport/shopping: 200 */
import java.util.*;
public class SalaryExpensesSavingsCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total income:");
        int salary = sc.nextInt();
        System.out.println("Enter the count of expenses:");
        int count = sc.nextInt();
        sc.nextLine();
        /* Reason for using sc.nextLine()
        One clears the leftover newline after reading count.
        One clears the leftover newline after reading each amount.
        Each time you use nextInt() followed by nextLine()
        You must insert sc.nextLine() to flush the newline in between, or your input will be skipped. */
        String[] names = new String[count];
        int[] amounts = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter type of expense " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter amount for " + names[i] + ": ");
            amounts[i] = sc.nextInt();
            sc.nextLine();
            sum += amounts[i];
        }
        int savings = salary - sum;
        System.out.println();
        System.out.println("----- Summary -----");
        System.out.println("Total Salary: " + salary);
        System.out.println("Total Expenses: " + sum);
        System.out.println("Savings: " + savings);
        System.out.println("Break Down of Expenses:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + ": " + amounts[i]);
        }
        sc.close();
    }
}