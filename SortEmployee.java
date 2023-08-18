import java.util.ArrayList;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("adi", 35, 40000));
        employeeList.add(new Employee("rani", 23, 35000));
        employeeList.add(new Employee("sunny", 20, 60000));
        employeeList.add(new Employee("satish", 15, 25000));
        employeeList.forEach(System.out::println);
    }
}

class Employee {

    private  String name;
    private  int age;
    private  double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
