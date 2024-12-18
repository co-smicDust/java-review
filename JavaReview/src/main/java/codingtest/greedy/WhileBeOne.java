package codingtest.greedy;

import java.util.*;

public class WhileBeOne {
    public static void main(String[] args) {

        System.out.println("공백 구분하여 자연수 n, k 입력:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
/*
        while (n > 1) {
            if (n % k == 0){
                n /= k;
            }
            else {
                n -= 1;
            }
            cnt += 1;
        }
*/
        while (true) {
            int target = (n / k) * k;
            cnt += n - target;
            n = target;

            if (n < k)  break;

            n /= k;
            cnt += 1;
        }

        cnt += n - 1;

        System.out.println(cnt);
    }
}
