/* 71. Minimum Subarray Sum
Given an integer array
The task is to find the sum of the minimum elements of all possible contiguous subarrays. 
For example, for the input [3, 1, 2, 4]
The possible subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
The minimums of these subarrays are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. 
Adding these gives 3 + 1 + 2 + 4 + 1 + 1 + 2 + 1 + 1 + 1 = 17, so the output is 17. */

package SubArray;
public class MinSubArraySum {
    public static void main(String[] args) {
        int a[]={3,1,2,4},sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                   if(a[k]<min)
                    min=a[k];
                }
                sum+=min;
            }
        }
        System.out.println("Minimum Subarray Sum is: " + sum);
    }
}

/* Another Method:
package SubArray;
public class MinSubArraySum {
    public static void main(String[] args) {
        int a[] = {3, 1, 2, 4}, sum = 0;
        for(int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = i; j < a.length; j++) {
                if(a[j] < min)
                    min = a[j];
                sum += min;
            }
        }
        System.out.println("Minimum Subarray Sum is: " + sum);
    }
} */