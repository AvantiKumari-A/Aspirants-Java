public class ArithmeticSeries{
  public static void main(String[] args) { //1+2+3+4+..+N
    int sum=0,n=10; //i -> no of terms and a -> data
    for(int i=1,a=1;i<=n;i++,a++){
      sum+=a;
    }
    System.out.println(sum);
  }
}