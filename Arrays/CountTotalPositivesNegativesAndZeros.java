/* 148. Count total positives, negatives and zeros from an array 
 Given an array of integers and we have to count total negatives, positives and zeros using java program. 
 Input: Array elements: 20, -10, 15, 00, -85 
 Output: 
 Positive Numbers are: 2 
 Negative Numbers are: 2 
 Zeros are: 1 */

import java.util.*;
public class CountTotalPositivesNegativesAndZeros {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),pcount=0,ncount=0,zcount=0;
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
           if(a[i]<0)
            ncount++;
           else if(a[i]>0)
            pcount++;
           else
            zcount++;
       }
       System.out.println("Positive Numbers are: " + pcount);
       System.out.println("Negative Numbers are: "+ ncount);
       System.out.println("Zeros are: "+zcount);
       sc.close();
    }
}
