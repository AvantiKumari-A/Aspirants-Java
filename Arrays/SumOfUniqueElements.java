/* What's the sum of unique elements in an array?
Example:
Input: array = [1,3,2,3,2,4]
Output: 10 */

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int a[]={1,3,2,3,2,4},sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                 a[j]=0;
            }
            sum+=a[i];
        }
        System.out.println("Sum of Unique Elements in the Array is: "+sum);
    }
}
