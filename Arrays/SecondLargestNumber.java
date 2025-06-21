/*
Second largest number in an array 
Input:[12, 35, 1, 10, 34, 1] 
Output:34
 */
package Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int a[]={12,35,1,10,34,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }
        System.out.println(a[a.length-2]);
    }
}
