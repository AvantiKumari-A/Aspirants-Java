/* 88. Given an array of size N where the array elements contain values from 1 to N with duplicates, 
The task is to find the total number of subarrays that start and end with the same element. 
A subarray is a contiguous portion of the array. 
We go through all possible subarrays and check if the first and last elements are equal. 
The valid subarrays are: [1], [1, 2, 1], [2], [2, 1, 5, 2], [1], [5], [2]. 
So, the total number of such subarrays is 7.

Input: A[] = {1, 2, 1, 5, 2} 
Output: 7  */

package SubArray;
public class ValidSubArray {
    public static void main(String[] args) {
    int a[]={1,2,1,5,2},res=0;
    for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
            if(a[i]==a[j])
             res++;
        }
    }
    System.out.println(res);
    }
}
