package codingtest.implimentation;

import java.util.*;

public class Time {

    public static boolean check(int h, int m, int s){
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
/*
        for (int h = 0; h <= n; h++){
            for (int m = 0; m < 60; m++){
                for (int s = 0; s < 60; s++){
                    // 시각에 3이 포함되어 있으면 경우의 수 증가
                    if(check(h, m, s)) cnt++;
                }
            }
        }
*/
        for (int h = 0; h <= n; h++){
            String hh = Integer.toString(h);
            for (int m = 0; m < 60; m++){
                String mm = Integer.toString(m);
                for (int s = 0; s < 60; s++){
                    String ss = Integer.toString(s);
                    String hms = hh + mm + ss;

                    if (hms.contains("3"))
                        cnt++;
                }
            }
        }

        System.out.println("답: " + cnt);
    }
}
