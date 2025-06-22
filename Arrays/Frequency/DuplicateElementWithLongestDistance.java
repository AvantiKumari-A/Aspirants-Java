/* 68. Duplicate Element with Longest Distance
Given an integer array, 
Find the duplicate element with the maximum distance between its first and last occurrence. 
Return -1 if no duplicates are found. */

package Frequency;
public class DuplicateElementWithLongestDistance {
    public static void main(String[] args) {
        int a[]={1,2,3,1,3,4,2,5,6,1}, max=Integer.MIN_VALUE, val=-1;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=a.length-1;j>i;j--){
                if(a[i]==a[j]){
                    count=j-i;
                    break;
                }
            }
            if(count>0 && count>max){
                max=count;
                val=a[i];
            }
        }
        System.out.println(val);
    }
}
