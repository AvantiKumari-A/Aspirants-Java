package Arrays;
public class PrintingAsciiValue {
    public static void main(String[] args) {
        char a[]={'R','a','z','A','Z'};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " Ascii value is: " + (int)a[i]);
        }
    }
}
