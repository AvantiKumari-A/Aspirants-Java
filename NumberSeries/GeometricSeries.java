public class GeometricSeries { // 2+6+18+54+..+N
  public static void main(String[] args) {
    double sum=0;int n=10;
    for(int i=1,a=2;i<=n;i++,a*=3){
      sum+=a;
    }
    System.out.println(sum);
  }
}
