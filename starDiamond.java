public class Solution {

    public static void nStarDiamond(int n) {
        nStarTriangle(n);
        nReverseStarTriangle(n);

    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            // space before stars
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // space after stars
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nReverseStarTriangle(int n) {
        // Write your code here
        for (int i = (n - 1); i >= 0; i--) {
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