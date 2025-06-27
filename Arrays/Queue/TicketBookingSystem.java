/* Problem Statement
You are assigned to develop a simple ticket-booking system for a local movie theater. 
The theater has a single ticket counter, and customers arrive to purchase tickets for the movie of their choice. 
Implement a queue using linked lists to manage the customers in line at the ticket counter.

Implement a program that provides the following functionalities:
Enqueue a customer into the ticket line.
Dequeue the customer at the front of the line when they reach the ticket counter.
Display the current list of customers in line.

Input format :
The input consists of an integer values, each representing an action to be taken:
1: Enqueue a new customer with a given customer ID.
2: Dequeue the customer at the front of the line.
3: Display the current customer IDs in the line.

Output format :
The program provides appropriate outputs based on the choice:
When enqueuing a customer (option 1), the program outputs the customer ID that is added to the line.
When dequeuing a customer (option 2), the program outputs the customer ID that is being served at the counter.
When displaying the customer IDs (option 3), the program shows the customer IDs currently in the line.
If a dequeue operation is attempted when the line is empty, the program outputs "No customers in line"
If the user provides an invalid option, the program outputs an "Invalid option"

Code constraints :
The given test cases fall under the following constraints:
1 ≤ Action to be done ≤ 3
Each customer is represented by a unique customer ID, which is a positive integer.
Customer IDs are assigned sequentially in the order they join the line.

Sample test cases :
Input 1 :
1
10
1
20
3
2
3

Output 1 :
Customer ID 10 is enqueued
Customer ID 20 is enqueued
Customer IDs in the queue are: 10 20 
Dequeued customer ID: 10
Customer IDs in the queue are: 20 

Input 2 :
2
1
3
5

Output 2 :
No customers in line
Customer ID 3 is enqueued
Invalid option

Input 3 :
1
5
3
2
3

Output 3 :
Customer ID 5 is enqueued
Customer IDs in the queue are: 5 
Dequeued customer ID: 5
No customers in line */

package Queue;

import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args){
        int q[]=new int[100],f=0,r=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){ // sc.hasNextInt() -> checks if the i/p is integer or not
            int n=sc.nextInt();
            if(n==1){
                if(r<100){
                    int id=sc.nextInt();
                    q[r]=id;
                    r++;
                    System.out.println("Customer ID "+id+" is enqueued");
                }
            }
            else if(n==2){
                if(f==r)
                 System.out.println("No customers in line");
                else{
                    System.out.println("Dequeued customer ID: "+q[f]);
                    f++;
                }
            }
            else if(n==3){
                if(f==r)
                 System.out.println("No customers in line");
                else{
                    System.out.print("Customer IDs in the queue are: ");
                    for(int i=f;i<r;i++){
                        System.out.print(q[i]+" ");
                    }
                    System.out.println();
                }
            }
            else
             System.out.println("Invalid option");
        }
        sc.close();
    }
}
