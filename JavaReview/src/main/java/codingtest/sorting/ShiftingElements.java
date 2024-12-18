package codingtest.sorting;

import java.util.*;
public class ShiftingElements {
    /*
    // 내 코드
    public static void quickSort(int[] arr, int start, int end, int order) {
        if (start >= end) return;
        int left = start;
        int right = end;
        int pivot = (start + end) / 2;

        while(left != right) {

            left = start;
            right = end;

            if (order == 0) {
                while(arr[left] <= arr[pivot] && left < pivot) {
                    left++;
                }
                while(arr[right] >= arr[pivot] && right > pivot) {
                    right--;
                }
            }
            else {
                while(arr[left] >= arr[pivot] && left < pivot) {
                    left++;
                }
                while(arr[right] <= arr[pivot] && right > pivot) {
                    right--;
                }
            }

            if (left < right){
                int temp;
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, pivot-1, order);
        quickSort(arr, pivot+1, end, order);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        quickSort(a, 0, a.length - 1, 0); // 오름차순
        quickSort(b, 0, a.length - 1, 1); // 내림차순

        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int temp;
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }

        int result = 0;
        for (int e: a){
            result += e;
        }

        System.out.println(result);
    }
*/
    // Arrays.sort 이용한 답안
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int temp;
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }

        long result = 0;
        for (int e: a){
            result += e;
        }

        System.out.println(result);
    }
}
