public class UniqueNo {
    public static void main(String[] args) {
        int a[]={1,2,3,2,3,1,6};
        int u[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            u[a[i]]++;
        }
        for(int i=0;i<u.length;i++){
            if(u[i]==1)
                System.out.println("The unique number is: " + i);
        }
    }
}
