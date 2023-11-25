public class Solution {
    public static void nForest(int n) {

        if (n <= 25 && n >= 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
