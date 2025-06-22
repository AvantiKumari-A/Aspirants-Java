/* 73. Finding Frequency of Duplicate elements in an array 
Input : arr[] = {10, 20, 20, 10, 10, 20, 5, 20} 
Output : 
10 3 
20 4 */
package Frequency;
public class FrequencyOfDuplicateElements{
    public static void main(String[] args) {
        int a[]={10,20,20,10,10,20,5,20};
        int f[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(f[i]==-1)
             continue;
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                 count++;
                 f[j]=-1;
                }
            }
            f[i]=count;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]>1)
             System.out.println(a[i] + " " + f[i]);
        }
    }
}