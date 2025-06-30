package SubArray;
public class MinimumSumInSubArray {
     public static void main(String[] args) {
        int a[]={3,-4,2,-3,-1,7,-5},min=Integer.MAX_VALUE,start=0,end=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                if(sum<min){
                 min=sum;
                 start=i;
                 end=j;
                }
            }
        }
        System.out.println("Manimum subarray and its sum is ");
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(" => "+ min);
    }
}
