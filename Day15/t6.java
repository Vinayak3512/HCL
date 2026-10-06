package Day15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class t6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter date (dd/MM/yyyy): ");
        String input = sc.nextLine();

       
        DateTimeFormatter inputFormat =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate date = LocalDate.parse(input, inputFormat);

        // Different output formats
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

       
        System.out.println("\nFormatted Dates:");

        System.out.println("dd-MM-yyyy           : "+ date.format(format1));

        System.out.println("MMMM dd, yyyy        : "+ date.format(format2));

        System.out.println("EEEE, dd MMMM yyyy   : "+ date.format(format3));

    }
}
