package codingtest.greedy;

import java.util.*;

public class TimesOrPlus {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = Character.getNumericValue(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num > 1 && result > 1) {
                result *= num;
            } else {
                result += num;
            }
        }

        System.out.println(result);
    }
}
