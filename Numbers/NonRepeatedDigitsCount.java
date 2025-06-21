public class NonRepeatedDigitsCount { // return the count of non repeated digits 
    public static void main(String[] args) {
        int n=292; // 9 is the one number which is non repeated so it will return count as 1
        System.out.println(count(n));
    }
    public static int count(int n){
        int a[] = new int[10];
        while (n!=0) {
            int d=n%10;
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