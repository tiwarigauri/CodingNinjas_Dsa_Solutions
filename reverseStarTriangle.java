public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = (n-1); i >= 0; i--) {
            // spaces
            for (int j = n - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }

            // stars
            for (int j = (2 * i + 1); j > 0; j--) {
                System.out.print("*");
            }

            // spaces
            for (int j = n - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }

            // new line
            System.out.println(" ");
        }
    }
}