public class SecondLargest {
    public static void main(String[] args) {
        int a=14532;
        int sl = secondlargest(a);
        System.out.println("The second largest number is: " + sl);
    }
    public static int largest(int n){
        int l=0;
        while(n>0){
            int d=n%10;
            if(d>l)
                l=d;
            n/=10;
        }
        return l;
    }

    public static int secondlargest(int n){
        int l=largest(n),sl=0;
        while(n>0){
            int d=n%10;
            if(d<l && d>sl)
                sl=d;
            n/=10;
        }
        return sl;
    }
}
