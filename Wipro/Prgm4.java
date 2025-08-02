import java.util.*;
public class Prgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=sc.nextInt();
        System.out.println((Key(a)+Key(b)+Key(c))-d);
        sc.close();
    }
     public static int Key(int num) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        while (num>0) {
            int d = num % 10;
            if (d>max)
                max=d;
            if (d<min)
                min = d;
            num/=10;
        }
        return (max*min);
}
}
