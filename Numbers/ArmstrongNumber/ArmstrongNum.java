package ArmstrongNumber;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n=133,d,cube,sum=0,temp=n;
        while(n>0){
            d=n%10;
            cube=d*d*d;
            sum+=cube;
            n=n/10;
        }
        if(sum==temp)
            System.out.println(temp + " is a armstrong number");
        else
            System.out.println(temp + " is not a armstrong number");
    }
}
