public class DuplicateNo {
    public static void main(String[] args) {
        int a[]={1,2,3,2};
        int d[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            d[a[i]]++;
        }
        for(int i=0;i<d.length;i++){
            if(d[i]>1)
                System.out.println("The duplicate number is: " + i);
        }
    }
}
