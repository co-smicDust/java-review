package codingtest.implimentation;

import java.lang.reflect.Array;
import java.util.*;

public class StringResorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<Character> str = new ArrayList<>();
        int idx = 0, num = 0;
        boolean cnt = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)){
                str.add(ch);
                idx++;
            }else{
                num += ch - '0';
                cnt = true;
            }
        }

        Collections.sort(str);
        for (int i = 0; i < str.size(); i++){
            System.out.print(str.get(i));
        }
        if (cnt) System.out.println(num);
    }
}
