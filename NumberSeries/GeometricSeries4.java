public class GeometricSeries4{ // a+2/10 +a+4/30+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10,a=1;
    for(int i=1,k=2,d=10;i<=n;i++,a*=2,d*=3){
      sum+=(double)(a+k)/d;
    }
    System.out.println(sum);
  }
}