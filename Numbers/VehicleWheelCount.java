/* Problem Statement:
An automobile company manufactures both two-wheelers (TW) and four-wheelers (FW).
A company manager wants to determine the production quantity for both types of vehicles using the data below:

Total number of vehicles (two-wheelers + four-wheelers) = V

Total number of wheels = W
The task is to calculate how many two-wheelers and four-wheelers need to be manufactured as per the given data.

Example 1:
Input:
200
540
Output:
TW=130 FW=70

Explanation:
130 + 70 = 200 vehicles
(130 × 2) + (70 × 4) = 260 + 280 = 540 wheels

Example 2:
Input:
2000
100
Output:
INVALID INPUT

Input Format:
The input consists of two positive integers separated by a new line:
V → Total number of vehicles
W → Total number of wheels

Output Format:
Two integers separated by space in the format: TW=x FW=y
If the inputs do not meet the constraints, print: INVALID INPUT

Code Constraints:
20 ≤ V ≤ 10⁹
50 ≤ W ≤ 10⁹
W % 2 == 0
V < W

Sample Test Cases:
Input 1:
200
540
Output 1:
TW=130 FW=70

Input 2:
2000
100
Output 2:
INVALID INPUT */

import java.util.Scanner;
public class VehicleWheelCount {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        long v=sc.nextLong();
        long w=sc.nextLong();
        if(v<20||w<50||v>=w||w%2!=0){
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }
        long fw=(w-2*v)/2;
        long tw=v-fw;
        if(fw<0||tw<0){
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }
        System.out.println("TW= "+tw+" FW= "+fw);
        sc.close();
 }   
}

/* Explanation:
Explanation (Short):
Inputs: v = total vehicles, w = total wheels
Invalid Input Conditions:

* v < 20
* w < 50
* v >= w
* w is odd

Logic:
* Each two-wheeler has 2 wheels
* Each four-wheeler has 4 wheels
* Formula:
  fw = (w - 2 \* v) / 2
  tw = v - fw

Final Check:
If fw < 0 or tw < 0, it's invalid

Output:
TW= x FW= y or INVALID INPUT

Example:
Let total vehicles = v and total wheels = w. 
Each two-wheeler has 2 wheels and each four-wheeler has 4 wheels. 
If all v vehicles were two-wheelers, total wheels = 2*v. The extra wheels = w - 2*v. 
Since each four-wheeler has 2 extra wheels compared to a two-wheeler, 
Number of four-wheelers = (w - 2\*v)/2. Then, two-wheelers = v - four-wheelers.

Example: v = 200, w = 540
fw = (540 - 2\*200)/2 = 70
tw = 200 - 70 = 130
Output: TW=130 FW=70

 */