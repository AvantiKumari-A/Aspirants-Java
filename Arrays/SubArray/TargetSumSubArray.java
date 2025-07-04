/* Statement: Find All Subarrays with a Target Sum
Description:Given an array of integers and a target sum, 
Find all the subarrays within the array that sum to the target value. 
A subarray is defined as a contiguous sequence of elements within the array 
I/P: Arr[3,4,-7,1,3,3,1,-4] Targetsum: 7
O/P: 
3 4 
3 4 -7 1 3 3
1 3 3
3 3 1*/
package SubArray;
public class TargetSumSubArray {
    public static void main(String[] args) {
        int a[]={3,4,-7,1,3,3,1,-4},target=7;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==target){
                    for(int k=i;k<=j;k++)
                     System.out.print(a[k]+" ");
                    System.out.println();
                }
            }
        }
    }
}
