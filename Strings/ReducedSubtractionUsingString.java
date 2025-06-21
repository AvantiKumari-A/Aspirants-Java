public class ReducedSubtractionUsingString {
    public static void main(String[] args) {
        int n=1234;
        while(n>9){
            int rev=0;
            // Convert number to one string
            String s1=n+""; // Or String.valueOf()
            for(int i=0;i<s1.length()-1;i++){
                int a=s1.charAt(i)-'0'; // (- '0') converts string to one number
                int b=s1.charAt(i+1)-'0';
                rev=(rev*10)+Math.abs(a-b);
            }
            n=rev;
        }
        System.out.println("Rediced subtraction: " + n);
    }
}
