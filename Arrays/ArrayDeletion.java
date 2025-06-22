
public class ArrayDeletion { // to delete random index value element in array
    public static void main(String[] args){
        int[] a={1,2,3,4,5}; //to delete 3
        int delete_index=2;
        for(int i=0;i<a.length;i++){
            if(i==delete_index){
                continue;
            }
            System.out.print(a[i]+" ");
        }
    }
}
