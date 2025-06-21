public class FirstMultipleOf7UsingArray {
    public static void main(String[] args) {
        int [] n = {49,28,15,19,23,14,21};
        int m = 49;
        for(int i=0;i<n.length;i++){
            if(n[i]%7==0){
                if(n[i]<m)
                m=n[i];
            }
        }
        System.out.println(m);
    }
}
