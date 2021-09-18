import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab1 {

    public static Calendar parseStringToCalendarFormat(String str){
        String[] strDate = str.split("\\.");
        Calendar calendar;
        if(strDate.length == 3){
            int day = Integer.parseInt(strDate[0]);
            int month = Integer.parseInt(strDate[1]);
            int year = Integer.parseInt(strDate[2]);
            calendar = new GregorianCalendar(year, month , day);
        }
        else{
            throw new Error("Incorrect date format");
        }
        return calendar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 2;
//        Employees employees = new Employees(length);
//        Employee employee;
//        for(int i = 0; i < length; i++) {
//            System.out.println("Работник №" + (i+1) + ":");
//            employee = new Employee();
//            System.out.print("Фамилия: ");
//            employee.setLastName(scanner.next());
//            System.out.print("Возраст: ");
//            employee.setAge(scanner.nextInt());
//            System.out.print("Образование: ");
//            employee.setEducation(scanner.next());
//            System.out.print("Должность: ");
//            employee.setPosition(scanner.next());
//            employees.add(employee);
//        }
//
//        Employees.printEmployeeData(employees);

        Footballers footballers = new Footballers(length);

        Footballer footballer;
        Calendar dateOfBirth;
        for(int i = 0; i < length; i++) {
            System.out.println("Футболист №" + (i+1) + ":");
            footballer = new Footballer();
            System.out.print("Фамилия: ");
            footballer.setLastName(scanner.next());
            System.out.print("Дата рождения(в формате дд.мм.гггг): ");
            dateOfBirth = parseStringToCalendarFormat(scanner.next());
            footballer.setDateOfBirth(dateOfBirth);
            System.out.print("Место рождения: ");
            footballer.setBirthLocation(scanner.next());
            System.out.print("Роль: ");
            footballer.setRole(scanner.next());
            System.out.print("Количество игр: ");
            footballer.setGamesNumber(scanner.nextInt());
            System.out.print("Количество желтых карточек: ");
            footballer.setYellowCardNumber(scanner.nextInt());
            footballers.add(footballer);
        }
    }
}
