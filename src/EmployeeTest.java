import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pracownika:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj pensję pracownika:");
        double salary  = scanner.nextDouble();
        Employee employee = new Employee(firstName,lastName,salary);
    }
}