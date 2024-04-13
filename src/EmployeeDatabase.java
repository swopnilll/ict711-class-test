import java.util.ArrayList;

public class EmployeeDatabase {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();


    public EmployeeDatabase(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public double getAverageSalary(){
        if(employeeList.isEmpty()) {
            return 0;
        }

        double totalSalary = 0;

        for(Employee emp : employeeList){
            totalSalary += emp.getSalary();
        }

        return totalSalary / employeeList.size();

    }

    public Employee getEmployeeById(int id){
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                return employee;
            }
        }

        return null;
    }

}
