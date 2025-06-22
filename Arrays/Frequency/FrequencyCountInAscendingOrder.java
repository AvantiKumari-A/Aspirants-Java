/* 63. Program to find the frequency count of every number in an array in ascending order
Input={40,20,10,50,20,10,30,40}
50->1
30->1
40->2
20->2
10->2 */
package Frequency;
public class FrequencyCountInAscendingOrder {
    public static void main(String[] args) {
        int a[] = {40, 20, 10, 50, 20, 10, 30, 40};
        int n = a.length;
        // Count frequencies
        int f[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (f[i] == -1) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    f[j] = -1;
                }
            }
            f[i] = count;
        }
        // Collect unique values and frequencies
        int v[] = new int[n], c[] = new int[n], k = 0;
        for (int i = 0; i < n; i++) {
            if (f[i] != -1) {
                v[k] = a[i];
                c[k] = f[i];
                k++;
            }
        }
        // Sort by frequency asc, value desc
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (c[i] > c[j] || (c[i] == c[j] && v[i] < v[j])) {
                    int t = c[i]; 
                    c[i] = c[j]; 
                    c[j] = t;
                    t = v[i]; 
                    v[i] = v[j]; 
                    v[j] = t;
                }
            }
        }
        // Print result
        for (int i = 0; i < k; i++)
            System.out.println(v[i] + " -> " + c[i]);
    }
}
