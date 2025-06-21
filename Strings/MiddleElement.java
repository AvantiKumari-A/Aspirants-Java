public class MiddleElement {
    public static void main(String[] args) {
        String s1="abcd";
        int pos;
        if(s1.length()%2==0){
            pos=s1.length()%2-1;
            System.out.println(s1.charAt(pos) + s1.charAt(pos+2));
        }
        else{
            pos=s1.length()%2;
            System.out.println(s1.charAt(pos));
        }
    }
    
}
