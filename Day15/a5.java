package Day15;

import java.time.LocalDate;

public class a5 {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        now.getDayOfMonth();
        now.getDayOfWeek();
        now.getDayOfYear();
        System.out.println(now);
        //For Cutomized Date

        LocalDate customDate=LocalDate.of(1989,04,24);
        System.out.println(customDate);
        //For Current Date-Process 2
        LocalDate today=LocalDate.now();
        System.out.println(today);
        //For Yesterday
        LocalDate Yesterday=today.minusDays(1);
        System.out.println(Yesterday);
        //For Last Month
        LocalDate LastMonth=today.minusMonths(1);
        System.out.println(LastMonth);
        //For last year
        LocalDate LastYear=today.minusYears(1);
        System.out.println(LastYear);
    }
}
