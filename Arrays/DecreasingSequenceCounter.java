/* Decreasing sequence: Given an integer array, find the number of decreasing sequences in the array 
And the length of its longest decreasing sequence.
You are expected to complete the logic within the given function, where,
input1 represents the integer array and,
input2 represents the number of elements in the integer array

The function should set the output1 variable to the number of decreasing sequences in the array
And set the output2 variable to the length of the longest decreasing sequence in the array.

Example 1:
If input1 = (11,3,1,4,7,8,12,2,3,7) and input2 = 10
output1 = 2
output2 = 3

Iteration Explanation:
Start at i = 0: 11 > 3 → decreasing starts, len = 2
i = 1: 3 > 1 → still decreasing, len = 3
i = 2: 1 < 4 → stop, count = 1, maxLen = 3
i = 3: 4 < 7 → skip
i = 4: 7 < 8 → skip
i = 5: 8 < 12 → skip
i = 6: 12 > 2 → decreasing starts, len = 2
i = 7: 2 < 3 → stop, count = 2, maxLen remains 3
i = 8: 3 < 7 → skip
End of loop

output1 = 2
output2 = 3 */

public class DecreasingSequenceCounter {
    public class Result {
        public final int output1;
        public final int output2;
        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }
    public Result decreasingSeq(int[] input1, int input2) {
        int count = 0, maxLen = 0;
        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                int len = 2;
                i++;
                while (i < input2 - 1 && input1[i] > input1[i + 1]) {
                    len++;
                    i++;
                }
                count++;
                if (len > maxLen) maxLen = len;
            }
        }
        return new Result(count, maxLen);
    }
    public static void main(String[] args) {
        DecreasingSequenceCounter obj = new DecreasingSequenceCounter();
        int[] input = {11, 3, 1, 4, 7, 8, 12, 2, 3, 7};
        int n = input.length;
        Result res = obj.decreasingSeq(input, n);
        System.out.println(res.output1);
        System.out.println(res.output2);
    }
}
