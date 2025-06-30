/* int input1=3521, input2=2452, input3=1352 
find 1st largest  and 2nd largest in all 3 inputs.
Sum the 1st largest in all 3 and sum 2nd largest in all 3, 
Finally add large + 2nd large and print sum */

package KeyValue;
public class KeyValue2 {
    public static void main(String[] args) {
        int inp1=3521,inp2=2452,inp3=1352;
        int larger=findMax(inp1)+findMax(inp2)+findMax(inp3);
        int sndlrg=SecondMax(inp1)+SecondMax(inp2)+SecondMax(inp3);
        System.out.println("Key value is: "+(larger+sndlrg));
    }
    public static int findMax(int num){
        int max=Integer.MIN_VALUE;
        while(num!=0){
            int d=num%10;
            if(d>max)
             max=d;
            num/=10;
        }
        return max;
    }
    public static int SecondMax(int num){
        int max=findMax(num),sec=Integer.MIN_VALUE;
        while(num!=0){
            int d=num%10;
            if(d<max && d>sec)
             sec=d;
            num/=10;
        }
        return sec;
    }
}
