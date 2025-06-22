import java.util.Scanner;
public class MinimumXorAfterSplittingOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=OrXor(n,arr);
        System.out.println(res);
        sc.close();
    }
    public static int OrXor(int a,int arr[]){
        int minXor=Integer.MAX_VALUE;
        for(int i=1;i<a;i++){
            int lor=0;
            for(int j=0;j<i;j++){
                lor|=arr[j];
            }
            int ror=0;
            for(int j=i;j<a;j++){
                ror|=arr[j];
            }
            int xor= lor ^ ror;
            if(xor < minXor)
                minXor=xor;
        }
        return minXor;
    }
}
