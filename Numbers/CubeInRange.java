/* Given two integers a and b, 
Your task is to determine the sum of the cubes of all numbers in the range from a to b
Input a=4, b=9
output: 1989 */

public class CubeInRange {
    public static void main(String[] args) {
        int a=4,b=9,sum=0;
        for(int i=a;i<=b;i++)
         sum+=i*i*i;
        System.out.println(sum);
    }
}
