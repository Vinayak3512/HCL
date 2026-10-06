package Day15;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter project start date in this format yyyy");
        String d=sc.nextLine();
        System.out.println("Enter number of weeks required to complete the project");
        long w=sc.nextInt();
        LocalDate date=LocalDate.parse(d);
        LocalDate end=date.plusWeeks(w);
        System.out.println();
        Period p=Period.between(date,end);
        System.out.println(p.getDays());

    } 
}
