public class Power2 { //9(pow)2+13(pow)2+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10;
    for(int i=1,a=9;i<=n;i++,a+=4){
      sum+=Math.pow(a,2);
    }
    System.out.println(sum);
  }
}
