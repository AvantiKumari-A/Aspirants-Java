public class FirstNonRepeated {
    public static void main(String[] args) {
        String s="prasanna";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    System.out.println("First non repeated char value "+ s.charAt(i)+" found at index value "+ j);
                    return; 
                }
            }
        }
    }
}
