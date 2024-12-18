package codingtest.greedy;

import java.util.*;

public class AdventurerGuild {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> fearRate = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fearRate.add(sc.nextInt());
        }

        Collections.sort(fearRate);
        
        int guild = 0;
        int personnel = 1;
        
        for (int i = 0; i < n; i++) {
            if (fearRate.get(i) > personnel) {
                personnel += 1;
            } else {
                guild += 1;
                personnel = 1;
            }
        }
        
        System.out.println(guild);
    }
}
