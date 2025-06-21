public class FirstMultipleof7 {
    public static void main(String[] args) {
        int s=30;
        for(int i=1;i<=s;i++){
            if(i%7==0){
                if(i<s)
                    s=i;
            }
        }
        System.out.println(s);
    }
}