public class CountSpaceWordChar {
    public static void main(String[] args) {
        String s1=" welcome to ".trim();
        int scount=0,ccount=0,wcount=0;
        char c[]=s1.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==' ')
             scount++;
            if(c[i]!=' ')
             ccount++;
            if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
             wcount++;
        }
        System.out.println(scount);
        System.out.println(ccount);
        System.out.println(wcount);
    }
}
