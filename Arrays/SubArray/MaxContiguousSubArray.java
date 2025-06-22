/* 65. Max Contiguous Subarray
Given an integer array
The task is to find the sum of the contiguous subarray that has the largest sum. 
For example, with input [-2, 1, -3, 4, -1, 2, 1, -5, 4]
The contiguous subarray [4, -1, 2, 1] has the maximum sum, which is 6. 
So the output is 6. 

70. Maximum subarray sum 
Input: arr[] = {2, 3, -8, 7, -1, 2, 3} 
Output: 11 Explanation: 
The subarray {7, -1, 2, 3} has the largest sum 11. */

package SubArray;
public class MaxContiguousSubArray {
    public static void main(String[] args) {
        int a[]={2,3,-8,7,-1,2,3},max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                if(sum>max)
                 max=sum;
            }
        }
        System.out.println("Maximum subarray sum is: " + max);
    }
}
