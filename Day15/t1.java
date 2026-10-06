package Day15;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
class Employee{
  
    String name;
    int age;
    int date;
    int month;
    int year;
    Employee(String name,int age,int date,int month,int year){
        this.name=name;
        this.age=age;
        this.date=date;
        this.month=month;
        this.year=year;
    }
}
public class t1 {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee("Vinayak", 21, 14, 1, 2025),
                                                        new Employee("Sahil", 21, 01, 10, 2024));
                                        
        LocalDate today=LocalDate.now();                                            
        for(Employee e:list){
         LocalDate dob=LocalDate.of(e.year,e.month,e.date);
          Period age=Period.between(dob,today);

        System.out.println("For Employee: "+e.name);
         System.out.println("Years : "+age.getYears());
        System.out.println("Months : "+age.getMonths());
        System.out.println("Days : "+age.getDays());

        }
        
    }
    
}
