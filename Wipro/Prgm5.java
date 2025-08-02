import java.util.*;
public class Prgm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=sc.nextInt();
        if(d%2==0)
         System.out.println(even(a)+even(b)+even(c));
        else
         System.out.println(odd(a)+odd(b)+odd(c));
        sc.close();
    }
    public static int even(int num){
        int sum=0;
        while(num!=0){
            int d=num%10;
            if(d%2==0)
             sum+=d;
            num/=10;
        }
        return sum;
    }
    public static int odd(int num){
        int sum=0;
        while(num!=0){
            int d=num%10;
            if(d%2!=0)
             sum+=d;
            num/=10;
        }
        return sum;
    }
}
