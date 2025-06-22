/* 150 -> 51
n=5
E D C B A 
D C B A   
C B A     
B A       
A     
*/

public class AlphabetDecreasing{
    public static void main(String[] args) {
         int n=5;
        for(int i=1,k='E';i<=n;i++,k--){
            int p=k;
            for(int j=i;j<=n;j++){
                System.out.print((char)p--+" ");
            }
            System.out.println();
        }
    }
}