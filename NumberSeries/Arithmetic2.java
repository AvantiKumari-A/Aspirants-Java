/* Same for
1+3+5+7+...+N series (increment 2) */
public class Arithmetic2{
  public static void main(String[] args) { //9+13+17+..+N
    int sum=0, n=10;
    for(int i=1,a=9;i<=n;i++,a+=4){
      sum+=a;
    }
    System.out.println(sum);
  }
}