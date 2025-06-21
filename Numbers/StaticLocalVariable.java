public class StaticLocalVariable {
    int a=5; // instance variable
    static int b=6; // static variable
    void display(int a, int b){ // instance method and (a,b) -> local varaible
        System.out.println(a+b);
    }
    public static void main(String[] args) { // main
        int k=5;; // local variable
        StaticLocalVariable s1= new StaticLocalVariable(); // s1 -> reference variable
        System.out.println(s1.a);
        s1.display(10,20);
        System.out.println(b); // or System.out.println(StaticLocalVariable.b);
        System.out.println(k);
    }
}
