
import java.util.Arrays;
public class ArrayInsert { // to insert elements in array at random positions
    public static void main(String[] args) {
        int a1[]={5,10,20,25}; //insert 15 in arr[2]
        int a2[]=new int[a1.length+1];
        int index_to_insert=2;
        int element_to_insert=15;
        for(int i=0;i<=1;i++){
            a2[i]=a1[i];
        }
        for(int i=2;i<a2.length-1;i++){
            a2[i+1]=a1[i];
        }
        a2[index_to_insert]=element_to_insert;
        System.out.println(Arrays.toString(a2)); //can print like this
        
        /* or we can print like this
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
        */
    }
}
