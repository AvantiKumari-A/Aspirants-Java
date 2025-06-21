/* It is same as non repeated digits count
But here it will take the first count of repeated digit
 eg: 292 it will take the first count of repeated digit 2 after that it will not take the count of 2nd repeated digit 2
 It will return count as 2 for 2,9 */
public class UniqueDigitsCount {
    public static void main(String[] args) {
        int n=292; // 9 is the one number which is non repeated so it will return count as 1
        System.out.println(count(n));
    }
    public static int count(int n){
        int a[] = new int[10];
        while (n!=0) {
            int d=n%10;
            if(a[d]!=1)
             a[d]++;
            n/=10;
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
             count++;
        }
        return count;
    }
}