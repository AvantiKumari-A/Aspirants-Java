import java.util.*;
public class MiddleElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],pos=n/2;;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        if(n%2==0)
            System.out.print(a[pos-1]+" "+a[pos]);
        else
            System.out.println(a[pos]);
        sc.close();
    }
}
