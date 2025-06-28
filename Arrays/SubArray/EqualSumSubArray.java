/* 87. Given an array of integers greater than zero, 
Find if it is possible to split it in two subarrays (without reordering the elements), 
Such that the sum of the two subarrays is the same. 
Print the two subarrays.
Input: Arr[] = { 1 , 2 , 3 , 4 , 5 , 5 } 
Output: { 1 2 3 4 } { 5 , 5 } */

package SubArray;
public class EqualSumSubArray{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5},totalSum=0,leftSum=0,rightSum=0;
        for(int i=0;i<a.length;i++){
            totalSum+=a[i];
        }
        for(int i=0;i<a.length;i++){
            leftSum+=a[i];
            rightSum=totalSum-leftSum;
            if(leftSum==rightSum){
                for(int j=0;j<=i;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println();
                for(int j=i+1;j<a.length;j++){
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}