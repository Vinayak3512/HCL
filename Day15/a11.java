package Day15;

import java.time.LocalDate;
import java.time.Period;

public class a11 {
    public static void main(String[] args) {
        //Current Date
        LocalDate dob=LocalDate.of(2004,07,03);
        LocalDate today=LocalDate.now();
        //
        Period age=Period.between(dob,today);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Today: "+today);

        System.out.println("\nAge:");
        System.out.println("Years : "+age.getYears());
        System.out.println("Months : "+age.getMonths());
        System.out.println("Days : "+age.getDays());

        System.out.println("\nComplete Age: "+age.getYears()+" Years, "+age.getMonths()+"Months, "+age.getDays()+" Days");
    }
}
