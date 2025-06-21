/*
Remove all duplicates in an array sample input and output 
Input:[1, 2, 2, 3, 4, 4, 5] 
Output:[1, 2, 3, 4, 5]
 */
package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]==a[i])
                 a[j]=0;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
             System.out.print(a[i]+" ");
        }
    }
}
