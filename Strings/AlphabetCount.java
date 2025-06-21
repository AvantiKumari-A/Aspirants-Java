public class AlphabetCount {
    public static void main(String[] args) {
        String s="India@12345";
        int count=0;
        //Method1
        String data=s.replaceAll("[^a-zA-Z]", "");
        System.out.println(data.length());
        //Method2
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a'&&s.charAt(i)=='z')||(s.charAt(i)=='A'&&s.charAt(i)=='Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
