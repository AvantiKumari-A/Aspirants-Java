/* i/p:361589
o/p: 31594682 */
public class OddSequenceWithCountFollowedByEvenWithCount {
 public static void main(String[] args) {
     int n=361589;
        String s=n+"";
        int[] a=new int[s.length()];
        for(int i=0;i<a.length;i++){
            a[i]=s.charAt(i)-'0';
        }
        int c1=0,c2=0;
        String s1="",s3="";
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
             s1+=a[i];
             c1++;
            }
            else{
             s3+=a[i];
             c2++;
            }
        }
        String s2=c1+"",s4=c2+"";
        String f=s1+s2+s3+s4;
        int res=Integer.parseInt(f);
        System.out.println(res);
 }   
}
