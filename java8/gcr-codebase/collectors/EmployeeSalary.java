import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class EmployeeSalary{
    static class Employee {
        private String name;
        private String department;
        private double salary;
        public Employee(String name, String department, double salary){
            this.name =name;
            this.department=department;
            this.salary=salary;
        }
        public String getDepartment(){
            return department;
        }
        public double getSalary(){
            return salary;
        }
    }
    public static void main(String[] args){
        List<Employee> employees=Arrays.asList(
            new Employee("Sarthak", "IT", 60000),
            new Employee("Shivam", "IT", 70000),
            new Employee("Sanjh", "HR", 50000),
            new Employee("Ayushhi", "HR", 55000),
            new Employee("Aman", "Finance", 65000)
        );
        Map<String, Double> avgSalaryByDept=
            employees.stream().collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));
        avgSalaryByDept.forEach((dept, avgSalary)->System.out.println(dept+" - "+avgSalary)
        );
    }
}
