package Day15;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter meeting starting time in hh-mm-ss");
        int h1=sc.nextInt();
        int min1=sc.nextInt();
        int sec1=sc.nextInt();
        LocalTime l1=LocalTime.of(h1,min1,sec1);
        System.out.println("Enter meeting ending time in hh-mm-ss");
        int h2=sc.nextInt();
        int min2=sc.nextInt();
        int sec2=sc.nextInt();
        LocalTime l2=LocalTime.of(h2,min2,sec2);
        Duration d=Duration.between(l1,l2);
        System.out.println("Total duration of session= "+d.toHours()+" hours "+d.toMinutesPart()+" min "+d.toSecondsPart()+" sec");

        
    }
    
}
