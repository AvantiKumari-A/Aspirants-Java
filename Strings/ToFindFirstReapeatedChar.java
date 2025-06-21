public class ToFindFirstReapeatedChar {
    public static void main(String[] args) {
        String s="prasanna";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)=='a'&& s.charAt(j)=='a'){
                    System.out.println("First value of char "+ s.charAt(i)+" found at index value "+ j);
                    return; 
                }
            }
        }
    }
}