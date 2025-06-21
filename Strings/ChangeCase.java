 // to change the upper case into lower case and lower case into the upper case
public class ChangeCase {
    //Method1 without using in build function
    public static void main(String[] args) {
        String s="aBc";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&&ch[i]<='Z')
                ch[i]=(char)(ch[i]+32);
            else
                ch[i]=(char)(ch[i]-32);
        }
        String s1=new String(ch);
        System.out.println(s1);
    }
}

/* With In build function
        char a[]={'a','B','c','D'};
        String s="";
        for(int i=0;i<a.length;i++){
            if (Character.isUpperCase(a[i])) {
                s+=Character.toLowerCase(a[i]);
            }
            else{
                s+=Character.toUpperCase(a[i]);
            }
        }
        System.out.println(s);
*/

/* Basic things: 

A = 65 + 32 = 97 (a)

1) char a='Z';
   (int)a // gives ascii value of a

2) int a = '6' - '0' // -0 converts the char 6 to int 6

3)
 */