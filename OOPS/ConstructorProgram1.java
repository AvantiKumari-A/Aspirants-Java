/* Given a Book class and the Main class, write a MyBook class that does the following:
Inherits from Book
Has a parameterized constructor taking these 3 parameters:
string title
string author
int price
Implements the Book class' abstract display() method so it prints the title, author, and price.

Input format :
The Main class creates a Book object and calls the MyBook class constructor 
(passing it the necessary arguments). 
It then calls the display method on the Book object.

Output format :
The void display() method should print and 
Label the respective title, author, and price of the MyBook object's instance 
(with each value on its own line) .

Code constraints :
Strings and integers only.

Sample test cases :
Input 1 :
love
jack
300

Output 1 :
Title: love
Author: jack
Price: 300

Input 2 :
stars
juno
150

Output 2 :
Title: stars
Author: juno
Price: 150 */

import java.util.Scanner;
public class ConstructorProgram1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Student kunal=new Student(title,author,price);
        kunal.display();
        sc.close();
    }
}
class Student{
    String title;
    String author;
    int price;
    void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
    Student(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
}