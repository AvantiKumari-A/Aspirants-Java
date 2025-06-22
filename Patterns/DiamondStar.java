/* 150 -> 55
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/

public class DiamondStar {
   public static void main(String[] args) {
    int n=5;
    for(int i=1;i<n;i++){ // hill star pattern
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=n;i++){ // reverse hill star pattern
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=i;j<n;j++){
            System.out.print("*");
        }
        for(int j=i;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   } 
}
