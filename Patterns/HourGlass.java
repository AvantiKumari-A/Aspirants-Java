/* 150 -> 53
n=8 
* * * * * * * * 
 * * * * * * * 
  * * * * * * 
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
*/

public class HourGlass {
    public static void main(String[] args) {
        int n = 8;

        // Top Half - Reverse Hill (Inverted Triangle)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i; j++) { //increasing space
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) { //decreasing
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom Half - Hill (Normal Triangle)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) { //decreasing space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { //increasing
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
