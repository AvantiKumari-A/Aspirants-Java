// a no is said to strong no: if the sum of factorial of each digit is equal to the number
public class StrongNumber {
    public static void main(String[] args) {
        int n = 145, digit, sum=0, temp=n;
        while(n>0){
            digit = n%10;
            int d = fact(digit);
            sum+=d;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp + " is a strong number");
        else
            System.out.println(temp + " is not a strong number");
    }
    public static int fact(int d){
        int fact=1;
        for(int i=2;i<=d;i++){
            fact*=i;
        }
        return fact;
    }
}
