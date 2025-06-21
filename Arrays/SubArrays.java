package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        for(int i=0;i<n.length;i++){ // i = left
            for(int j=i;j<n.length;j++){ // j = right
                for(int k=i;k<=j;k++){ // k is used for printing sub array values
                    System.out.print(n[k] + " ");
                }
                System.out.println();
            }
        }
    }
}