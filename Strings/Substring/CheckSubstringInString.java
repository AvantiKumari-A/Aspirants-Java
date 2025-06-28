/* Check a substring "Tod" in given string "TodisplayingTodhouseTod" and return the count 
Since, the given word "Tod: is present 3 times in the String, so count = 3
I/p: s = TodisplayingTodhouseTod, word = Tod
O/P: 3 */

package Substring;
public class CheckSubstringInString {
    public static void main(String[] args) {
        String s="TodisplayingTodhouseTodin",word="Tod";
        int c=0;
        for(int i=0;i<s.length()-word.length();i++){
            if(s.substring(i,i+word.length()).equals(word))
             c++;
        }
        System.out.println(c);
    }
}

/* Using Two Pointer:
public class SubstringCheckingUsingTwoPointerMethod {
    public static void main(String[] args) {
        String s = "abcbadb";
        String word = "bad";
        boolean found = false;
        for (int i = 0; i <= s.length() - word.length(); i++) {
            int p1 = i; // pointer for main string
            int p2 = 0; // pointer for word
            while (p2 < word.length() && s.charAt(p1) == word.charAt(p2)) {
                p1++;
                p2++;
            }
            if (p2 == word.length()) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Substring found");
        else
            System.out.println("Substring not found");
    }
}
*/