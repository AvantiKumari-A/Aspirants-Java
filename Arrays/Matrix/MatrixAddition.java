package Arrays.Matrix;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] m1={{1,2},{4,5}};
        int[][] m2={{3,4},{6,7}};
        int[][] result=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<=i;j++){
                result[i][j]=m1[i][j]+m2[i][j];
            }
        }
        sc.close();
    }
}
