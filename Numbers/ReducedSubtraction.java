/* 2 digit reduced subtracted form
I/P: 6928
 6 - 9 = 3
 9 - 2 = 7
 2 - 8 = 6
O/p: 376 Not 2 digit num
Again perform RS
 3 - 7 = 4
 7 - 6 = 1
O/P:41 */

public class ReducedSubtraction {
    public static void main(String[] args) {
        int n=6928,rev=0;
        while(n>=100){
            rev=0;
            String s=n + "";
            for(int i=0;i<s.length()-1;i++){
                int d1=s.charAt(i) - '0';
                int d2=s.charAt(i+1) - '0';
                rev=(rev*10)+Math.abs(d1-d2);
            }
            n=rev;
        }
        System.out.println(rev);
    }
}

/* 
    public static void main(String[] args) {
        int n=123,s=n%10,rev=0;
        n/=10;
        while(n>0){
            int d=n%10;
            s=Math.abs(d-s);
            rev=(rev*10)+s;
            n/=10;
            if(rev>=10 && n==0){
                n=rev;
                rev=0;
            }
        }
        System.out.println("Reduced subtraction: " + rev);
    }
    
}
*/