/* 78. Check if 2 Arrays are equal or not. 
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1] 
Output: true
 */
public class EqualityCheckingOfTwoArrays {
    public static void main(String[] args) {
        int a[]={1,2,5,4,0};
        int b[]={2,4,5,0,1};
        int count=0;
        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j])
                        count++;
                }
            }
        }
        if(count==a.length && count==b.length)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
