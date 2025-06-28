/* Count frequency of characters in a string "abcbadb" */

package Frequency;
public class StringFrequencyCount {
    public static void main(String[] args) {
        String s="abcbadb";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='0')
             continue;
            int count=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    count++;
                    c[j]='0';
                }
            }
            System.out.println(c[i]+" : "+count);
        }
    }
}

/*Another Method1:
public class StringFrequencyCount {
    public static void main(String[] args) {
        String s="abcbadb";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++; // 'a' converts char into int value
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println((char)(i+'a')+" : " + freq[i]);
            }
        }
    }
}
*/

/* Another Method2 : 
public class StringFrequencyCount {
    public static void main(String[] args) {
        String str = "abcbadb";
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}
 */