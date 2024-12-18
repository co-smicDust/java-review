import java.util.Calendar;
import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        cal.set(DATE, 20);
        printDate(cal);

        cal.set(DATE, 100); //100일 후
        printDate(cal);

        cal.set(DATE, -100); //100일 전
        printDate(cal);
    }

    public static void printDate(Calendar cal) {
        String dateStr = String.format("%d-%d-%d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
        String timeStr = String.format("%d:%d:%d", cal.get(HOUR_OF_DAY), cal.get(MINUTE), cal.get(SECOND));

        System.out.println(dateStr + " " + timeStr);
    }
}