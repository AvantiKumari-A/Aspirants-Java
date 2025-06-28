/* 90. Given an array arr[] of size n and an integer k, 
The task is to insert a duplicate of k adjacent to its every occurrence. 
Every time k appears in the array, you need to insert a duplicate of k immediately after it. 
However, the total size of the array must remain the same as the original. 
So, after inserting duplicates, you must remove the extra elements from the end of the array 
To keep the length unchanged.
Keep array's original length same by removing the elements from the back. 
Input: arr[] = [1, 0, 2, 3, 0, 4, 5, 0], K = 0 
Output: [1, 0, 0, 2, 3, 0, 0, 4] */

public class KDuplicationInArray {
    public static void main(String[] args) {
        int a[]={1,0,2,3,0,4,5,0},k=0,b[]=new int[a.length],j=0;
        for(int i=0;i<b.length;i++){
            b[i]=a[j];
            if(a[j]==k && i!=b.length-1){
                b[i+1]=k;
                i++;
            }
            j++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
