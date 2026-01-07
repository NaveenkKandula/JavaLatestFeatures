import java.util.Comparator;

public class SortByEmployeeID implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.employeeID - b.employeeID; // Ascending order
    }
}
