package codingtest.implimentation;

import java.util.*;

public class RoyalKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinate = sc.nextLine();

        int row = Character.getNumericValue(coordinate.charAt(1));
        int col = coordinate.charAt(0) - 96;

        int[] r = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[] c = {-2, -1, 1, 2, 2, 1, -1, -2};

        int cnt = 0;

        for (int i = 0; i < 8; i++){
            int nr = row + r[i];
            int nc = col + c[i];

            if (nr > 0 && nr < 9 && nc > 0 && nc < 9)
                cnt++;
        }

        System.out.println(cnt);
    }
}
