import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        if (n == 1 || n == 2) {
            System.out.println(a);
        } else {
            for (int i = 0; i < n - 1; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(a);
        }

    }

}
