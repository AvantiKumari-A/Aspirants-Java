package Arrays;

//same logic for unique number, duplicate number, occurence
public class Occurence {
    public static void main(String[] args) {
        int a[]={2,1,3,1,2};
        int freq[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]>0)
                System.out.println(i + " occured " + freq[i] + " times.");
        }
    }
}
