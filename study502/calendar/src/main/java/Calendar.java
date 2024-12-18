import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // 년, 월 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 년 출력?");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("몇 월 출력?");
        int month = Integer.parseInt(sc.nextLine());

        // 요일 배열
        String[] dw = {"월", "화", "수", "목", "금", "토", "일"};

        // 시작 연월일, 끝 연월일
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);

        // 시작 일, 끝 일, 시작 요일번호
        int sDay = startDate.getDayOfMonth();
        int eDay = endDate.getDayOfMonth();
        int startPos = startDate.get(ChronoField.DAY_OF_WEEK);

        // 두 자리 숫자 포맷 고정
        DecimalFormat df = new DecimalFormat("00");

        // 출력
        System.out.printf("%d년 %d월 %n", year, month);
        for (String d: dw){
            System.out.print(d + "   ");
        }
        System.out.println();
        for(int i = 1; i <= eDay + startPos; i++){
            if (i >= startPos){
                System.out.print(df.format(i - startPos + 1));
            } else {
                // 첫 주 빈 칸
                System.out.print("  ");
            }
            // 날짜 사이 빈 칸
            System.out.print("   ");

            // 1주 줄 바꿈
            if (i % 7 == 0)
                System.out.println();
        }
    }
}
