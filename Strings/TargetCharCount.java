public class TargetCharCount {
    public static void main(String[] args) { // to count the presence of target value in the given string
        String s="abada";
        String target="a";
        int a=s.length(); // 5
        int b=s.replace("a", "").length(); // remaining bd so 2
        int count=a-b;
        System.out.println("Count of "+ target + " is : " + count);
    }
}