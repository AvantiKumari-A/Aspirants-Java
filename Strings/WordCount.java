public class WordCount {
    public static void main(String[] args) {
        String s="i am raja";
        int wcount=0;
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
         wcount++;
        System.out.println(wcount);
    }
}
