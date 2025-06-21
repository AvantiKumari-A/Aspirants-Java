public class IncreaseDecreaseSeries { // 2/10+4/9+6/8+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10;
    for(int i=1,a=2,d=10;i<=n;i++,a+=2,d--){
      sum+=(double)a/d;
    }
    System.out.println(sum);
  }
}
