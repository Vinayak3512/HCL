package Day15;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class a10 {
    public static void main(String[] args) throws Exception {
        try{
        String Date="05/10/2026";
        DateTimeFormatter dateTimeFormatter=java.time.format.DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate parse=LocalDate.parse(Date,dateTimeFormatter);
        System.out.println(parse);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
