/* 67. Product of Array Except Self
Given an array of integers, return a new array such that each element at index i is the product of all elements in the array except the one at i.
Example: Input: [1, 2, 3, 4, 5] → Output: [120, 60, 40, 30, 24]
Explanation: 
For index 0, exclude 1 → 2×3×4×5 = 120; 
For index 1, exclude 2 → 1×3×4×5 = 60; and so on.
Another example: Input: [3, 2, 1] → Output: [2, 3, 6] */

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5},b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int mul=1;
            for(int j=0;j<a.length;j++){
                if(i==j)
                 continue;
                else
                mul*=a[j];
            }
            b[i]=mul;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
