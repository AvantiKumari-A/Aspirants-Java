/* 69. Given an integer array using searching element 
Place the incremented number next to searching number
Input = {10,20,10,30,14,40,60,10}
Search=10
Output={10,1,20,10,2,30,14,40,60,10,3} */

public class AddOccurrenceCountNexttoElement {
    public static void main(String[] args) {
        int a[]={10,20,10,30,14,40,60,10},b[]=new int[50],count=0,element=10;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                count++;
                b[j++]=a[i];
                b[j++]=count;
            }
            else
             b[j++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            if(b[i]!=0)
             System.out.print(b[i]+" ");
        }
    }
}
