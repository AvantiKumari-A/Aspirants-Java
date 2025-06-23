/* 147. Find second smallest element in an array 
 Given an array of N integers 
 We have to find its second minimum/smallest element using Java program. 
 Input: Enter number of elements: 4 
 Input elements: 45, 25, 69, 40 
 Output: Second smallest element in: 40  */

import java.util.*;
public class SecondMinimumElement {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       System.out.println(a[1]);
       sc.close();
    }
}
