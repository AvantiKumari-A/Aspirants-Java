package CountDigits;

import java.util.Scanner;
public class Countdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Count of digits is: " + count);
        sc.close();
    }
}

/* Optimized:
public class CountdigitsOptimized{
 public static void main(String[] args){
   int n = 100;
   int count = (int)(Math.log10(n)+1);
   System.out.println("Count of " + n + " is: " + count);
}
}
 */