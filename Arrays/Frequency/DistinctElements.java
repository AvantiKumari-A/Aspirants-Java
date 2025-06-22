/* 75. Find distinct elements in an array
Given an integer array arr[], the task is to print all the distinct elements present in the array. 
That means, even if an element appears multiple times, it should be printed only once in the output. 
For example, if the input is {12, 10, 9, 45, 2, 10, 10, 45}
Then the distinct elements are {12, 10, 9, 45, 2} 
Because each value is listed only once in the output
Even though 10 and 45 appear multiple times in the input. */

package Frequency;
public class DistinctElements {
    public static void main(String[] args) {
        int a[]={12,10,9,45,2,10,10,45};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                 a[j]=0;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
