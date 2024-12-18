package codingtest.implimentation;

import java.util.*;

public class Lrud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("공간의 크기: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("여행 계획: ");
        String[] plan = sc.nextLine().split(" ");

        String[] direction = {"L", "R", "U", "D"};
        int[] x = {0, 0, -1, 1};
        int[] y = {-1, 1, 0, 0};

        int currentX = 1, currentY = 1;

        for (String p: plan) {
            int nextX = 0, nextY = 0;
            for (int i = 0; i < 4; i++){
                if (p.equals(direction[i])){
                    nextX = currentX + x[i];
                    nextY = currentY + y[i];

                    if (nextX >= 1 && nextY >= 1 && nextX <= n && nextY <= n){
                        currentX = nextX;
                        currentY = nextY;
                    }
                    break;
                }
            }
        }

        System.out.printf("%d %d", currentX, currentY);
    }
}
