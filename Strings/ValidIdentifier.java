import java.util.Scanner;
public class ValidIdentifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean res=true;
        if(!((s.charAt(0)>='a'&&s.charAt(0)<='z')||(s.charAt(0)>='A'&&s.charAt(0)<='Z')||s.charAt(0)=='_')){
            res=false;
        }
        for(int i=1;i<s.length();i++){
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0' && s.charAt(i)<='9')||s.charAt(i)=='_')){
                res=false;
                break;
        }
    }
    if(res==true)
     System.out.println("Valid Identifier");
    else 
     System.out.println("Invalid Identifier");
    sc.close();   
    }
}