public class Employee {

    int employeeID;
    String name;

    Employee(int employeeID, String name){

        this.employeeID = employeeID;
        this.name = name;
    }

    @Override
    public String toString(){

        return employeeID + ": " + name;
    }
}
