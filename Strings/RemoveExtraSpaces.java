 // s.trim() method is used to remove the spaces at the beginning and end of the string
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s1="I    am   raja";
        String s2="";
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)!=' ')
             s2+=s1.charAt(i);
            else if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
             continue;
            else
             s2+=s1.charAt(i);
        }
        System.out.println(s2);
    }
}