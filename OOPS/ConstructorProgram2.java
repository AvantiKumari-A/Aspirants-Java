/* Write a program by creating a class called "Bicycle" as a base class with the attributes "number of gears" and "speed of the bicycle" as integer attributes, 
And creating a class called "MountainBike," a derived class that extends the "Bicycle" class 
With the attribute "seat height" as an integer. 
Create a Test class to run the program and obtain the output on the console.
Note: Override the toString() method to display the details of the bicycle.

Input format :
The input consists three int representing the number of gears, the speed of bicycle, and the seat height.

Output format :
The output displays the number of gears, the speed of the bicycle, and the seat height.

Refer to the sample outputs for the formatting specifications.
Sample test cases :
Input 1 :
2 90 40

Output 1 :
Number of gears: 2
Speed of the Bicycle: 90
Seat height: 40

Input 2 :
3 60 20
Output 2 :

Number of gears: 3
Speed of the Bicycle: 60
Seat height: 20 */

import java.util.Scanner;
public class ConstructorProgram2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        int s=sc.nextInt();
        int h=sc.nextInt();
        MountainBike[] bike=new MountainBike[5];
        MountainBike k=new MountainBike(g,s,h);
        k.display();
        sc.close();
    }
}
class MountainBike{
    int g;
    int s;
    int h;
    void display(){
        System.out.println("Number of gears: "+this.g);
        System.out.println("Speed of the Bicycle: "+this.s);
        System.out.println("Seat height: "+this.h);
    }
    MountainBike(int g,int s,int h){
        this.g=g;
        this.s=s;
        this.h=h;
    }
}
