public class PrintingPositiveValuesUsingArrays {
    public static void main(String[] args) {
        int [] n = {-1,-2,0,3,-4};
        for(int i=0;i<n.length;i++){
            if(n[i]<0)
            continue;
            System.out.println(n[i]);
        }
    }
}
