package lab_07_01;

public class ContractEmployee extends Employee {
    private int salary = 40000;

    @Override
    public int getSalary() {
        return salary;
    }
}
