package Ass;

import java.util.Scanner;

public class palindromechecker {
    public static void main(String[] args) {
        palindromechecker maths = new palindromechecker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String org_str = sc.nextLine();

        if (isPalindrome(org_str)) {
            System.out.println(org_str + " is Palindrome");
        } else {
            System.out.println(org_str + " is not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reverse_str = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse_str = reverse_str + str.charAt(i);
        }
        return str.equals(reverse_str);
    }
}

