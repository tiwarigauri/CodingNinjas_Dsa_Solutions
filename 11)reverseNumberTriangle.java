public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = n; i > 0; i--) {// n=3
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
