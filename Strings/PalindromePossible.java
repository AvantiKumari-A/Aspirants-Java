import java.util.Scanner;
public class PalindromePossible {
    public static boolean palindrome_frequency(String s){
        s = s.replaceAll("[\\s]","").toLowerCase(); // to remove the spaces and convert the string into lower case
        int[] freq=new int[26];
        // count the frequency of each character in the string
        for(char c : s.toCharArray()){
            freq[c - 'a']++; // it converts the char into index value and increment the values
        }
        // count how many characters have odd frequency
        int oddcount=0;
        for(int count : freq){
            if(count%2!=0)
             oddcount++;
        }
        return oddcount<=1; // if odd count 0 it means all are even else 1 odd character available then it means length is odd
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(palindrome_frequency(s))
         System.out.println("The string can be rearranged into a palindrome");
        else 
         System.out.println("The string cannot be rearranged into a palindrome");
        sc.close();
    } 
}
