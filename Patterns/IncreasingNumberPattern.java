/* 150 -> 43
no=5
1
12
123
1234
12345
*/

public class IncreasingNumberPattern {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       } 
    }
}

/* Another Method
public class IncreasingNumberPattern {
    public static void main(String[] args) {
      int n=5;
      for(int i=1; i<=n; i++){
         int p=1;
         for(int j=1; j<=i; j++){
            System.out.print(p++ +" ");
         }
         System.out.println();
     }
   }
}
 */