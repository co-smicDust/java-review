package codingtest.binarysearch;

import java.util.*;

public class MakingTteok {
    public static int binarySearch(int start, int end, Integer[] arr, int req) {
        int h = (start + end) / 2;
        int result;
        int sum = 0;
        for (int t: arr) {
            if (t > h)
               sum += t - h;
        }
        if (sum < req) {
            result = binarySearch(start, h - 1, arr, req);
        } else if (sum > req) {
            result = binarySearch(h + 1, end, arr, req);
        } else {
            result = h;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        /* 내 코드
        Integer[] tteok = new Integer[n];
        for (int i = 0; i < n; i++) {
            tteok[i] = sc.nextInt();
        }

        // 잘린 떡의 길이의 합이 적어도 m 이상이 되도록
        Arrays.sort(tteok);
        System.out.println(binarySearch(0, tteok[n - 1], tteok, m));
        */

        // 강의 코드
        int[] tteok = new int[n];
        for (int i = 0; i < n; i++) {
            tteok[i] = sc.nextInt();
        }

        int start = 0;
        int end = (int) 1e9;
        int maxh = 0;

        while (start <= end) {
            int result = 0;
            int h = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if (tteok[i] > h) result += tteok[i] - h;
            }
            if (result >= m) {
                maxh = h;
                start = h + 1;
            }
            else end = h - 1;
        }
        System.out.println(maxh);
    }
}
