/* 150 -> 45
no=5
12345
1234
123
12
1
 */
public class DecreasingNumberIncreasingSpace {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
        int p=1;
        for(int j=i;j<=n;j++){
            System.out.print(p++);
        }
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
       } 
    }
}
