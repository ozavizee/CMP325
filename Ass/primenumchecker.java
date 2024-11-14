package Ass;

public class primenumchecker {
    public static boolean isprimenumchecker(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primenumchecker maths = new primenumchecker();
        int n = Integer.parseInt(args[0]);
        System.out.println(isprimenumchecker(n));
    }
}

