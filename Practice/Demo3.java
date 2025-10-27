package Practice;
import java.util.*;

//here getting the highest within the Object


class Role {

    String name;
    int salary;

    Role(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Role [name=" + name + ", salary=" + salary + "]";
    }

}


public class Demo3 {
  
    public static void main(String[] args) throws Exception{
     List<Role> roles = Arrays.asList( new Role("React Developer", 600), new Role("Python Developer", 800),
     new Role("DevOps Engineer", 1200),new Role("Java Developer", 900));

     Role r = roles.stream().max(Comparator.comparingInt(t-> t.salary)).orElseThrow(()->new Exception("No data present"));
     System.out.println("Higest is  " + r);
    }

}
