import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        Employee employee;
        System.out.println("Введите количество работников:");
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.println("Работник №" + (i+1) + ":");
            employee = new Employee();
            System.out.print("Фамилия: ");
            employee.setLastName(scanner.next());
            System.out.print("Возраст: ");
            employee.setAge(scanner.nextInt());
            System.out.print("Образование: ");
            employee.setEducation(scanner.next());
            System.out.print("Должность: ");
            employee.setPosition(scanner.next());
            company.add(employee);
        }

        Company.printEmployeeData(company);


    }
}
