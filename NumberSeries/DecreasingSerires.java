public class DecreasingSerires { //10+9+8+7+..+1
 public static void main(String[] args) {
  int sum=0,n=10;
  for(int i=1,a=10;i<=n;i++,a--){
    sum+=a;
  }
  System.out.println(sum);
 } 
}
