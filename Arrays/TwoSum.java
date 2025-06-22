/* 82. Two Sum:
Given an array of integers arr[] and an integer target 
Return the indices of the two numbers such that they add up to the target.
Input: arr[] = {0, -1, 2, -3, 1}, target = -2
Output: 3 4
Explanation: There is a pair (-3, 1) with the sum equal to the given target. -3 + 1 = -2. */

public class TwoSum {
    public static void main(String[] args) {
        int a[]={0,-1,2,-3,1},target=-2;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]+a[j])==target)
                 System.out.println(i + " " + j);
            }
        }
    }
}
