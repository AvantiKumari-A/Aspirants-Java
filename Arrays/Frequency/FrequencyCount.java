/* 62. Program to find the frequency count of every number in an array
Input={40,20,10,50,20,10,30,40}
Output:
40 -> 2
20 -> 2
10 -> 2
50 -> 1
30 -> 1 */

package Frequency;
public class FrequencyCount{
    public static void main(String[] args) {
        int a[]={40,20,10,50,20,10,30,40};
        int f[]=new int[a.length];
        for(int i=1;i<a.length;i++){
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
            if(f[i]!=-1)
                System.out.println(a[i] + " -> "+ f[i]);
        }
    }
}