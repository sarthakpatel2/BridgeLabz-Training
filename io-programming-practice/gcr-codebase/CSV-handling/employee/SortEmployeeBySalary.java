import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortEmployeeBySalary{
    //employee class
    static class Employee{
        int id;
        String name;
        String department;
        double salary;
        public Employee(int id, String name, String department, double salary){
            this.id=id;
            this.name=name;
            this.department=department;
            this.salary=salary;
        }
    }
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        String filePath="io-programming-practice/gcr-codebase/CSV-handling/employees.csv";
        String line;
        //read CSV file
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            //skip header row
            br.readLine();
            while ((line =br.readLine())!=null){
                String[] data=line.split(",");
                Employee emp=new Employee(
                    Integer.parseInt(data[0]),data[1],data[2],Double.parseDouble(data[3]));
                employees.add(emp);
            }
        }catch(IOException e){
            e.printStackTrace();
            return;
        }
        //sort employees by salary
        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee e1,Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });
        // print top 5 highest paid employees
        System.out.println("Top 5 Highest Paid Employees");
        System.out.println(" ");
        int limit=Math.min(5, employees.size());
        for (int i=0;i<limit;i++) {
            Employee e=employees.get(i);
            System.out.println("ID: "+e.id+", Name: "+e.name+", Department: "+e.department+", Salary: " + (int) e.salary);
        }
    }
}
