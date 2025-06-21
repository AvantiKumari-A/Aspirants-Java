package CountDigits;

public class CountDigitsOptimized {
    public static void main(String[] args){
        int n = 100;
        int count = (int)(Math.log10(n)+1);
        System.out.println("Count of " + n + " is: " + count);
    }
}
