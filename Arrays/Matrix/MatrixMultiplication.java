package Matrix;
import java.util.Scanner;
public class MatrixMultiplication {   
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the r1 value: ");
    int r1=sc.nextInt();
    System.out.println("Enter the c1 value: ");
    int c1=sc.nextInt();
    System.out.println("Enter the r2 value: ");
    int r2=sc.nextInt();
    System.out.println("Enter the c2 value: ");
    int c2=sc.nextInt();
    int[][] m1=new int[r1][c1];
    int[][] m2=new int[r2][c2];
    int[][] result=new int[r1][c2];
    if(c1==r2){
        System.out.println("Enter the value of Matrix1: ");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            m1[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the values of Matrix2: ");
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            m2[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0;k<c1;k++){
                result[i][j]+=m1[i][k]+m2[k][j];
            }
        }
    }
    System.out.println("Matrix Multiplication Result: ");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
    }
    sc.close();
    }
}
