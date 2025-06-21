// same for 2(pow)n+4(pow)n+..+N where n=2
public class PowerSeries { // a(pow)1+a(pow)2+a(pow)3+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10,a=1;
    for(int i=1,p=1;i<=n;i++,p++){
      sum+=Math.pow(a,p); // pow returns values ad double so sum is given as double
    }
    System.out.println(sum);
  }
}
