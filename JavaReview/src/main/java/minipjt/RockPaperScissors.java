package minipjt;
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        // 사용자로부터 가위(0), 바위(1), 보(2) 중 하나를 입력받음
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        int userC = switch (userChoice) {
            case "가위" -> 0;
            case "바위" -> 1;
            case "보" -> 2;
            default -> 3;
        };

        // 0-2에서 랜덤으로 하나 뽑음
        int rdm = (int) (Math.random() * 10) % 3;
        String com = switch (rdm) {
            case 0 -> "가위";
            case 1 -> "바위";
            case 2 -> "보";
            default -> throw new IllegalStateException("Unexpected value: " + rdm);
        };

        // 두개 비교해서 가위바위보 결과 출력
        int result = userC - rdm;
        if (result == 0) System.out.println("computer: " + com + " => 비김");
        else if (result == 1 || result == -2) System.out.println("computer: " + com + " => 이김");
        else System.out.println("computer: " + com + " => 짐ㅋ");

    }
}