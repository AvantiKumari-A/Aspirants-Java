import java.util.*;
class Prgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] maxMinA = getMaxMin(a);
        int[] maxMinB = getMaxMin(b);
        int[] maxMinC = getMaxMin(c);
        int max_sum = maxMinA[0]+maxMinB[0]+maxMinC[0];
        int min_sum = maxMinA[1]+maxMinB[1]+maxMinC[1];
        System.out.println("Result: " + (max_sum-min_sum));
        sc.close();
    }
    public static int[] getMaxMin(int num) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        while (num>0) {
            int d = num % 10;
            if (d>max)
                max=d;
            if (d<min)
                min = d;
            num/=10;
        }
        return new int[]{max, min};
    }
}