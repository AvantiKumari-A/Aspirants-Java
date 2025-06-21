package Arrays;
//the square of number should be in that array
public class DoubleMeal {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 4, 8};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int num = a[i]*a[i];
            for(int j=i+1;j<a.length;j++){
                if(num == a[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}