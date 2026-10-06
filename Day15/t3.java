package Day15;

import java.time.*;
import java.util.Scanner;
public class t3{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter meeting date-time yyyy-mm-ddTHH:mm (ex 2026-05-15T14:30): ");
  LocalDateTime ldt = LocalDateTime.parse(sc.next());
  ZonedDateTime kolkata = ldt.atZone(ZoneId.of("Asia/Kolkata"));
  System.out.println("Kolkata: "+kolkata);
  System.out.println("New York: "+kolkata.withZoneSameInstant(ZoneId.of("America/New_York")));
  System.out.println("London: "+kolkata.withZoneSameInstant(ZoneId.of("Europe/London")));
  sc.close();
 }
}