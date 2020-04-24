public class Company {

    private Employee[] employees;
    private int employeeCount;

    public void add(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }

    public Employee get(int index) {
        return employees[index];
    }

    public Company() {
        employees = new Employee[3];
        employeeCount = 0;
    }
}
