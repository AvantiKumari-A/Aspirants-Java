public class Count {
    public static void main(String[] args) {
        String name="Avanti14@";
        int vcount=0,ccount=0,dcount=0,scount=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vcount++;
                }
                else
                    ccount++;
            }
            else if(ch>='0' && ch<='9')
                dcount++;
            else
                scount++;
        }
        System.out.println("Vowels: " + vcount);
        System.out.println("Consonants: " + ccount);
        System.out.println("Digits: " + dcount);
        System.out.println("Special characters: " + scount);
    }
}

