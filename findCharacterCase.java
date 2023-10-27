package Coding_Ninjas_Dsa_Solutions;

import java.util.*;

public class findCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (Character.isUpperCase(c)) {
            System.out.println("1");
        } else if (Character.isLowerCase(c)) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}
