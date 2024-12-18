package codingtest.greedy;

import java.util.*;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("거스름돈: ");
        int n = sc.nextInt();
        int[] coin = {500, 100, 50, 10};
        int cnt = 0;

        for (int j : coin) {
            if (n >= j) {
                cnt += n / j;
                n %= j;
            }
        }

        System.out.println(cnt);
    }
}
