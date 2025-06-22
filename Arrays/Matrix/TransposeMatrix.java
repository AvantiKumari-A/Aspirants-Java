package Matrix;
import java.util.Scanner;
public class TransposeMatrix {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the r1 value: ");
    int r1=sc.nextInt();
    System.out.println("Enter the c1 value: ");
    int c1=sc.nextInt();
    int[][] m=new int[r1][c1];
    int[][] tr=new int[r1][c1];
    System.out.println("Enter the value of matrix");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            m[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            tr[i][j]=m[j][i];
        }
    }
    System.out.println("Transpose Matrix: ");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            System.out.print(tr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}   
}
