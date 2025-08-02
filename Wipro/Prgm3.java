import java.util.*;
public class Prgm3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int th1=(a/1000)%10,th2=(b/1000)%10,th3=(c/1000)%10;
        int h1=(a/100)%10,h2=(b/100)%10,h3=(c/100)%10;
        int t1=(a/10)%10,t2=(b/10)%10,t3=(c/10)%10;
        int u1=a%10,u2=b%10,u3=c%10;
        int res1=(th1<th2 && th1<th3)?th1:(th2<th1 && th2<th3)?th2:th3;
        System.out.print("Result: " + res1);
        int res2=(h1<h2 && h1<h3)?h1:(h2<h1 && h2<h3)?h2:h3;
        System.out.print(res2);
        int res3=(t1<t2 && t1<t3)?t1:(t2<t1 && t2<t3)?t2:t3;
        System.out.print(res3);
        int res4=(u1<u2 && u1<u3)?u1:(u2<u1 && u2<u3)?u2:u3;
        System.out.print(res4);
        sc.close();
    }
}
