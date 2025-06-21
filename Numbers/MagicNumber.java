// sum of all no a = 10 then 1 + 0 = 1 if no is 1 then it is magic no
public class MagicNumber {
    public static void main(String[] args) {
        int a=1234,d,sum=0,t=a;
        while(a>0){
            d=a%10;
            sum+=d;
            a/=10;
            if(sum>=10 && a==0){
                a=sum;
                sum=0;
            }
        }
        if(sum==1)
            System.out.println(t + " is a magic number");
        else
            System.out.println(t + " is not a magic number");
    }
}
