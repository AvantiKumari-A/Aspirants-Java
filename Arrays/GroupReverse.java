/* 61. Group Reverse:
Given an integer array and a value d,
Reverse the first d+1 elements starting from index 0 to d, 
Then reverse the remaining elements from index d+1 to the end. 
Finally, print the combined result. 
For example, if the array is {10, 20, 30, 40, 50, 25, 35, 45} and d = 2, 
First reverse {10, 20, 30} to get {30, 20, 10}, 
Then reverse {40, 50, 25, 35, 45} to get {45, 35, 25, 50, 40}, 
And the final output is 30 20 10 45 35 25 50 40.
Input: int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }; d=2
Expected OP: 30 20 10 45 35 25 50 40*/

public class GroupReverse {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,25,35,45},b[]=new int[a.length],d=2,j=0;
        for(int i=d;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        for(int i=a.length-1;i>d;i--){
            b[j]=a[i];
            j++;
        }
        for(int k=0;k<b.length;k++){
            System.out.print(b[k]+" ");
        }
    }
}
