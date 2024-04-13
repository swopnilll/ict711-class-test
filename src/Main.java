import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Swopnil Acharya", 100000);
        Employee emp2 = new Employee(2, "John Doe", 95000);
        Employee emp3 = new Employee(3, "Jane Smith", 105000);
        Employee emp4 = new Employee(4, "Alice Johnson", 110000);
        Employee emp5 = new Employee(5, "Bob Williams", 90000);
        Employee emp6 = new Employee(6, "Emily Davis", 98000);
        Employee emp7 = new Employee(7, "Michael Brown", 115000);
        Employee emp8 = new Employee(8, "Sophia Miller", 92000);
        Employee emp9 = new Employee(9, "William Wilson", 100500);
        Employee emp10 = new Employee(10, "Olivia Jones", 108000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);


        EmployeeDatabase employeeDatabase = new EmployeeDatabase(employeeList);


        System.out.println("Average Salary " +employeeDatabase.getAverageSalary());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your id");

        var employee = employeeDatabase.getEmployeeById(scanner.nextInt());

        System.out.println("Employee Detail: ");

        System.out.println("Employee Name: " +employee.getName());
        System.out.println("Employee Salary: " +employee.getSalary());
        System.out.println("Employee Id: " +employee.getId());

    }
}