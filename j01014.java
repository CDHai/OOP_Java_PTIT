package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long ans = 0L;
            for (Long i = 2L; i * i <= n; i++) {
                if (n % i == 0) {
                    ans = i;
                    while (n % i == 0)
                        n /= i;
                }
            }
            if (n > 1)
                ans = n;
            System.out.println(ans);
        }
    }
}
