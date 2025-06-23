/*
57. Second largest number in an array 
Input:[12, 35, 1, 10, 34, 1] 
Output:34
 */

/* 146. Find second largest element in an array 
 Given an array of N integers
 We have to find its second largest element using Java program. 
 Input: Enter number of elements: 4 
 Input elements: 45, 25, 69, 40 
 Output: Second largest element in: 45 */

public class SecondLargestNumber {
    public static void main(String[] args) {
        int a[]={12,35,1,10,34,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }
        System.out.println(a[a.length-2]);
    }
}

/* SecondMaximumElement -> Another Method Using Arrays.Sort()

import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),max=Integer.MIN_VALUE,count=0;
       int a[]=new int[n];
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       System.out.println(a[a.length-2]);
    }
} */