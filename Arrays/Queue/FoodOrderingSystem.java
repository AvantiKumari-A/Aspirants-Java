/* Problem Statement
Design and implement a food ordering system for a restaurant using a circular queue data structure. 
The system should manage incoming food orders from multiple customers and allocate kitchen staff to prepare the orders efficiently.

The system should allow the user to perform the following operations:
Enqueue a food order into the queue with a unique order number, customer name, and list of food items ordered.
Dequeue an order from the queue (when it has been processed by the kitchen staff).
Display the current state of the queue with the order numbers, customer names, and a list of food items ordered.
Exit the program.
The program should be able to handle invalid inputs and display appropriate error messages. 
The program should also be able to handle the circular nature of the queue, ensuring that when the last element is reached, 
The next enqueued order is added at the beginning of the queue.

Note: There is a new line space after the last line of the output.
Input format :
The input consists of a program that starts with a menu that allows the user to choose from the following options:
Enqueue an order into the queue (option 1)
Dequeue an order from the queue (option 2)
Display the current state of the queue (option 3)
Exit the program (option 4)
When the user selects option 1, the program prompts the user to enter the order number, customer name, and food items ordered.
When the user selects option 2, the program removes the first order in the queue.
When the user selects option 3, the program displays the current state of the queue with the order numbers, customer names, and food items ordered.

Output format :
The output consists of,
For option 1, the program will confirm the order has been added to the queue.
For option 2, the program will confirm the order has been removed from the queue.
For option 3, the program will display the current state of the queue with the order numbers, customer names, and food items ordered.
For option 4, the program will exit.
If the queue reaches its maximum size, then display "Queue is full".
If the dequeue is performed on an empty queue, then display "Queue is empty".
If the input is any of the mentioned options, then print "Invalid choice".
Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following specifications:
MAX_FOOD_ITEMS = 20
MAX_QUEUE_SIZE = 100

Sample test cases :
Input 1 :
1
1
John
3
burger
fries
coke
1
2
Sarah
2
Pizza
Soda
3
2
4

Output 1 :
Order added to queue
Order added to queue
Order number	Customer name	Food items
1		John		burger, fries, coke, 
2		Sarah		Pizza, Soda, 
Order number: 1
Customer name: John
Food items: 
burger
fries
coke

Input 2 :
5
1
101
jhon
2
egg
milk
3
4

Output 2 :
Invalid choice
Order added to queue
Order number	Customer name	Food items
101		jhon		egg, milk,  */

package Queue;
import java.util.Scanner;
public class FoodOrderingSystem {
    public static void main(String[] args) {
        final int MAX_QUEUE_SIZE = 100;
        int orderNumbers[] = new int[MAX_QUEUE_SIZE],front = -1,rear = -1;
        String customerNames[] = new String[MAX_QUEUE_SIZE],foodItems[] = new String[MAX_QUEUE_SIZE];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue Order");
            System.out.println("2. Dequeue Order");
            System.out.println("3. Display Orders");
            System.out.println("4. Exit");
            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // clear newline
            } else {
                sc.nextLine(); // clear invalid input
                System.out.println("Invalid choice\n");
                continue;
            }
            if (choice == 1) {
                // Enqueue
                if ((front == (rear + 1) % MAX_QUEUE_SIZE)) {
                    System.out.println("Queue is full\n");
                    continue;
                }
                System.out.print("Enter order number: ");
                int orderNumber = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();
                System.out.print("Enter food items (comma separated): ");
                String items = sc.nextLine();
                if (front == -1) {
                    front = rear = 0;
                } else {
                    rear = (rear + 1) % MAX_QUEUE_SIZE;
                }
                orderNumbers[rear] = orderNumber;
                customerNames[rear] = name;
                foodItems[rear] = items;
                System.out.println("Order added to queue\n");
            } else if (choice == 2) {
                // Dequeue
                if (front == -1) {
                    System.out.println("Queue is empty\n");
                } else {
                    System.out.println("Order removed from queue\n");

                    if (front == rear) {
                        front = rear = -1;
                    } else {
                        front = (front + 1) % MAX_QUEUE_SIZE;
                    }
                }
            } else if (choice == 3) {
                // Display
                if (front == -1) {
                    System.out.println("Queue is empty\n");
                } else {
                    System.out.println("Current Orders in Queue:\n");
                    int i = front;
                    while (true) {
                        System.out.println("Order number: " + orderNumbers[i]);
                        System.out.println("Customer name: " + customerNames[i]);
                        System.out.println("Food items: " + foodItems[i] + "\n");
                        if (i == rear) 
                         break;
                        i = (i + 1) % MAX_QUEUE_SIZE;
                    }
                }

            } else if (choice == 4) {
                // Exit
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice\n");
            }
        }
        sc.close();
    }
}
