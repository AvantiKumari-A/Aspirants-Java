public class LargestSmallest {
    public static void main(String args[]){
        int n=123,l=0,s=9;
        while(n>0){
            int d=n%10;
            if(d>l)
                l=d;
            if(d<s)
                s=d;
            n=n/10;
        }
        System.out.println("Largest: " + l + " Smallest: " + s);
    }
}
