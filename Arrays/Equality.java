public class Equality {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};
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
            System.out.println("Both the arrays are equal");
        else
            System.out.println("Both the arrays are not equal");
    }
}
