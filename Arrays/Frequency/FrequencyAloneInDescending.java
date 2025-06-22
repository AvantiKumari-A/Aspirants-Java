/* 60: Frequency count with descending order printing
Given an array int a[] = {50, 20, 150, 20, 50, 10, 30, 10, 10};
The task is to count how many times each unique number appears in the array
Print the frequency of each number in descending order based on the count. 
If two numbers have the same frequency, their order does not matter. 
For this input, the number 10 appears 3 times, 20 and 50 appear 2 times each, and 150 and 30 appear once each. 
So the output will be: 
10 -> 3
20 -> 2
50 -> 2
150 -> 1
30 -> 1 */
package Frequency;
public class FrequencyAloneInDescending {
    public static void main(String[] args) {
        int a[]={50,20,150,20,50,10,30,10,10};
        int f[]=new int[a.length];
        // Count frequencies
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
        // Collect unique values and frequencies
        int n[]=new int[a.length],c[]=new int[a.length],k=0;
        for(int i=0;i<a.length;i++){
            if(f[i]!=-1){
            n[k]=a[i];
            c[k]=f[i];
            k++;
            } 
        }
        // Sort frequency alone in descending order
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(c[i]<c[j]){
                    int t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                    t=n[i];
                    n[i]=n[j];
                    n[j]=t;
                }
            }
        }
        // Print result
        for(int i=0;i<k;i++){
            System.out.println(n[i]+" -> "+c[i]);
        }
    }
}
