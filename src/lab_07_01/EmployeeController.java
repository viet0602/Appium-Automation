package lab_07_01;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        EmployeeController employeeController = new EmployeeController();
        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();
        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        employeeList.add(contractEmployee1);
        employeeList.add(contractEmployee2);
        employeeList.add(fullTimeEmployee1);
        employeeList.add(fullTimeEmployee2);
        employeeList.add(fullTimeEmployee3);
        System.out.println("Total salary: " + employeeController.totalSalary(employeeList));
    }

    private int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = employee.getSalary() + totalSalary;
        }
        return totalSalary;
    }
}
