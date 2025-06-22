public class RightAngleTraingle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){ //decreasing space
                System.out.print("  "); //2 space for right angle traingle and 1 space for pyramid
            }
            for(int j=1;j<=i;j++){ // increasing
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
