package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//find emplyee by department

class Employee{
    String name;
    String department;

   public Employee(String name,   String department){
     this.name = name;
     this.department = department;
   }

   @Override
   public String toString() {
    return "Employee [name=" + name + ", department=" + department + "]";
   }
    

}

public class Demo4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Rahul", "IT"),new Employee("Suman", "MANAGEMENT"),
        new Employee("Aksha", "MEDICAL"),new Employee("BASNATA", "IT")
        ,new Employee("Junita", "HR"),new Employee("Dipshika", "Hospitality"));

        List<Employee> group = employees.stream().filter(f->"IT".contentEquals(f.department)).collect(Collectors.toList());
        System.out.println("IT department People "+group);
    }

}
