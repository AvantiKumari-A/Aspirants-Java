/* 66. Rotate an array by ‘N’ positions 
Array:[1, 2, 3, 4, 5] 
Input: N = 2 
Output:[3, 4, 5, 1, 2] */

package ArrayRotation;
public class RotateArrayByNPositions {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        int n=2,j=0;
        for(int i=n;i<a.length;i++){
            b[j++]=a[i];
        }
        for(int i=0;i<n;i++){
            b[j++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
