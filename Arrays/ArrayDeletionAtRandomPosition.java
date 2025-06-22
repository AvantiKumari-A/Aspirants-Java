/* 77. Delete an element from an array 
Input: arr[] = [10, 20, 30, 40], pos = 2 
Output: [10, 30, 40] */
public class ArrayDeletionAtRandomPosition { // to delete random index value element in array
    public static void main(String[] args){
        int a[]={10,20,30,40},pos=2; //to delete 20 at pos 2 (index 1)
        for(int i=0;i<a.length;i++){
            if(i==(pos-1))
                continue;
            System.out.print(a[i]+" ");
        }
    }
}
