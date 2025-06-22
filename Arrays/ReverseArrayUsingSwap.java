public class ReverseArrayUsingSwap {
    public static void reverse(int a[]){
        int i=0,j=a.length-1,temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14};
        reverse(a);
        System.out.println("Reversed Array: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
