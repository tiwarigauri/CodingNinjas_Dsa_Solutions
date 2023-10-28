import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 12345//e=6, o=9,o=6 9
        int even = 0;
        int odd = 0;
        int y=n;
        while (y!= 0) {
            n = y % 10;// 5
            if (n % 2 == 0) {
                even = even + n;
            } else {
                odd = odd + n;
            }
            y = y / 10;
        }
        System.out.println(even + " " + odd);

    }
}
