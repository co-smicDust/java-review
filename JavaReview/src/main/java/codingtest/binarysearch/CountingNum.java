package codingtest.binarysearch;

import java.util.*;

public class CountingNum {
    public static int left = 0, right = 0, x;
    public static void findIdx(int start, int end, int[] arr, int se) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (se == 0) {  // 시작 인덱스
                if (arr[mid] >= x) {
                    left = mid - 1;
                    end = mid - 1;
                } else {
                    left = mid;
                    start = mid + 1;
                }
            } else {    // 끝 인덱스
                if (arr[mid] <= x) {
                    right = mid;
                    start = mid + 1;
                } else {
                    right = mid - 1;
                    end = mid - 1;
                }
            }
            if (arr[mid] == x) {
                if (arr[start] != x || arr[end] != x) break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findIdx(0, n - 1, arr, 0);  // 시작 인덱스 구하기
        findIdx(0, n - 1, arr, 1);  // 끝 인덱스 구하기

        System.out.println(right - left);
    }
}
