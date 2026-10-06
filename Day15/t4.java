package Day15;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee's Date of Birth in 1. year 2.month 3.Day ");
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();

         LocalDate dob=LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();
        //
        Period age=Period.between(dob,today);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Today: "+today);

        System.out.println("\nAge:");
        System.out.println("Years : "+age.getYears());
        System.out.println("Months : "+age.getMonths());
        System.out.println("Days : "+age.getDays());

    }
}
