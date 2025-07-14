/* Given a string of lowercase letters (a=1,b=2,...z=26) 
Calculate the total alphabetic gap between each adjacent pair of characters using
Gap=abs(position(s[i+1]-s[i])
Note: for not include Gap between 1st and last character
Example: 
Input1: carrot
Output1:17 */
public class TotalAlphabetGap {
    public static void main(String[] args) {
        String s=" carrot ";
        s=s.trim(); // used to remove spaces at the beginning and the end of the string
        int gap=0;
        for(int i=0;i<s.length()-1;i++){
            gap+=s.charAt(i+1)-s.charAt(i);
        }
        System.out.println(gap);
    }
}
