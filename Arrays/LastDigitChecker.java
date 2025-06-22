public class LastDigitChecker {
    public static void main(String[] args) {
        int a[]={34,47,86,97,23,67};
        for(int i=0;i<a.length;i++){
            int d=a[i]%10;
            if(d==7)
                System.out.println(a[i]);
        }
    }
}
