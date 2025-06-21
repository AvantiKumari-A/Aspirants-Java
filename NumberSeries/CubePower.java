public class CubePower { //1(cube)/n+3(cube)/n+..+N
  public static void main(String[] args) {
    double sum=0;
    int n=10;
    for(int i=1,a=1;i<=n;i++,a+=2){
      sum+=Math.pow(a,3)/3;
    }
    System.out.println(sum);
  }
}
