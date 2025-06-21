import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    System.out.println(y + "is a leap year");
                }
                else
                    System.out.println(y + "is not a leap year");
            }
            else
                System.out.println(y + "is not a leap year");
        }
        else
            System.out.println(y + "is not a leap year");
            sc.close();
    }
}

/* Another method 2:

    if((y%4==0 && y%100!=0) || (y%400==0))
    System.out.println("Leap Year");
    else
    System.out.println("Not a Leap Year");
*/

/* Another method 3:
   if(y%100==0){
     if(y%4==0 && y%400==0){
     System.out.println("Leap year");
     } else
     System.out.println("Not a leap year");
   }
   else if(y%4==0){
     System.out.println("Leap year");
     }
   else
     System.out.println("Not a leap year");

 */