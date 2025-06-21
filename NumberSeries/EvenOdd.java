public class EvenOdd {
  // 2-6+18-54..N
  public static void main(String[] args) {
    int sum=0,n=10;
    for(int i=1,a=2;i<=n;i++,a*=3){
      if(i%2==0)
       sum-=a;
      else 
       sum+=a;
    }
    System.out.println(sum);
  }
}
