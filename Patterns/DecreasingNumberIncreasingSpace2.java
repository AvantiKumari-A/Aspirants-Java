/* 150 -> 48
no=5
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

public class DecreasingNumberIncreasingSpace2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1,k=n;i<=n;i++,k--){
            int p=k;
            for(int j=i;j<=n;j++){
                System.out.print(p--+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
