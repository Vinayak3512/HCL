package Day15;

import java.time.Duration;
import java.time.LocalDate;

class ExaminationDate{
    int date,month,year;
    ExaminationDate(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
}
public class t2 {
    public static void main(String[] args) {
        ExaminationDate e1=new ExaminationDate(25,12,2026);
        
        LocalDate today=LocalDate.now();
        LocalDate examDate=LocalDate.of(e1.year,e1.month,e1.date);
        Duration d = Duration.between(today, examDate);
        System.out.println(examDate.getDayOfWeek());
        if(e1.year%4==0&&e1.year%400==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");

        System.out.println(d.toDays());

    }
    
}
