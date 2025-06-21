public class SubsetUsingTwoPointer {
    public static void main(String[] args) {
    String s1="abcde";
    String sub="ace";
    int i=0,j=0;
    while(i<s1.length()&&j<sub.length()){
        if(s1.charAt(i)==sub.charAt(j)){
            j++;
        }
        i++;
    }
    if(j==sub.length()){
        System.out.println("Substring present");
    }
    else{
        System.out.println("Substring not present");
    }
    }
}

/* Another Method to find subset by converting String to Char Array:
public class SubsetUsingTwoPointer {
    public static void main(String[] args) 
    {
    String s1="abcde";
    String sub="ace";
    char c1[]=s1.toCharArray();
    char c2[]=sub.toCharArray();
    int subset=false;
    for(int i=0;i<c2.length();i++){
    for(int j=0;j<c1.length;j++){
    if(c2.charAt[i]==c1.charAt[j]){
    subset=true;
    break;
    }
    }
    }
    return subset;
    }
}
*/