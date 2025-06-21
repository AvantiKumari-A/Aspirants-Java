package Arrays;

public class MinMax {
    public static void main(String[] args) {
        int a[]={12,6,90,36,10,65,98};
        int l=0,s=9;
        for(int i=0;i<a.length;i++){
            if(a[i]>l)
                l=a[i];
            if(a[i]<s)
                s=a[i];
        }
        System.out.println("Maximum number: " + l);
        System.out.println("Minimum number: " + s);
    }
}
