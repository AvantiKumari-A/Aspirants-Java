import java.util.*;
public class Prgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=sc.nextInt();
        System.out.println((max(a)*max(b)*max(c))+d);
        sc.close();
    }
    public static int max(int num){
        int max=Integer.MIN_VALUE;
        while(num>0){
            int d=num%10;
            if(d>max)
             max=d;
            num/=10;
        }
        return max;
    }
}
