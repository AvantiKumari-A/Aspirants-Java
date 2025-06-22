/* 76. Insert an element in an array 
Input: arr[] = [10, 20, 30, 40], pos = 3, element = 50 
Output: [10, 20, 50,30, 40] */

//insert 50 in 3rd position (index position=2) 
public class ArrayInsertionAtRandomPosition { // to insert elements in array at random positions
    public static void main(String[] args) {
        int a1[]={10,20,30,40},a2[]=new int[a1.length+1],pos=3,element=50; 
        for(int i=0;i<pos-1;i++){
            a2[i]=a1[i];
        }
        a2[pos-1]=element;
        for(int i=pos-1;i<a2.length-1;i++){
            a2[i+1]=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
    }
}

/* Printing Arrays By Another Method:
By importing java.util.Arrays;
We can convert Arrays to String and print like this 
 System.out.println(Arrays.toString(a2)); */