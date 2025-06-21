public class GeometricSeries2 { // a/2+a/4+a/8+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10,a=1;
    for(int i=1,d=2;i<=n;i++,d*=2){
      sum+=(double)a/d;
    }
    System.out.println(sum);
  }
}
