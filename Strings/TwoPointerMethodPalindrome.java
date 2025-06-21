public class TwoPointerMethodPalindrome {
    public static boolean palindrome(String s1) {
    int left=0;
    int right=s1.length()-1;
    while(left<=right){
        if(s1.charAt(left)!=s1.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
    public static void main(String args[]){
        String s="a"; // s = "abba" , "abca" 
        System.out.println(palindrome(s));
    }
}