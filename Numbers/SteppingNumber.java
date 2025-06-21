/* A number is said to be stepping number if the reduction value is 1 or -1 same like reduced subtraction
eg: 1234
  1 - 2 = -1 | 2 - 1 = 1
  2 - 3 = -1 | 3 - 2 = 1
  3 - 4 = -1 | 4 - 3 = 1
It is a stepping number since all the reduction value is 1 or -1

eg: 1346
 1 - 3 = -2
 3 - 4 = -1
 4 - 6 = -2
It is not a stepping number since all the reduction values is not 1 or -1
 */

public class SteppingNumber {
    public static void main(String[] args) {
        int n = 1346, res = 0;
        boolean result=true;
        String s = n + "";
        for (int i = 0; i < s.length() - 1; i++) {
            int x = s.charAt(i) - '0';
            int y = s.charAt(i + 1) - '0';
            res = x - y;
            if (res!= 1 || res!= -1) {
            result=false;
            break;
        }
        }
        if(result)
         System.out.println(n + " is a stepping number");
        else
         System.out.println(n+ " is not a stepping number");
    }
}
