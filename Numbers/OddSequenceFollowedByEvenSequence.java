/* i/P:361589
o/p: 315968 */
public class OddSequenceFollowedByEvenSequence{
    public static void main(String[] args) {
         int n=361589;
        String s=n+"";
        String s1="",s2="";
        int[] a=new int[s.length()];
        for(int i=0;i<a.length;i++){
            a[i]=s.charAt(i)-'0';
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
             s1+=a[i];
            else
             s2+=a[i];
        }
        String s3=s1+s2;
        int num=Integer.parseInt(s3);
        System.out.println(num);
    }
}