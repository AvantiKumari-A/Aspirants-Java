public class CheckAscendingOrderOrNot { // to check digits are in order of small to large
    public static void main(String[] args) {
        int n=2379,temp=n;
        int l=n%10;
        n/=10;
        boolean res=true;
        while(n!=0){
            int d=n%10;
            if(l<d){
                res=false;
                break;
            }
            l=d;
            n/=10;
        }
        if(res)
         System.out.println(temp + " is in ascending order");
        else
         System.out.println(temp + " is not in ascending order");
    }
}
