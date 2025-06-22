/*
56. Missing number in an array of shuffled order 
Input:[3, 7, 1, 2, 8, 4, 5] 
Output:6
 */
public class MissingNumberInAArray {
     public static void main(String[] args) {
        int a[]={3,7,1,2,8,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int sum=a[0];
        for(int i=0;i<a.length;i++){
            if(sum!=a[i]){
             System.out.println(sum);
             return;
            }
            sum++;
        }
        }
}
