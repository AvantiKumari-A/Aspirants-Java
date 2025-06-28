/* 89. You are given an array arr, and your task is to find the majority element 
An element that occurs more than half the length of the array (i.e., arr.size() / 2). 
If such an element exists return it, otherwise return -1, indicating that no majority element is present. 
Input : arr[] = [1, 1, 2, 1, 3, 5, 1] 
Output : 1 */

package Frequency;
public class MajorityElement {
    public static void main(String[] args) {
        int a[]={1,1,2,1,3,5,1},max=FindMax(a);
        int freq[]=new int[max+1],n=a.length/2,res=-1;
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>n){
             res=i;
            }
        }
        System.out.println(res);
    }
    public static int FindMax(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
             max=a[i];
        }
        return max;
    }
}
