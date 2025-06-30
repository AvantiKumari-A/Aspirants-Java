/* int input1=5432, input2=1234;	
int key=(thousandth value of inp1 * hundredth value of inp2) + smallest value of inp2
Print key */
package KeyValue;
public class KeyValue1 {
    public static void main(String[] args) {
        int n1=5432,n2=1234;
        int thousand=(n1/1000)%10,hundred=(n2/100)%10,min=Integer.MAX_VALUE;
        while(n2!=0){
            int d=n2%10;
            if(d<min)
             min=d;
            n2/=10;
        }
        System.out.println("Key value is: "+(thousand*hundred)+min);
    }
}
