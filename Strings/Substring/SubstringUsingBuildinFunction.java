package Substring;
public class SubstringUsingBuildinFunction {
    public static void main(String[] args) {
        String s1="sak";
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                System.out.println(s1.substring(i, j));
            }
        }
    }
}
