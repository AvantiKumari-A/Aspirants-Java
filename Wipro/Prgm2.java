import java.util.*;
public class Prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int th=(a/1000)%10,hd=(b/100)%10;
        int min=Integer.MAX_VALUE;
        while(c!=0){
            int d=c%10;
            if(d<min)
             min=d;
            c/=10;
        }
        System.out.println("Result: " + ((th*hd)+min));
        sc.close();
    }
}
