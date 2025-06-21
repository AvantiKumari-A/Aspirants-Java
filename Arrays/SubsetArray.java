package Arrays;

public class SubsetArray {
    public static void main(String[] args) {
        int a1[]={1,2,5,6,3};
        int a2[]={1,2,3};
        System.out.println("Is array2 is a subset of array1? " + subset(a1, a2));
    }
    public static boolean subset(int a1[],int a2[]){
        boolean found=false;
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    found=true;
                    break;
                }
            }
        }
        return found;
    }
    
}


/* Another Method
public static void main(String[] args) {
        int a1[]={1,2,5,6,3};
        int a2[]={1,2,3};
        int l=a2.length,count=0;
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    count++;
                }
            }
        }
        if(count==l){
            System.out.println("Array2 is the subset of Array1");
        }
        else{
            System.out.println("Array2 is not the subset of Array1");
        }
    }  
*/