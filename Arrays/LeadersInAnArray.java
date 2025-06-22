/* 80. Leaders in an Array. 
Input: arr[] = [16, 17, 4, 3, 5, 2] 
Output: [17 5 2] 
Explanation: 
17 is greater than all the elements to its right 
i.e., [4, 3, 5, 2], therefore 17 is a leader. 
5 is greater than all the elements to its right 
i.e., [2], therefore 5 is a leader. 
2 has no element to its right, therefore 2 is a leader. */

public class LeadersInAnArray {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2},b[]=new int[a.length],k=0;
        for(int i=0;i<a.length;i++){
            boolean leader=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    leader=false;
                    break;
                }
            }
            if(leader)
             b[k++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>0)
             System.out.print(b[i]+" ");
        }
    }
}
