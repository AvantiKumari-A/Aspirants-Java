public class SquareStar {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){ //row
            for(int j=1;j<=n;j++){ //column
                System.out.print("* "); //gap after each star for getting square shape
            }
            System.out.println();
        }
    }
}
