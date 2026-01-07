import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111, "Mayank"));
        employees.add(new Employee(131, "Anshul"));
        employees.add(new Employee(121, "Solanki"));
        employees.add(new Employee(101, "Aggarwal"));

        // Sort students by roll number
        Collections.sort(employees, new SortByEmployeeID());

        System.out.println("Sorted by Roll Number:");
        for (Employee s : employees) {
            System.out.println(s);
        }
    }
}
