package Prime;
import java.util.Scanner;
public class NthPrimeNumber{ // if n is 1 return the 1st prime number which is 2 and if the n is 10 return the 10th prime number which is 29
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int res=nthprime(n);
        System.out.println(res);
        sc.close();
    }
    public static int nthprime(int n){
        int count=0,num=1;
        while(count<n){
            num++;
            if(prime(num))
             count++;
        }
        return num;
    }
    public static boolean prime(int num){
        if(num<=1)
         return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
             return false;
        }
        return true;
    }
}